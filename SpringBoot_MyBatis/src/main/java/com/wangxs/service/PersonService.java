package com.wangxs.service;

import com.wangxs.pojo.Person;

import java.util.List;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
public interface PersonService {
    List<Person> findAll();
}
