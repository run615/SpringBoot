package com.wangxs.mapper;

import com.wangxs.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Desc
 * @Author wangxs
 * @CreateTime 2022/2/22
 */
@Mapper
public interface PersonMapper {

    List<Person> selectAll();
}
