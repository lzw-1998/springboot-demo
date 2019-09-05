package com.hanz.stuspringdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanz.stuspringdemo.domain.User;
import com.hanz.stuspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    @ResponseBody
    public Object addUser(@RequestParam String json) throws Exception {
        User user = new ObjectMapper().readValue(json, User.class);
        boolean flag = userService.addUser(user);
        Map<String, Object> result = new HashMap<String, Object>();
        if (flag) {
            result.put("code", 0);//成功
        } else {
            result.put("code", -1);
        }
        return result;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public Object getUserById(@RequestParam String json) throws Exception{
        User user= new ObjectMapper().readValue(json, User.class);
        user = userService.getUserById(user.getId());
        Map<String, Object> result = new HashMap<String, Object>();
        if(user != null){
            result.put("code", 0);//成功
            result.put("dept", user);
        }else{
            result.put("code", -1);
        }
        return result;
    }

    @RequestMapping("/delUserById")
    @ResponseBody
    public Object delUserById(@RequestParam String json) throws Exception{
        User user = new ObjectMapper().readValue(json, User.class);
        boolean flag = userService.delUserById(user.getId());
        Map<String, Object> result = new HashMap<String, Object>();
        if(flag){
            result.put("code", 0);//成功
        }else{
            result.put("code", -1);
        }
        return result;
    }


    @RequestMapping("/updUser")
    @ResponseBody
    public Object updUser(@RequestParam String json) throws Exception{
        User user = new ObjectMapper().readValue(json, User.class);
        boolean flag = userService.updUser(user);
        Map<String, Object> result = new HashMap<String, Object>();
        if(flag){
            result.put("code", 0);//成功
        }else{
            result.put("code", -1);
        }
        return result;
    }
}
