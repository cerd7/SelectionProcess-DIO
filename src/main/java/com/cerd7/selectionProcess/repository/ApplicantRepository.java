package com.cerd7.selectionProcess.repository;

import com.cerd7.selectionProcess.entity.Applicant;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApplicantRepository {
    private final File PATH_FILE = new File("src/main/resources/Applicants.json");
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

    public void addApplicant(Applicant newApplicant)
    {
        ObjectMapper objMapper = new ObjectMapper();
        try
        {
            if(PATH_FILE.exists() && PATH_FILE.length() > 0)
            {
                applicants = objMapper.readValue(PATH_FILE, objMapper.getTypeFactory().constructCollectionType(List.class, Applicant.class));
                applicants.add(newApplicant);
                objMapper.writeValue(PATH_FILE, applicants);
                System.out.println("User added successfully");
            }else{
                applicants = new ArrayList<>();
                applicants.add(newApplicant);
                objMapper.writeValue(PATH_FILE, applicants);
                System.out.println("New file created and user added successfully");
            }
        }catch (Exception e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
        applicants.add(newApplicant);
    }
}
