package com.cerd7.selectionProcess;

import com.cerd7.selectionProcess.repository.ApplicantRepository;

public class Main {
    public static void main(String[] args) {
        ApplicantRepository app = new ApplicantRepository();
        app.readApplicants();
    }
}