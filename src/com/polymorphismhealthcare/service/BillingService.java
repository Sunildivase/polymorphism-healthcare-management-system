package com.polymorphismhealthcare.service;

import com.polymorphismhealthcare.model.Billing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BillingService {

    private static final Scanner scanner = new Scanner(System.in);

    Map<String , Billing> billings = new HashMap<>();

    public Billing createBilling(){

        System.out.println("please enter BillingId");
        int billId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person Id");
        int personId = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setBillId(billId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billing.setPersonId(personId);

        billings.put(String.valueOf(billId),billing);
        return billing;
    }

    public void displayBilling(){

        Set<Map.Entry<String , Billing>> entrySet = billings.entrySet();
        for(Map.Entry<String ,Billing> billingEntry: entrySet){
            System.out.println("key: "+billingEntry.getKey()+" "+"value: "+billingEntry.getValue());
        }

    }

    public void calculateBill(int bill){

        System.out.println("overloading polymorphism bill "+ bill);
    }

    public void calculateBill(int bill,int totalBill){
        System.out.println("overloading polymorphism total bill "+ (bill+totalBill));
    }
}
