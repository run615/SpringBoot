package com.wangxs.service.impl;

import com.wangxs.mapper.PersonMapper;
import com.wangxs.pojo.Person;
import com.wangxs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }

    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> findAll() {
        return personMapper.selectAll();
    }
}
