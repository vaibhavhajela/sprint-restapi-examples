package upgradbatch4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vaibhavhajela on 19/12/20.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue
    private long id;
    private String product;
    private String customer;
    private double price;


    public Order(long id, String product, String customer, double price) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.price = price;
    }


    public Order(){

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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", customer='" + customer + '\'' +
                ", price=" + price +
                '}';
    }



}
