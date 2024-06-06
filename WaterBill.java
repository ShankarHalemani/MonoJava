package com.techlabs.ifelse;

import java.util.Scanner;

public class WaterBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of units used");
        int numOfUnits = sc.nextInt();
        int meterCharge = 75;
        int charge = 0;

        if (numOfUnits <= 100) {
            charge = numOfUnits * 5;
        } else if (numOfUnits <= 250) {
            charge = numOfUnits * 10;
        } else (numOfUnits > 250) {
            charge = numOfUnits * 20;
        }

        int totalWaterBill = charge + meterCharge;
        System.out.println("Total water bill : " + totalWaterBill);
        sc.close();
    }
}
