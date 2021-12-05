package com.ejemplo.tiendaalamano.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class OrderModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable= false)
    private int total_value;

    @Column(length = 100, nullable= false)
    private Date date_order;

    @Column(length = 100, nullable= false)
    private Date date_deliver;

    @Column(length = 100, nullable= false)
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
}
