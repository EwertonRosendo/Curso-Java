package ex001.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    private double total=0;

    public Order(){

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double total(){
        for (OrderItem c: items){
            total = total + c.getPrice();
        }
        return total;
    }
}
