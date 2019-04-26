package edu.hbuas.cake.model.dao;

import edu.hbuas.cake.model.javabean.Order;
import edu.hbuas.cake.model.javabean.OrderDetail;

import java.util.List;

public interface OrderDAO {
    //根据用户id查询该用户所有订单
    public List<Order> listAllOrders(int userId);
    //添加一条订单
    public Order addOrder(Order order, List<OrderDetail> orderDetails);
    //根据订单id，更改订单状态
    public boolean updateOrder(int orderId, String status);

}