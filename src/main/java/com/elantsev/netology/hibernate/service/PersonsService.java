package com.elantsev.netology.hibernate.service;

import com.elantsev.netology.hibernate.entity.User;
import com.elantsev.netology.hibernate.repository.JpaPersonRepository;
import com.elantsev.netology.hibernate.repository.PersonsRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonsService {
    private final JpaPersonRepository personsRepository;

    public PersonsService(JpaPersonRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public String getPersonByCity(String city){
        List<User> resultList = personsRepository.fndByCity(city);
        var result = new StringBuilder();
        for(User u:resultList){
            result.append(u.toString());
        }
        return result.toString();
    }

    public String getPersonByAgeLessThan(int age){
        List<User> resultList = personsRepository.fndByAge(age);
        var result = new StringBuilder();
        for(User u:resultList){
            result.append(u.toString());
        }
        return result.toString();
    }

    public String getPersonByNameAndSurname(String name, String surname){
        return personsRepository.fndByFullName(name, surname).orElseThrow(()->new EntityNotFoundException("Такого пользователя нет")).toString();
    }

    public String getPersonBySurname(String surname){
        return personsRepository.fndBySurname(surname).orElseThrow(()->new EntityNotFoundException("Такого пользователя нет")).toString();
    }

}