package com.elantsev.netology.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="persons")
public class User{
    @EmbeddedId
    private UserID userID;
    private String phoneNumber;
    private String cityOfLiving;
}
