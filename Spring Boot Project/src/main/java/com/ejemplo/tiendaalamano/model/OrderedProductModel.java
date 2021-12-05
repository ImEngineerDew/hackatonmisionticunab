package com.ejemplo.tiendaalamano.model;

import javax.persistence.*;

@Entity
@Table(name ="products_ordered")
public class OrderedProductModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private OrderModel order;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProductModel product;

    @ManyToOne(fetch = FetchType.LAZY)
    private CouponModel coupons;

    private int quantity;
    private int price;

    public CouponModel getCoupons() {
        return coupons;
    }

    public void setCoupons(CouponModel coupons) {
        this.coupons = coupons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderModel getOrder() {
        return order;
    }

    public void setOrder(OrderModel order) {
        this.order = order;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
