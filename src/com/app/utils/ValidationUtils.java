package com.app.utils;

public class ValidationUtils {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }
    
}