package com.upgrad5;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vaibhavhajela on 20/12/20.
 */
@Repository
public class OrderRepository {
    Map<Long, Order> orderCache;

    public OrderRepository(){
        orderCache = new HashMap<>();
        Order defaultOrder = new Order(0,"Dummy",0, "Dummy");
        orderCache.put(defaultOrder.getId(),defaultOrder);
    }

    public List<Order> getOrders(){
        return new ArrayList<>(orderCache.values());
    }

    public Order addOrder(Order newOrder){
        return orderCache.put(newOrder.getId(), newOrder);
    }
}
