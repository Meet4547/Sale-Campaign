package com.example.Campaign.management.Model;

import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String title;
    private String description;
    private Double mrp;
    private Double currentPrice;
    private Double discount;
    private Integer inventory;
    private String formattedTime;

    @PrePersist
    private void prePersist() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.formattedTime = sdf.format(new Date(System.currentTimeMillis()));
    }
}
