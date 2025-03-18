package com.cerd7.selectionProcess.service.serviceIMP;

import com.cerd7.selectionProcess.entity.Applicant;
import com.cerd7.selectionProcess.entity.ApplicantData;
import com.cerd7.selectionProcess.repository.ApplicantRepository;
import com.cerd7.selectionProcess.service.ApplicantService;

public class ApplicantServiceImp implements ApplicantService {
    ApplicantRepository applicantRepository = new ApplicantRepository();

    @Override
    public void readApplicants() {
        System.out.println("Reading applicants");
    }

    @Override
    public void addApplicant(String applicantName, Integer applicantAge, String applicantCellphone, String salaryClaim, String languageUsed, String positionApplied) {
        Applicant applicant = new Applicant();
        ApplicantData applicantData = new ApplicantData();

        applicant.setApplicantName(applicantName);
        applicant.setApplicantAge(applicantAge);
        applicant.setApplicantCellphone(applicantCellphone);

        applicantData.setSalaryClaim(salaryClaim);
        applicantData.setLanguageUsed(languageUsed);
        applicantData.setPositionApplied(positionApplied);

        applicant.setApplicantData(applicantData);

        applicantRepository.addApplicant(applicant);
    }
}
