package com.zengfeng.service.Impl;

import com.zengfeng.dao.PersonMapper;
import com.zengfeng.domain.Person;
import com.zengfeng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/3/8.
 */

@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return  personMapper.selectByPrimaryKey(id);
    }

    @Override
    public Person selectByName(String name) {
        return personMapper.selectByName(name);
    }


}
