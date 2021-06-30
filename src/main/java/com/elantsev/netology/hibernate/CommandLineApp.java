package com.elantsev.netology.hibernate;

import com.elantsev.netology.hibernate.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class CommandLineApp implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder()
                .name("Vasia")
                .surname("Pupkin")
                .age(18)
                .city_of_living("Moscow")
                .phone_number("1234")
                .build());
        userList.add(User.builder()
                .name("Alexey")
                .surname("Li")
                .age(18)
                .city_of_living("Moscow")
                .phone_number("4321")
                .build());
        userList.add(User.builder()
                .name("Masha")
                .surname("Parkinson")
                .age(18)
                .city_of_living("Omsk")
                .phone_number("111111")
                .build());

        for (User entity: userList) {
            entityManager.persist(entity);
        }
    }
}
