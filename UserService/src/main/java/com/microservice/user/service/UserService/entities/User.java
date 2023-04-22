package com.microservice.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "micro_users")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "ID",unique = true)
    private String userId;

    @Column(name = "NAME",length = 30)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ABOUT")
    private String about;

    @Transient  //basically, it means that we dont want to save this into the database. basically JPA will ignore this.
    private List<Rating>ratings;



}
