package com.example.firstspringboot.model;

import com.alibaba.druid.sql.ast.AutoIncrementType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class People {
//    @TableId(type=IdType.AUTO)
    private Integer id;
    private String name;
    private char gender;
    private int age;
}
