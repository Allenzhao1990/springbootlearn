package com.itLearn.test;

import com.itLearn.Application;
import com.itLearn.domain.Person;
import com.itLearn.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by zhaowei on 2019/5/9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class PersonTest {


    @Autowired
    private PersonService personService;

    @Test
    public void findAllTest(){

        List<Person> list = personService.findAll();
        for(Person item:list){
            System.out.println(item);

        }
    }


    @Test
    public void insert(){

        Person person = new Person();
        person.setName("Lucy");
        person.setAge(18);
        person.setAddr("shenzhen");

        personService.save(person);

    }
}
