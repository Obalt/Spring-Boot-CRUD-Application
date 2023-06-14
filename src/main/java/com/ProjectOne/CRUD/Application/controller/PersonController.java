package com.ProjectOne.CRUD.Application.controller;


import com.ProjectOne.CRUD.Application.dto.request.PersonDTO;
import com.ProjectOne.CRUD.Application.dto.response.CommonResponse;
import com.ProjectOne.CRUD.Application.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired

    private PersonService personService;

    @PostMapping ("/")

    public ResponseEntity<CommonResponse>  addPerson (@RequestBody PersonDTO personDTO){

       if (personService.savePersonInfoInDb(personDTO))

           return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200", "Person details has been saved successfully"));
        return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200", "Unable to save person details"));


    }
}
