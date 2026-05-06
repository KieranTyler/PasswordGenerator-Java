/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator2026;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kieran.gordon
 */
public class PasswordGenerator2026 
{

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {

        System.out.print("Enter password length: ");
        int length = input.nextInt();

        String password = generatePassword(length);

        System.out.println("Generated Password: " + password);
    }

    static String generatePassword(int length) 
    {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@%!#$";
        Random random = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString();
    }
}

