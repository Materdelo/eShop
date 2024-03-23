package com.eShop.Backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userSurname;
    private Date DOB;
    private String email;
    private String password;
    private String userCreditCard;
    private String CVV;

}
