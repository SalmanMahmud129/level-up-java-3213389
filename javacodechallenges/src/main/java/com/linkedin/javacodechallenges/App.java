package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        int upperCase = 0;
        int lowerCase = 0;
        int length = 0;
        int number = 0;

        // char[] ch = password.toCharArray(); 
        

        for(int i = 0; i < password.length(); i++ ){
            length++;
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase++;
            }else if (Character.isLowerCase(ch)){
                lowerCase++;
            }else if(Character.isDigit(ch)){
                number++;
            }

        }

        return upperCase > 0 && lowerCase > 0 && length >= 6 && number > 0;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
