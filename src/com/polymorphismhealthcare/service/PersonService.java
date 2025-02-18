package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

    Scanner scanner = new Scanner(System.in);

    Map<String , Person> persons = new HashMap<>();

    void printPerson(Person person) {
        System.out.println(person);
    }

    public Person createPerson() {

        System.out.println("please enter person Id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter firstName");
        String firstName = scanner.nextLine();

        System.out.println("please enter lastName");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        Long contactNo = Long.parseLong(scanner.nextLine());

        System.out.println("please enter alternate mobile");
        Long alternateMobile = Long.parseLong(scanner.nextLine());

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(contactNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        persons.put(String.valueOf(1),person);
        return person;

    }

    public void displayPerson() {
        Set<Map.Entry<String, Person>> entrySet = persons.entrySet();
        for (Map.Entry<String, Person> personEntry : entrySet) {
            System.out.println("key: "+personEntry.getKey()+"values: "+personEntry.getValue());
        }
    }
}
