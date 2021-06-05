package bongda.System;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncrytedPasswordUtils {
    public static String encrytePassword(String pass){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return  encoder.encode(pass);
    }
}
