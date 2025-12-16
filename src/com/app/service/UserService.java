package com.app.service;

import com.app.dao.UserDAO;
import com.app.model.User;
import com.app.utils.PasswordUtil;
import com.app.utils.ValidationUtils;


public class UserService {
    
    private UserDAO dao = new UserDAO();

    public boolean register(String username, String email, String password) {

        if (ValidationUtils.isEmpty(username) ||
           ValidationUtils.isEmpty(email) ||
            ValidationUtils.isEmpty(password)) {
                System.out.println("All fields required");
                return false;
        }

        if (!ValidationUtils.isEmailValid(email)) {
            System.out.println("Invalid email!");
            return false;
        }
        
        String inputHash = PasswordUtil.hashPassword(password);
        User user = new User(username, email, inputHash);

        return dao.register(user);
    }

    public boolean login(String username, String password) {
        String storeHash = dao.getPasswordByUsername(username);

        if(storeHash == null) {
            return false;
        }

        String inputHash = PasswordUtil.hashPassword(password);
        return storeHash.equals(inputHash);
    }
}
