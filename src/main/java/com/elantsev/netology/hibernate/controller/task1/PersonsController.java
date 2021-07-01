package com.elantsev.netology.hibernate.controller.task1;

import com.elantsev.netology.hibernate.service.task1.PersonsService;
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
    public String getPersonsByCity( String city){
        return personsService.getPersonByCity(city);
    }
}
