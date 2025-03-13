package com.cerd7.selectionProcess.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantData {
    private String salaryClaim;
    private String languageUsed;
    private Integer positionApplied;
    private Applicant applicant;

    ApplicantData(){
    }

    public String getSalaryClaim() {
        return salaryClaim;
    }

    public void setSalaryClaim(String salaryClaim) {
        this.salaryClaim = salaryClaim;
    }

    public String getLanguageUsed() {
        return languageUsed;
    }

    public void setLanguageUsed(String languageUsed) {
        this.languageUsed = languageUsed;
    }

    public Integer getPositionApplied() {
        return positionApplied;
    }

    public void setPositionApplied(Integer positionApplied) {
        this.positionApplied = positionApplied;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
