package com.forrestlmj.businessportraits.dao;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class BaseChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String companyUnique;
    private String number;
    private String changeDate;
    private String changeProject;
    private String beforeId;
    private String beforeText;
    private String beforeTextEm;
    private String beforeTextLink;
    private String afterId;
    private String afterText;
    private String afterTextEm;
    private String afterTextLink;
    private String createDate;
}
