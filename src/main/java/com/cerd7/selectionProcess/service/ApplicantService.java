package com.cerd7.selectionProcess.service;

public interface ApplicantService {
    void readApplicants();
    void addApplicant(String applicantName, Integer applicantAge, String applicantCellphone, String salaryClaim, String languageUsed, String positionApplied);
}
