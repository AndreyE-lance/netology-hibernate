package com.elantsev.netology.hibernate.controller;

import com.elantsev.netology.hibernate.service.PersonsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonsController {
    private final PersonsService personsService;

    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/by-city")
    public String getPersonsByCity(String city) {
        return personsService.getPersonByCity(city);
    }

    @GetMapping("/persons/by-age")
    public String getPersonsByAgeLessThan(int age) {
        return personsService.getPersonByAgeLessThan(age);
    }

    @GetMapping("/persons/by-name-surname")
    public String getPersonsByNameAndSurname(String name, String surname) {
        return personsService.getPersonByNameAndSurname(name, surname);
    }


}
