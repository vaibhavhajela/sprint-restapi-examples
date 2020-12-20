package com.upgrad5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vaibhavhajela on 20/12/20.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue
    private long id;
    private  String product;
    private double price;
    private String address;

    public Order(){

    }

    public Order(long id, String product, double price, String address) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

}
