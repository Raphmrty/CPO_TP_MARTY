/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP0
 * Date : 18/09/23
 */
public class Calculator {

    public static void main(String[] args) {
    System.out.println("Please enter the operator : ");
        System.out.println("1) add ");
        System.out.println("2) subtract ");
        System.out.println("3) multiply ");
        System.out.println("4) divide ");
        System.out.println("5) modulo ");
        
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Invalid operator. Please enter a number between 1 and 5.");
            return; // Exit the program
        }
        
        int operande1 = 0;
        System.out.println("Enter the first number: ");
        operande1 = sc.nextInt();
        
        int operande2 = 0;
        System.out.println("Enter the second number: ");
        operande2 = sc.nextInt();
        
        int result = 0;
        
        if (operateur == 1) {
            result = operande1 + operande2;
        } else if (operateur == 2) {
            result = operande1 - operande2;
        } else if (operateur == 3) {
            result = operande1 * operande2;
        } else if (operateur == 4) {
            if (operande2 != 0) {
                result = operande1 / operande2;
            } else {
                System.out.println("Division by zero is not allowed.");
                return; // Exit the program
            }
        } else if (operateur == 5) {
            result = operande1 % operande2;
        }
        
        System.out.println("The result of the operation is: " + result);
    }
}

