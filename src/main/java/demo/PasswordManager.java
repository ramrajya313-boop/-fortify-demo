package demo;

import java.security.MessageDigest;

public class PasswordManager {

    public byte[] hash(String password) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");

        return md.digest(password.getBytes());

    }

}