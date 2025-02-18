package com.polymorphismhealthcare;

import java.util.Scanner;

public class PolymorphismHealthcareDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do{
            System.out.println("---------healthcare-management-system----------");
            System.out.println("1. create person");
            System.out.println("2. create doctor");
            System.out.println("3. create hospital");
            System.out.println("4. create department");
            System.out.println("5. create appointment");
            System.out.println("6. create prescription");
            System.out.println("7. create billing");
            System.out.println("please select the option");
            option = Integer.parseInt(scanner.nextLine());

            switch(option){
                case 1:
                    System.out.println("person created successfully");
                    break;

                case 2:
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    System.out.println("department created successfully");
                    break;

                case 5:
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    System.out.println("prescription created successfully");
                    break;

                case 7:
                    System.out.println("billing created successfully");
                    break;

                default:
                    System.out.println("please enter valid option");
                    break;
            }
        }while(option!=0);{
            System.out.println("Thank you !!!");
        }

    }
}
