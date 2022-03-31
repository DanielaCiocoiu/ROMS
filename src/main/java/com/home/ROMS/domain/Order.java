package com.home.ROMS.domain;

import com.home.ROMS.domain.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String billNo;
    private String menu;
    private int quantity;
    private String orderedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "join_order_product",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_product"))
    private Set<Product> products = new HashSet<>();

    @OneToOne
    private Payment payment;

    public Order() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(String orderedTime) {
        this.orderedTime = orderedTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id && quantity == order.quantity && Objects.equals(billNo, order.billNo) && Objects.equals(menu, order.menu) && Objects.equals(orderedTime, order.orderedTime) && Objects.equals(user, order.user) && Objects.equals(products, order.products) && Objects.equals(payment, order.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, billNo, menu, quantity, orderedTime, user, products, payment);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", billNo='" + billNo + '\'' +
                ", menu='" + menu + '\'' +
                ", quantity=" + quantity +
                ", orderedTime='" + orderedTime + '\'' +
                ", user=" + user +
                ", products=" + products +
                ", payment=" + payment +
                '}';
    }
}
