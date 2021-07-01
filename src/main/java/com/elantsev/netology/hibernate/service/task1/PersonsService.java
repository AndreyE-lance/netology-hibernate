package com.elantsev.netology.hibernate.service.task1;

import com.elantsev.netology.hibernate.entity.task1.User;
import com.elantsev.netology.hibernate.repository.task1.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
