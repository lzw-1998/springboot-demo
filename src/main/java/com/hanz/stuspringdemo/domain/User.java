package com.hanz.stuspringdemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private Integer id;

    private String my_name;

    private String password;

    private Double sal;


}
