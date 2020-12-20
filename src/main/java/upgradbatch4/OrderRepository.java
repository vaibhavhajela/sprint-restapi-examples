package upgradbatch4;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by vaibhavhajela on 19/12/20.
 */
@Repository
public class OrderRepository {

    private HashMap<Long,Order> orders = new HashMap<>();

    public OrderRepository(){
        Order order  = new Order(1,"Smartphone","vaibhav",100);
        orders.put(order.getId(),order);
    }

    public List<Order> getOrders(){
        return new ArrayList<>(orders.values());
    }

    public Order addOrder(Order newOrder){
        return orders.put(newOrder.getId(),newOrder);
    }

}
