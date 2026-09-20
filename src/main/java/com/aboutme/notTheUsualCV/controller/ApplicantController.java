package com.aboutme.notTheUsualCV.controller;

import com.aboutme.notTheUsualCV.model.entity.dto.ApplicantResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ApplicantController {

    @GetMapping("/api/mats")
    public ApplicantResponse getApplicant(){
        return new ApplicantResponse(
                "Mats Arras",
                "Technical SAP Specialist",
                31,
                "Junior SAP BTP Consultant / Architect",
                "Duesseldorf",
                "Hallo Frau Brar und liebes FORTIS Team, über ein Gespräch freue ich mich sehr!"
        );
    }

}
