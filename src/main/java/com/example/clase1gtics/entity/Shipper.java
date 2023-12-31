package com.example.clase1gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "shippers")
@Getter
@Setter
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shipperId;

    @Column(name = "companyname",nullable = false,length = 40)
    private String companyname;

    private String phone;
}
