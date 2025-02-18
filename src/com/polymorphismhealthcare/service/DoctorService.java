package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoctorService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<String , Doctor> doctors = new HashMap<>();

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public void createDoctor(){

    }

    public void displayDoctor(){

    }
}
