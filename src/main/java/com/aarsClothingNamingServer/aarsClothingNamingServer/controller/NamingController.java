package com.aarsClothingNamingServer.aarsClothingNamingServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamingController {

    @RequestMapping("/check")
    public String check(){
        return "Eureka Working";
    }
}
