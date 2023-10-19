/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
public class Epee extends Arme {
    private int finesse;

    // Constructeur de Epee
    public Epee(String nom, int nivAtq, int finessE) {
        super(nom, nivAtq);
        finesse = finessE;
    }

    // Méthode pour obtenir l'indice de finesse de l'épée
    public int getFinesse() {
        return finesse;
    }
    // Méthode pour contraindre les valeurs de finesse saisies
    public void setFinesse(int finesse) {
        if (finesse < 0) {
            this.finesse = 0;
        }
        else if(finesse > 100) {
            this.finesse = 100;
        }
        else {
            this.finesse = finesse;
        }
    }
}

