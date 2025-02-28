package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Prescription;
import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrescriptionService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer, Prescription> prescriptions = new HashMap<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription(){

        System.out.println("please enter prescriptionId");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);

        prescriptions.put(prescriptionId,prescription);
        return prescription;
    }
    public void displayPrescription(){

        Set<Map.Entry<Integer, Prescription>> entrySet = prescriptions.entrySet();
        for(Map.Entry<Integer , Prescription> prescriptionEntry: entrySet){
            System.out.println("key: "+prescriptionEntry.getKey()+" "+"value: "+prescriptionEntry.getValue());
        }
    }
}
