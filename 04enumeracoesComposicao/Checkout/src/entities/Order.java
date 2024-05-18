package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment = new Date();
    private OrderStatus status;
    private Client client;
    List<OrderItem> items = new ArrayList<>();

    public Order(Client client, OrderStatus status) {
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client + "\n");

        double total = 0;

        // i esta recebendo os objetos da classe OrderItem para "vasculhar" pela lista items
        for (OrderItem i : items) {
            sb.append(i + "\n");
            total =+ i.subTotal();
        }
        sb.append("Total price: $" + total);
        return sb.toString();
    }
}
