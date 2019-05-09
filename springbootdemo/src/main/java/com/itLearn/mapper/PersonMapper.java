package com.itLearn.mapper;

import com.itLearn.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhaowei on 2019/5/9.
 */
@Mapper
public interface PersonMapper {

    public int save(Person person);

    public List<Person> findAll();
}
