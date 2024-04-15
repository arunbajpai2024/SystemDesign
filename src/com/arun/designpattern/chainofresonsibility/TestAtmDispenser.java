package com.arun.designpattern.chainofresonsibility;

import java.util.Scanner;

public class TestAtmDispenser {

    public static void main(String[] args) {
        AtmDispenser atmDispenser = new AtmDispenser();

        while (true) {
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10");
                continue;
            }
            atmDispenser.getDispenserChain().dispense(new Currency(amount));
        }
    }
}
