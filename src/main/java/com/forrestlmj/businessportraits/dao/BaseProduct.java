package com.forrestlmj.businessportraits.dao;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class BaseProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productUnique;
    private String productName;
    private String productUrl;
    private String financingInformation;
    private String date;
    private String Address;
    private String pruductInfo;
    private String createdTime;
}
