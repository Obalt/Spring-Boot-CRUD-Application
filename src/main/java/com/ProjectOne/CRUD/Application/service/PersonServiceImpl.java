package com.ProjectOne.CRUD.Application.service;


import com.ProjectOne.CRUD.Application.dao.PersonDAO;
import com.ProjectOne.CRUD.Application.dto.request.PersonDTO;
import com.ProjectOne.CRUD.Application.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{


    @Autowired
    private PersonDAO personDAO;
    @Override
    public boolean savePersonInfoInDb(PersonDTO personDTO) {
        Person person = initializePerson( personDTO);
        Person saved = personDAO.save(person);
        return false;
    }

    private Person initializePerson(PersonDTO personDTO) {
        Person person = new Person();
        person.setName (personDTO.getName());
        person.setMobile(personDTO.getMobile());
        person.setDob(personDTO.getDob());
        return person;
    }
}
