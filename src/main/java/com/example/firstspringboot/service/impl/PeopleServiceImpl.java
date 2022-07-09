package com.example.firstspringboot.service.impl;

/**
 * @author all
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.firstspringboot.mapper.PeopleMapper;
import com.example.firstspringboot.model.People;
import com.example.firstspringboot.service.IPeopleService;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper,People> implements IPeopleService {

}
