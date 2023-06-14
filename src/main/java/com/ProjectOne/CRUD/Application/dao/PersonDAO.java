package com.ProjectOne.CRUD.Application.dao;

import com.ProjectOne.CRUD.Application.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {
}
