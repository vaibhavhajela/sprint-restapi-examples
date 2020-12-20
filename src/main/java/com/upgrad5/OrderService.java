package com.upgrad5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vaibhavhajela on 20/12/20.
 */
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> getOrders(){
        return orderRepository.getOrders();
    }

    public Order createOrder(Order newOrder){
        newOrder.setPrice(0.9 * newOrder.getPrice());
        return orderRepository.addOrder(newOrder);
    }
}
