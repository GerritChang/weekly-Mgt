package com.gerritchang.weeklymgtsys.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String toLogin(String username,String password){
        return null;
    }
}
