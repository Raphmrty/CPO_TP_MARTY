/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
import Personnages.*;
/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
public abstract class Arme {
    String nom;
    int nivAtq;
    Personnages proprietaire; // Ajout de la propriété "proprietaire"

    public Arme(String nom1, int nivAtq1) {
        nom = nom1;
        nivAtq = nivAtq1;
    }

    public void setProprietaire(Personnages personnage) {
        proprietaire = personnage;
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return nivAtq;
    }

    // Méthode pour contraindre les valeurs d'attaque saisies
    public void setLvlAtq(int nivAtq) {
        if (nivAtq < 0) {
            this.nivAtq = 0;
        } else if (nivAtq > 100) {
            this.nivAtq = 100;
        } else {
            this.nivAtq = nivAtq;
        }
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + nivAtq + " points d'attaque)";
        if (proprietaire != null) {
            chaine_a_retourner += " - Propriétaire : " + proprietaire.getNom();
        }
        return chaine_a_retourner;
    }
}


    
