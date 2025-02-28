package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Hospital;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class HospitalService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer,Hospital > hospitals = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        System.out.println("please enter email");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setAddress(address);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        hospitals.put(hospitalId, hospital);
        return hospital;

    }

    public void displayHospital(){

        Set<Map.Entry<Integer, Hospital>> entrySet = hospitals.entrySet();
        for(Map.Entry<Integer, Hospital > hospitalentry : entrySet){
            System.out.println("key: "+hospitalentry.getKey()+" "+"value: "+hospitalentry.getValue());
        }

    }

//    public void addHospital(){
//        Hospital hospital = new Hospital();
//        Hospital addedHospital = hospitals.put(hospital.getHospitalId(), hospital);
//        System.out.println("hospital added :"+addedHospital);
//    }

    public Hospital deleteHospital(int hospitalId){
       Hospital removedHospital = hospitals.remove(hospitalId);
       System.out.println("removed hospital: "+ removedHospital);
       return removedHospital;
    }


}
