package cn.tfp.api.controller;

import cn.tfp.model.entity.User;
import cn.tfp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("query")
    public User getUser () {
        return userService.getUser();
    }
}
