/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_marty;

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
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        double temperature1 = 25.0; // 25 degrés Celsius
        double temperature2 = 68.0; // 68 degrés Fahrenheit

        // Effectuer des conversions avec le premier objet convertisseur1
        double celcius1 = convertisseur1.CelciusVersKelvin(temperature1);
        double kelvin1 = convertisseur1.KelvinVersFarenheit(temperature1);
        double farenheit1 = convertisseur1.FarenheitVersCelcius(temperature1);
      
        // Effectuer des conversions avec le deuxième objet convertisseur2
        double celcius2 = convertisseur2.FarenheitVersCelcius(temperature2);
        double kelvin2 = convertisseur2.FarenheitVersKelvin(temperature2);
        double farenheit2 = convertisseur2.CelciusVersKelvin(temperature2);
        System.out.println("Conversion 1 (convertisseur1) : " + kelvin1 + " K, " + celcius1 + " F");
        System.out.println("Conversion 2 (convertisseur2) : " + celcius2 + " C, " + kelvin2 + " K");

        // Afficher le nombre de conversions effectuées par chaque objet
        System.out.println(convertisseur1);
        System.out.println(convertisseur2);
    }
    
}
