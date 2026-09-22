package com.aboutme.notTheUsualCV.controller;

import com.aboutme.notTheUsualCV.model.entity.dto.ApplicantResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


@RestController

public class ApplicantController {

    @GetMapping(
            value="/api/mats",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ApplicantResponse getApplicant(){
        return new ApplicantResponse(
                "Mats Arras",
                "Technical SAP Specialist",
                31,
                "Junior SAP BTP Consultant / Architect",
                "Düsseldorf",
                "Hallo Frau Brar und liebes FORTIS Team, ich freue mich auf ein Gespräch!"
        );
    }

}
