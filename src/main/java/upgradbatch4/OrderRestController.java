package upgradbatch4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaibhavhajela on 19/12/20.
 */

@RestController
public class OrderRestController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getorders")
    List<Order> getAllOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/createorder")
    @ResponseBody
    Order createOrder(@RequestBody Order newOrder){
        return orderService.createOrder(newOrder);
    }

}
