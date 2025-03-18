package com.cerd7.selectionProcess.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantData {
    private String salaryClaim;
    private String languageUsed;
    private String positionApplied;

    public ApplicantData(){
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

    public String getPositionApplied() {
        return positionApplied;
    }

    public void setPositionApplied(String positionApplied) {
        this.positionApplied = positionApplied;
    }
}
