package com.itLearn.controller;

import com.itLearn.domain.Person;
import com.itLearn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaowei on 2019/5/9.
 */

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/list")
    public List<Person> list(){

        return personService.findAll();
    }

}
