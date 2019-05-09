package com.itLearn.service.impl;

import com.itLearn.domain.Person;
import com.itLearn.mapper.PersonMapper;
import com.itLearn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaowei on 2019/5/9.
 */

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonMapper personMapper;


    @Override
    public int save(Person person) {
        return personMapper.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }
}
