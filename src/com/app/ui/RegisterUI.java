package com.app.ui;

import java.util.Scanner;

import com.app.service.UserService;

public class RegisterUI {
    
    public static void register() {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        boolean success = service.ragister(username, email, password);

        if(success) {
            System.out.println("Registration Successfully! ");
        } else {
            System.out.println("Registration Failed! ");
        }
        sc.close();
    }
}