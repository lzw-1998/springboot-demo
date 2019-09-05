package com.hanz.stuspringdemo.controller;

import com.hanz.stuspringdemo.config.jedis.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestRestController {
    @RequestMapping("/restTest/{name}")
    public Object test1(@PathVariable String name){
        return "hello"+name;
    }


    @Autowired
    private JedisUtil jedis;
    @RequestMapping("/testJedis/{val}")
    public Object testJedis(@PathVariable String val){
        jedis.set("key-"+val,val);
        return "testJedis_OK";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/getJDBC/{id}")
    public Object getJDBC(@PathVariable Integer id){
        String sql = "select * from test where id = "+id;
        Map<String,Object> data = jdbcTemplate.queryForMap(sql);
        return data;
    }


}
