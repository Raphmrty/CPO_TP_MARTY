/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_marty;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_Bieres
 * Date : 03/10/23 

 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) Brasserie : " + brasserie ) ;}
    
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
        
    }
    public void Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La biere est ouverte");
        } else {
            System.out.println("erreur : biere deja ouverte");
        }
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? "; 
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
    }

}

