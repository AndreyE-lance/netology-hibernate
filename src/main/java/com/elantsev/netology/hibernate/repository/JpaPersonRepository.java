package com.elantsev.netology.hibernate.repository;

import com.elantsev.netology.hibernate.entity.User;
import com.elantsev.netology.hibernate.entity.UserID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaPersonRepository extends JpaRepository<User, UserID> {
    List<User> findByCityOfLiving(String city);

    List<User> findByUserIDAgeLessThan(int age);

    Optional<User> findByUserIDNameAndUserIDSurname(String name, String surname);
}
