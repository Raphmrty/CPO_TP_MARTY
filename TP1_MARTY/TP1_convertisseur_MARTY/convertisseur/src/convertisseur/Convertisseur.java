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
        System.out.println("Saisissez une valeur de temperature");
        double temperature = sc.nextDouble();
        System.out.println("La convertion de la temperature en degre celcius en degre kelvin donne : " + CelciusVersKelvin (temperature) + " K " );
        System.out.println("La convertion de la temperature en degre kelvin en degre celcius donne : " + KelvinVersCelcius (temperature) + " C ");
        System.out.println("La convertion de la temperature en degre farenheit en degre celcius donne : " + FarenheitVersCelcius (temperature) + " C ");
        System.out.println("La convertion de la temperature en degre celcius en degre farenheit donne : " + CelciusVersFarenheit (temperature) + " F ");
        System.out.println("La convertion de la temperature en degre kelvin en degre farenheit donne : " + KelvinVersFarenheit (temperature) + " F ");
        System.out.println("La convertion de la temperature en degre farenheit en degre kelvin donne : " + FarenheitVersKelvin (temperature) + " K ");
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
