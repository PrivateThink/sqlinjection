package com.zengfeng.service;

import com.zengfeng.domain.Person;

/**
 * Created by Administrator on 2020/3/8.
 */
public interface PersonService {

    Person selectByPrimaryKey(Integer id);

    Person selectByName(String name);
}
