package com.telusko.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private int prodId;
    private String proName;
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
