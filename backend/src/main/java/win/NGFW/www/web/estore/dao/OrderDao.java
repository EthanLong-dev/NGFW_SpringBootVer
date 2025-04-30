package win.NGFW.www.web.estore.dao;

import win.NGFW.www.web.estore.entity.Order;

import java.util.List;

public interface OrderDao {

    void insertOrder(Order order);

    List<Order> selectOrdersByUserId(Integer userId);

    Integer updateOrderStatus(Integer orderId, Integer orderStatus);

    List<Order> selectAllOrders();
}
