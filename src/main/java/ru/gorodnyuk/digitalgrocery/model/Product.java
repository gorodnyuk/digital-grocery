package ru.gorodnyuk.digitalgrocery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false, length = 2000)
    private String name;

    @Column(name = "cost", nullable = false)
    private BigDecimal cost;

    @Column(name = "balance", nullable = false)
    private Integer balance;
}
