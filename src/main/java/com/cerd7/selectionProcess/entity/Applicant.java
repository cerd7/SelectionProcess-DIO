package com.cerd7.selectionProcess.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Applicant {
    @JsonProperty("Name")
    private String applicantName;
    @JsonProperty("Age")
    private Integer applicantAge;
    @JsonProperty("Cellphone")
    private String applicantCellphone;
    @JsonProperty("More data")
    private ApplicantData applicantData;

    Applicant(){
    }

    Applicant(String applicantName, Integer applicantAge, String applicantCellphone, ApplicantData applicantData){
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
        this.applicantCellphone = applicantCellphone;
        this.applicantData = applicantData;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Integer getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(Integer applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getApplicantCellphone() {
        return applicantCellphone;
    }

    public void setApplicantCellphone(String applicantCellphone) {
        this.applicantCellphone = applicantCellphone;
    }
}
