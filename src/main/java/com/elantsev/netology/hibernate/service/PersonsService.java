package com.elantsev.netology.hibernate.service;

import com.elantsev.netology.hibernate.entity.User;
import com.elantsev.netology.hibernate.repository.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonsService {
    private final PersonsRepository personsRepository;

    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public String getPersonByCity(String city){
        List<User> resultList = personsRepository.getPersonsByCity(city);
        var result = new StringBuilder();
        for(User u:resultList){
            result.append(u.toString());
        }

        return result.toString();
    }

}
