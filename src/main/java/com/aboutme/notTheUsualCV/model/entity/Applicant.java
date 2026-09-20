package com.aboutme.notTheUsualCV.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Applicant {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String name;
    private String currentJob;
    private int age;
    private String appliedRole;
    private String preferredLocation;
    private String message;

    public Applicant(String name, String currentJob, int age, String appliedRole, String preferredLocation, String message){

        this.name = name;
        this.currentJob = currentJob;
        this.age = age;
        this.appliedRole = appliedRole;
        this.preferredLocation = preferredLocation;
        this.message = message;

    }
}
