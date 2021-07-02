package com.elantsev.netology.hibernate.repository;

import com.elantsev.netology.hibernate.entity.User;
import com.elantsev.netology.hibernate.entity.UserID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JpaPersonRepository extends JpaRepository<User, UserID> {

    @Query("select user from persons user where user.cityOfLiving = :city")
    List<User> fndByCity(String city);
    @Query("select user from persons user where user.userID.age<:age")
    List<User> fndByAge(int age);
    @Query("select user from persons user where user.userID.name=:name and user.userID.surname=:surname")
    Optional<User> fndByFullName(String name, String surname);
}
