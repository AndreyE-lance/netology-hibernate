package com.elantsev.netology.hibernate.controller;

import com.elantsev.netology.hibernate.service.PersonsService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/")
public class PersonsController {
    private final PersonsService personsService;

    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/by-city")
    @Secured("ROLE_READ")
    public String getPersonsByCity(String city) {
        return personsService.getPersonByCity(city);
    }

    @GetMapping("/persons/by-age")
    @RolesAllowed("ROLE_WRITE")
    public String getPersonsByAgeLessThan(int age) {
        return personsService.getPersonByAgeLessThan(age);
    }

    @GetMapping("/persons/by-name-surname")
    @PostAuthorize("hasRole('WRITE') or hasRole('DELETE')")
    public String getPersonsByNameAndSurname(String name, String surname) {
        return personsService.getPersonByNameAndSurname(name, surname);
    }

    @GetMapping("/persons/by-surname")
    @PreAuthorize("#username == authentication.principal.username")
    public String getPersonsBySurname(String surname, String username) {
        return personsService.getPersonBySurname(surname);
    }


}