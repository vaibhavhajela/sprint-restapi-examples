package com.upgrad5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaibhavhajela on 20/12/20.
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getorders")  //  http://localhost:8080/getorders - // HttpCLient (postman)GET - http://localhost:8080/getorders
    List<Order> getOrders(){
        return orderService.getOrders();
    }


    // Post - Add NewOrder
    @PostMapping("/createorder")
    @ResponseStatus(HttpStatus.CREATED)
    Order createOrder(@RequestBody  Order newOrder){
        return orderService.createOrder(newOrder);
    }
}
