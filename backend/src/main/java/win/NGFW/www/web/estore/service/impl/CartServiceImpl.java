package win.NGFW.www.web.estore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import win.NGFW.www.web.estore.dao.CartDao;
import win.NGFW.www.web.estore.dao.ItemDao;
import win.NGFW.www.web.estore.entity.Cart;
import win.NGFW.www.web.estore.entity.Item;
import win.NGFW.www.web.estore.entity.ItemInfo;
import win.NGFW.www.web.estore.service.CartService;

import java.util.List;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;
    @Autowired
    private ItemDao itemDao;

//    @Autowired
//    private ValueOperations<String, Object> valueOperations;

    @Cacheable(value = "cart", key = "#userId", cacheManager = "cacheManager")
    @Override
    public List<Cart> getCartListByUserId(Integer userId) {
        return cartDao.selectByUserId(userId);
    }

    @Cacheable(value = "iteminfo", key = "#itemInfoId", cacheManager = "cacheManager")
    @Override
    public ItemInfo getItemInfoByItemInfoId(Integer itemInfoId) {
        return itemDao.selectItemInfoByItemInfoId(itemInfoId);
    }

    //    @Cacheable(value = "item", key = "#itemId", cacheManager = "cacheManager")
    @Override
    public Item getItemByItemId(Integer itemId) {
        return itemDao.selectItemById(itemId);
    }

    @CacheEvict(value = "cart", key = "#userId", cacheManager = "cacheManager")
    @Override
    public Cart updateCartDetail(Cart newCart, Integer userId, Integer itemInfoId) {
        List<Object[]> list = cartDao.selectByUserIdAndItemInfoId(userId, itemInfoId);
        Cart oldCart = null;
        Integer itemStockInItemInfo = 0;
        Integer itemStatus = 0;
        String itemName = "";
        for (Object[] row : list) {
            oldCart = (Cart) row[0];
            itemStockInItemInfo = (Integer) row[1];
            itemStatus = (Integer) row[2];
            itemName = (String) row[3];
        }
        if (newCart.getDetailItemCount() > itemStockInItemInfo || itemStatus != 1) {
            newCart.setResult(false);
            if (itemStatus == 0) {
                newCart.setMessage("商品未上架"); // 應該不會有這個狀況，但寫來以防萬一
            } else if (itemStatus == -1) {
                newCart.setMessage("商品已下架，請選購其他商品");
            } else {
                newCart.setMessage("商品 " + itemName + " 數量剩餘: " + itemStockInItemInfo);
                newCart.setDetailItemCount(itemStockInItemInfo);
                oldCart.setDetailItemCount(itemStockInItemInfo);
                cartDao.editCart(oldCart);
            }
            return newCart;
        } else {
            oldCart.setDetailItemCount(newCart.getDetailItemCount());
            Cart cartUpdated = cartDao.editCart(oldCart);
            cartUpdated.setResult(true);
            cartUpdated.setMessage("商品數量更新成功");
            return cartUpdated;
        }
    }

    @CacheEvict(value = "cart", key = "#userId", cacheManager = "cacheManager")
    @Override
    public Integer deleteCartByUserIdAndItemInfoId(Integer userId, Integer itemInfoId) {
        Cart cart = new Cart();
        cart.setItemInfoId(itemInfoId);
        cart.setUserId(userId);
        return cartDao.deleteCartByUserIdAndItemInfoId(cart);
    }

    @CacheEvict(value = "cart", key = "#cart.userId", cacheManager = "cacheManager")
    @Override
    public Cart addItemInfoToCart(Cart cart) {

        List<Object[]> list = cartDao.selectByUserIdAndItemInfoId(cart.getUserId(), cart.getItemInfoId());

        if (list.isEmpty()) {
            Cart cartAdded = cartDao.addItemInfoToCart(cart);
            if (cartAdded != null) {
                cartAdded.setResult(true);
                cartAdded.setMessage("成功新增至購物車");
                return cartAdded;
            } else {
                Cart cartFailed = new Cart();
                cartFailed.setResult(false);
                cartFailed.setMessage("新增至購物車失敗");
                return cartFailed;
            }
        } else if (list.size() == 1) {
            Cart oldCart = null;
            Integer itemStockInItemInfo = 0;
            Integer itemStatus = 0;
            for (Object[] row : list) {
                oldCart = (Cart) row[0];
                itemStockInItemInfo = (Integer) row[1];
                itemStatus = (Integer) row[2];
            }
            if (cart.getDetailItemCount() > itemStockInItemInfo || itemStatus != 1) {
                cart.setResult(false);
                if (itemStatus == 0) {
                    cart.setMessage("商品未上架"); // 應該不會有這個狀況，但寫來以防萬一
                } else if (itemStatus == -1) {
                    cart.setMessage("商品已下架，請選購其他商品");
                } else {
                    cart.setMessage("商品數量剩餘: " + itemStockInItemInfo);
                }
                return cart;
            } else {
                oldCart.setDetailItemCount(cart.getDetailItemCount());
                Cart cartUpdated = cartDao.editCart(oldCart);
                cartUpdated.setResult(true);
                cartUpdated.setMessage("購物車已有該商品，商品數量更新成功");
                return cartUpdated;
            }
        } else {
            Cart cartFailed = new Cart();
            cartFailed.setResult(false);
            cartFailed.setMessage("新增至購物車失敗，請聯絡管理員");
            return cartFailed;
        }

    }
}
