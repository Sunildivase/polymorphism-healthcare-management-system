package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Department;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class DepartmentService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<Integer, Department> departments = new HashMap<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public void createDepartment(){

    }
    public void displayDepartment(){

    }
}
