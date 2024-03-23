package com.eShop.Backend.controllers;

import com.eShop.Backend.entity.User;
import com.eShop.Backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;

    //register user

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(
            String username,
            String userSurname,
            Date dob,
            String email,
            String password,
            String userCreditCard,
            String CVV){

        user.setUserName(username);
        user.setUserSurname(userSurname);
        user.setDOB(dob);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserCreditCard(userCreditCard);
        user.setCVV(CVV);

        if(user.getEmail() == email){
            return ResponseEntity.badRequest().body("User allready exist");
        }

        userRepository.save(user);

        return ResponseEntity.ok("Created user");
    }

    //login user

    //przypomnij haslo

}
