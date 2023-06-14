package com.ProjectOne.CRUD.Application.service;

import com.ProjectOne.CRUD.Application.dto.request.PersonDTO;

public interface PersonService {
    boolean savePersonInfoInDb(PersonDTO personDTO);
}
