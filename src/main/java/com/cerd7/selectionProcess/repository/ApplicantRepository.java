package com.cerd7.selectionProcess.repository;

import com.cerd7.selectionProcess.entity.Applicant;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class ApplicantRepository {
    private final String PATH_FILE ="src/main/resources/Applicants.json";
    private List<Applicant> applicants;

    public void readApplicants(){
        ObjectMapper objMapper = new ObjectMapper();
        try {
            applicants = objMapper.readValue(PATH_FILE, objMapper.getTypeFactory().constructCollectionType(List.class, Applicant.class));
            for(Applicant readApplicant : applicants){
                System.out.println(readApplicant.getApplicantName());
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
