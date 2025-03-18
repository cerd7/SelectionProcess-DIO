package com.cerd7.selectionProcess;

import com.cerd7.selectionProcess.controller.ApplicantController;

public class Main {
    public static void main(String[] args) {
        ApplicantController applicantController = new ApplicantController();
        applicantController.addApplicant();
    }
}