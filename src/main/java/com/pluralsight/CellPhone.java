package com.pluralsight;

import java.util.Scanner;

class CellPhoneApp {
    public static void main(String[] args) {

        CellPhoneApplication myPhone = new CellPhoneApplication();


        Scanner input = new Scanner(System.in);


        System.out.print("What is the serial number? ");
        myPhone.setSerialNumber(input.nextInt());

        input.nextLine();

        System.out.print("What model is the phone? ");
        myPhone.setModel(input.nextLine());

        System.out.print("Who is the carrier? ");
        myPhone.setCarrier(input.nextLine());

        System.out.print("What is the phone number? ");
        myPhone.setPhoneNumber(input.nextLine());

        System.out.print("Who is the owner of the phone? ");
        myPhone.setOwner(input.nextLine());


        System.out.println("\nPhone details:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}

