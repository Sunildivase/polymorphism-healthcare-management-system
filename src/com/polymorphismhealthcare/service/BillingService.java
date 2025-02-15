package com.polymorphismhealthcare.service;

import java.util.Scanner;

public class BillingService {







    public void calculateBill(int bill){

        System.out.println("bill "+ bill);
    }

    public void calculateBill(int bill,int totalBill){
        System.out.println("total bill "+ (bill+totalBill));
    }
}
