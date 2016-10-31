package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by chenwenbin on 30/09/2016.
 */
@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }
    public Person(Long id,String name,Integer age,String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Person createPerson(String name, String address, Integer age) {
        Person p = new Person();
        p.setName(name);
        p.setAddress(address);
        p.setAge(age);
        return p;
    }
}
