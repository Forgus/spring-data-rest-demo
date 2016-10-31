package com.example.dao;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by chenwenbin on 30/09/2016.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    Person findByNameStartsWith(String name);

    List<Person> findByAddress(String address);

    Person findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name = :name and p.address = :address")
    Person wishNameAndAddressQuery(@Param("name")String name,@Param("address")String address);

}
