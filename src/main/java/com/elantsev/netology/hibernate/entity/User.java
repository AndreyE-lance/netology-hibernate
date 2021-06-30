package com.elantsev.netology.hibernate.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="persons")
public class User implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;

    private String phone_number;
    private String city_of_living;
}

