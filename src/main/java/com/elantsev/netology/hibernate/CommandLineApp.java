package com.elantsev.netology.hibernate;

import com.elantsev.netology.hibernate.entity.User;
import com.elantsev.netology.hibernate.entity.UserID;
import com.elantsev.netology.hibernate.repository.JpaPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private JpaPersonRepository jpaPersonRepository;

    @Override
    @Transactional
    public void run(String... args) {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder()
                .userID(UserID
                        .builder()
                        .name("Vasia")
                        .surname("Pupkin")
                        .age(18).build())
                .cityOfLiving("Moscow")
                .phoneNumber("1234")
                .build());
        userList.add(User.builder()
                .userID(UserID
                        .builder()
                        .name("Alexey")
                        .surname("Li")
                        .age(18).build())
                .cityOfLiving("Moscow")
                .phoneNumber("4321")
                .build());
        userList.add(User.builder()
                .userID(UserID
                        .builder()
                        .name("Masha")
                        .surname("Parkinson")
                        .age(18).build())
                .cityOfLiving("Omsk")
                .phoneNumber("111111")
                .build());
        userList.add(User.builder()
                .userID(UserID
                        .builder()
                        .name("Olga")
                        .surname("Altzgamer")
                        .age(17).build())
                .cityOfLiving("Pinsk")
                .phoneNumber("1111112")
                .build());

       jpaPersonRepository.saveAll(userList);
    }
}
