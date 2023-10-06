/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_marty;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_Convertisseur
 * Date : 03/10/23 
 * 
 */

public class Convertisseur {
    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin (double tCelcius) {
        ++nbConversions;
        return (tCelcius + 273.15);
    }
    public double KelvinVersCelcius (double tKelvin) {
        ++nbConversions;
        return (tKelvin - 273.15);
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        ++nbConversions;
        return ((tFarenheit-32)*5.0/9);
    }
    public double CelciusVersFarenheit (double tCelcius) {
        ++nbConversions;
        return ((tCelcius*1.8)+32);
    }
    public double KelvinVersFarenheit (double tKelvin) {
  
        return (KelvinVersCelcius(CelciusVersFarenheit(tKelvin)));
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        return (FarenheitVersCelcius(CelciusVersKelvin(tFarenheit)));
    }
    
    @Override
    public String toString() {
        return "Nombre de conversions effectuees : " + nbConversions;
    }

} 




