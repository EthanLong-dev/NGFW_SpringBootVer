package win.NGFW.www.web.estore.service;

import win.NGFW.www.web.estore.entity.Cart;
import win.NGFW.www.web.estore.entity.Item;
import win.NGFW.www.web.estore.entity.ItemInfo;

import java.util.List;

public interface CartService {

    List<Cart> getCartListByUserId(Integer userId);

    ItemInfo getItemInfoByItemInfoId(Integer itemInfoId);

    Item getItemByItemId(Integer itemId);

    Cart updateCartDetail(Cart newCart, Integer userId, Integer itemInfoId);

    Integer deleteCartByUserIdAndItemInfoId(Integer userId, Integer itemInfoId);

    Cart addItemInfoToCart(Cart cart);
}
