package com.ejemplo.tiendaalamano.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrdersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int total_value;
    private Date date_order;
    private Date date_deliver;
    private String payForm;

    @ManyToOne(fetch = FetchType.LAZY) //Por cada orden tiene un usuario, pero un usuario tiene muchas ordenes
    private UserModel user;

    @ManyToOne(fetch = FetchType.LAZY)
    private PayModel payment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotal_value() {
        return total_value;
    }

    public void setTotal_value(int total_value) {
        this.total_value = total_value;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public Date getDate_deliver() {
        return date_deliver;
    }

    public void setDate_deliver(Date date_deliver) {
        this.date_deliver = date_deliver;
    }

    public String getPayForm() {
        return payForm;
    }

    public void setPayForm(String payForm) {
        this.payForm = payForm;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public PayModel getPayment() {
        return payment;
    }

    public void setPayment(PayModel payment) {
        this.payment = payment;
    }
}

