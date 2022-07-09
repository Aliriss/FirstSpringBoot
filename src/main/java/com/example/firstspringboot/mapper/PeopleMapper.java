package com.example.firstspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.firstspringboot.model.People;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author all
 */
@Mapper
public interface PeopleMapper extends BaseMapper<People> {
}
