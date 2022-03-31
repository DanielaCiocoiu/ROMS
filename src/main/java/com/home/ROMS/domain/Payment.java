package com.home.ROMS.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int total;

    @OneToOne
    private Order order;

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return total == payment.total && Objects.equals(id, payment.id) && Objects.equals(order, payment.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, order);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", total=" + total +
                ", order=" + order +
                '}';
    }
}
