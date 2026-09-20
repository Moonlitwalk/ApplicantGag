package com.aboutme.notTheUsualCV.model.entity.dto;

public record ApplicantResponse (
        String name,
        String currentJob,
        int age,
        String appliedRole,
        String preferredLocation,
        String message
){}
