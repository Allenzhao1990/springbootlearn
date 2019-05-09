package com.itLearn.service;

import com.itLearn.domain.Person;
import com.itLearn.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhaowei on 2019/5/9.
 */
public interface PersonService {

    int save(Person person);

    List<Person> findAll();
}
