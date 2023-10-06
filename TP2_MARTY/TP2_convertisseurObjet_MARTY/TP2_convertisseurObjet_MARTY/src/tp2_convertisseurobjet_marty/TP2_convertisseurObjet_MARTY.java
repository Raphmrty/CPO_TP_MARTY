/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_marty;

import java.util.Scanner;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_Convertisseur
 * Date : 03/10/23 
 
 */
public class TP2_convertisseurObjet_MARTY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, Saisissez une valeur : "); //demande de saisie d'une température à l'utilisateur
        double temperature = sc.nextDouble();
        
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();
        // Effectuer des conversions avec le premier objet convertisseur1
        double celcius1 = convertisseur1.CelciusVersKelvin(temperature);
        double kelvin1 = convertisseur1.KelvinVersFarenheit(temperature);
        double farenheit1 = convertisseur1.FarenheitVersCelcius(temperature);
      
        // Effectuer des conversions avec le deuxième objet convertisseur2
        double celcius2 = convertisseur2.FarenheitVersCelcius(temperature);
        double kelvin2 = convertisseur2.FarenheitVersKelvin(temperature);
        double farenheit2 = convertisseur2.CelciusVersKelvin(temperature);
        System.out.println("Conversion 1 (convertisseur1) : " + kelvin1 + " K, " + celcius1 + " F");
        System.out.println("Conversion 2 (convertisseur2) : " + celcius2 + " C, " + kelvin2 + " K");

        // Afficher le nombre de conversions effectuées par chaque objet
        System.out.println(convertisseur1);
        System.out.println(convertisseur2);
        
        
   
        sc = new Scanner(System.in);
        System.out.println("Bonjour, Saisissez une valeur : "); //demande de saisie d'une température à l'utilisateur
        double temp = sc.nextDouble();
        Convertisseur convertisseur3 = new Convertisseur ();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : " ); // l'utilisateur peut choisir entre 6 types de conversion
        System.out.println("1) De Celcius vers Kelvin ");
        System.out.println("2) De Kelvin vers Celcius ");
        System.out.println("3) De Farenheit vers Celcius ");
        System.out.println("4) De Celcius vers Farenheit ");
        System.out.println("5) De Kelvin vers Farenheit ");
        System.out.println("6) De Farenheit vers Kelvin");
        int operateur = sc.nextInt(); // variable de saisie des modes de conversion
        if (operateur < 1 || operateur > 6) {
            System.out.println("Syntaxe invalide. Veuillez choisir un chiffre entre 1 et 6 : "); // Si l'utilisateur n'écrit pas un chiffre entre 1 et 6, il est invité à réessayer
            return; // Exit the program
        }
        // selon le mode de conversion choisi, cela affiche à l'écran la conversion
        switch (operateur) {
            case 1:
                System.out.println(temperature + " degre Celcius est egal a  " + convertisseur3.CelciusVersKelvin (temp) + " degre Kelvin " );
                break;
            case 2:
                System.out.println(temperature + " degre Kelvin est egal a " + convertisseur3.KelvinVersCelcius (temp) + " degre Celcius ");
                break;
            case 3:
                System.out.println(temperature + " degre Farenheit est egal a " + convertisseur3.FarenheitVersCelcius (temp) + " degre Celcius ");
                break;
            case 4:
                System.out.println(temperature + " degre Celcius est egal a  " + convertisseur3.CelciusVersFarenheit (temp) + " degre Farenheit ");
                break;
            case 5:
                System.out.println(temperature + " degre Kelvin est egal a  " + convertisseur3.KelvinVersFarenheit (temp) + " degre Farenheit ");
                break;
            case 6:
                System.out.println(temperature + " degre Farenheit est egal a  " + convertisseur3.FarenheitVersKelvin (temp) + " degre Kelvin ");
                break;
            default:
                break;
        }
        System.out.println(convertisseur3);
    }
    
}
