package com.eShop.Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userSurname;
    private Date DOB;
    private String email;
    private String password;
    private String userCreditCard;
    private String CVV;

}
