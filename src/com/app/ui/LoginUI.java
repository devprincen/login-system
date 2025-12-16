package com.app.ui;

import java.util.Scanner;

import com.app.service.UserService;

public class LoginUI {
    
    public static void login() {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if(service.login(username, password)) {
            System.out.println("Login succesfully! ");
        } else {
            System.out.println("Invalid Credentials! ");
        }
        sc.close();
    }
}
