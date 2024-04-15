package com.mycompany.app;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashExample {
    public static void main(String[] args) {
        String input = "Hello, world kdflksdjfklsdjflsk sdfslkjdfsldfjlskdfslfdkfjlskjflskjfs  dfsfsdfsdfsdfsdfsfsd skljsdkdjkjdskjflksd   lksjdfkl lkjsflkjldfsfssffsdf\nhkjjsfdhhskjfhdjkfds!";
        String input2  = "Hello, world kdflksdjfklsdjflsk sdfslkjdfsldfjlskdfslfdkfjlskjflskjfs sl;kfds;lfk lkjsflkjldfsfssffsdf\nhkjjsfdhhskjfhdjkfds!";
        try {
            // Create MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Update the digest with input data
            digest.update(input.getBytes());

            // Generate the hash value
            byte[] hash = digest.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Print the hexadecimal representation of the hash
            System.out.println("Hash value (SHA-256): " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Hash algorithm not supported");
            e.printStackTrace();
        }
        try {
            // Create MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Update the digest with input data
            digest.update(input2.getBytes());

            // Generate the hash value
            byte[] hash = digest.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
    
            // Print the hexadecimal representation of the hash
            System.out.println("Hash value (SHA-256): " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Hash algorithm not supported");
            e.printStackTrace();
        }

    }
}
