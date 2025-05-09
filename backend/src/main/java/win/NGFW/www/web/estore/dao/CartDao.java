package win.NGFW.www.web.estore.dao;

import win.NGFW.www.web.estore.entity.Cart;

import java.util.List;

public interface CartDao {
    List<Cart> selectByUserId(Integer userId);

    List<Object[]> selectByUserIdAndItemInfoId(Integer userId, Integer itemInfoId);

    Cart editCart(Cart newCart);

    Integer deleteCartByUserIdAndItemInfoId(Cart cart);

    Cart addItemInfoToCart(Cart cart);
}
