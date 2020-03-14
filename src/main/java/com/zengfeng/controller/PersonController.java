package com.zengfeng.controller;

import com.zengfeng.domain.Person;
import com.zengfeng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/3/8.
 */

@Controller
@RequestMapping(value = "/user")
public class PersonController {
    @Autowired
    private PersonService personService;

    @ResponseBody
    @GetMapping("/select")
    public Person selectByPrimaryKey(@RequestParam(name = "id",required = true)Integer id){
        return  personService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @GetMapping("/name")
    public Person selectByName(@RequestParam(name = "name",required = true)String name){
        Person person=  personService.selectByName(name);
        System.out.println(person);
        return person;
    }


}
