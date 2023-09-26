/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur;

import java.util.Scanner;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP1_convertisseur
 * Date : 26/09/23 
 */
public class Convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, Saisissez une valeur : ");
        double temperature = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : " );
        System.out.println("1) De Celcius vers Kelvin ");
        System.out.println("2) De Kelvin vers Celcius ");
        System.out.println("3) De Farenheit vers Celcius ");
        System.out.println("4) De Celcius vers Farenheit ");
        System.out.println("5) De Kelvin vers Farenheit ");
        System.out.println("6) De Farenheit vers Kelvin");
        int operateur = sc.nextInt();
        if (operateur < 1 || operateur > 6) {
            System.out.println("Syntaxe invalide. Veuillez choisir un chiffre entre 1 et 6 : ");
            return; // Exit the program
        }
        if (operateur == 1) {
            System.out.println(temperature + " degre Celcius est egal a  " + CelciusVersKelvin (temperature) + " degre Kelvin " );
        } else if (operateur == 2) {
            System.out.println(temperature + " degre Kelvin est egal a " + KelvinVersCelcius (temperature) + " degre Celcius ");
        } else if (operateur == 3) {
            System.out.println(temperature + " degre Farenheit est egal a " + FarenheitVersCelcius (temperature) + " degre Celcius ");
        } else if (operateur == 4) {
            System.out.println(temperature + " degre Celcius est egal a  " + CelciusVersFarenheit (temperature) + " degre Farenheit ");
        } else if (operateur == 5) {
            System.out.println(temperature + " degre Kelvin est egal a  " + KelvinVersFarenheit (temperature) + " degre Farenheit ");
        } else if (operateur == 6) {
        System.out.println(temperature + " degre Farenheit est egal a  " + FarenheitVersKelvin (temperature) + " degre Kelvin ");
        }
    }
    public static double CelciusVersKelvin (double tCelcius) {
        return (tCelcius + 273.15);
    }
    public static double KelvinVersCelcius (double tKelvin) {
        return (tKelvin - 273.15);
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        return ((tFarenheit-32)*5.0/9);
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        return ((tCelcius*1.8)+32);
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        return (KelvinVersCelcius(CelciusVersFarenheit(tKelvin)));
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        return (FarenheitVersCelcius(CelciusVersKelvin(tFarenheit)));
    }
    
}

