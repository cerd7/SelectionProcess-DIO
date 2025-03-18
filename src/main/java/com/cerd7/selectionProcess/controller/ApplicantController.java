package com.cerd7.selectionProcess.controller;

import com.cerd7.selectionProcess.service.serviceIMP.ApplicantServiceImp;

import java.util.Scanner;

public class ApplicantController
{
    Scanner sc = new Scanner(System.in);
    ApplicantServiceImp applicantServiceImp = new ApplicantServiceImp();

    public void addApplicant() {
        System.out.println("Name: ");
        String applicantName = sc.nextLine();
        System.out.println("Age: ");
        Integer applicantAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Cellphone: ");
        String applicantCellphone = sc.nextLine();
        System.out.println("Salary claim: ");
        String salaryClaim = sc.nextLine();
        System.out.println("Language used: ");
        String languageUsed = sc.nextLine();
        System.out.println("Position applied: ");
        String positionApplied = sc.nextLine();

        applicantServiceImp.addApplicant(applicantName, applicantAge, applicantCellphone, salaryClaim, languageUsed, positionApplied);
    }
}
