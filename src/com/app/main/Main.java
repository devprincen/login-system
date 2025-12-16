package com.app.main;

import java.util.Scanner;

import com.app.ui.LoginUI;
import com.app.ui.RegisterUI;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n----Login & Register system----\n");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter option: ");
            int opt = sc.nextInt();
            sc.nextLine();
            
            switch (opt) {
                case 1 -> RegisterUI.register();
                case 2 -> LoginUI.login();
                case 3 -> System.exit(0);

                default -> System.out.println("Enter Valid option! "); 
            }
        sc.close();
        }        
    }
     
}