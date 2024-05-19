package com.prateek.FirstSpringBootApp.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user/{userID}")
    public String getUserData(@PathVariable("userID") String userID,
                              @RequestParam("age") String age) {
        return "Prateek Sharma having user id " + userID + " and age: " + age ;
    }
}
