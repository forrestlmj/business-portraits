package com.forrestlmj.businessportraits.dao;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class BaseShareholderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String companyUnique;
    private String shareholderUnique;
    private String Shareholder;
    private String shareholdingRatio;
    private String subscriptionAmount;
    private String fundingDate;
    private String createdTime;
}
