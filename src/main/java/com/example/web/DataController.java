package com.example.web;

import com.example.dao.PersonRepository;
import com.example.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenwenbin on 30/09/2016.
 */
@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name,String address,Integer age) {
        Person p = personRepository.save(Person.createPerson(name,address,age));
        return p;
    }

}
