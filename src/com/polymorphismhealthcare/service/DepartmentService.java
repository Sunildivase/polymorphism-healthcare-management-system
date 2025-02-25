package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Department;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class DepartmentService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer, Department> departments = new HashMap<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public Department createDepartment(){

        System.out.println("please enter id");
        int deptId =Integer.parseInt(scanner.nextLine());

        System.out.println("please enter dept name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospitalId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);

        departments.put(deptId,department);
        return department;
    }
    public void displayDepartment(){

        Set<Map.Entry<Integer,Department>> entrySet = departments.entrySet();
        for(Map.Entry<Integer,Department> departmentEntry: entrySet){
            System.out.println("key: "+departmentEntry.getKey()+" "+"value: "+departmentEntry.getValue());
        }
    }

    public void displayDepartment(String deptName){
        System.out.println("departments: "+ deptName);
    }
}
