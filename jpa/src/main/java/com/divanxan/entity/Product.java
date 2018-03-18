package com.divanxan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name ="product")
public class Product implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "code")
    @Getter
    @Setter
    private String code;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "brand")
    @Getter
    @Setter
    private String brand;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "unit_price")
    @Getter
    @Setter
    private double unitPrice;

    @Column(name = "quantity")
    @Getter
    @Setter
    private int quantity;

    @Column(name = "is_active")
    @Getter
    @Setter
    private boolean active;

    @Column(name = "category_id")
    @Getter
    @Setter
    private int categoryId;

    @Column(name = "supplier_id")
    @Getter
    @Setter

    private int supplierId;

    @Column(name = "purchases")
    @Getter
    @Setter
    private int purchases;

    @Column(name = "views")
    @Getter
    @Setter
    private int views;

    public Product() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.getUnitPrice(), getUnitPrice()) == 0 &&
                getQuantity() == product.getQuantity() &&
                isActive() == product.isActive() &&
                getCategoryId() == product.getCategoryId() &&
                getSupplierId() == product.getSupplierId() &&
                getPurchases() == product.getPurchases() &&
                getViews() == product.getViews() &&
                Objects.equals(getCode(), product.getCode()) &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getBrand(), product.getBrand()) &&
                Objects.equals(getDescription(), product.getDescription());
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, getCode(), getName(), getBrand(), getDescription(), getUnitPrice(), getQuantity(), isActive(), getCategoryId(), getSupplierId(), getPurchases(), getViews());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", active=" + active +
                ", categoryId=" + categoryId +
                ", supplierId=" + supplierId +
                ", purchases=" + purchases +
                ", views=" + views +
                '}';
    }

}