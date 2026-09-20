/*
package com.aboutme.notTheUsualCV.service;

import com.aboutme.notTheUsualCV.model.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aboutme.notTheUsualCV.repository.ApplicantRepository;


@Service
public class ApplicantService {
    
    @Autowired
    ApplicantRepository repo;

    public Applicant findApplicantById(Long id){
        return repo.findById(id).orElse(null);
    }
    public Applicant addNewApplicant(Applicant newbie){
        repo.save(newbie);
        return newbie;
    }
}

*/
