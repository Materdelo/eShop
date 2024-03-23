package com.eShop.Backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDTO implements Serializable {
    private Integer userId;
    private String userName;
    private String userSurname;
    private Date DOB;
    private String email;
    private String password;
    private String userCreditCard;
    private String CVV;
}
