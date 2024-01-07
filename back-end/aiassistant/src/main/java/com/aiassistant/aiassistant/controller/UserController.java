package com.aiassistant.aiassistant.controller;

import com.aiassistant.aiassistant.entity.User;
import com.aiassistant.aiassistant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/login")
    @ResponseBody
    public void login() {
//        return "Login Page";
    }

    @PostMapping("/login")
    public ModelAndView login(User user) {
        if (userService.validate(user)) {
            return new ModelAndView("redirect:/home");
        } else {
            return new ModelAndView("redirect:/login");
        }
    }
}
