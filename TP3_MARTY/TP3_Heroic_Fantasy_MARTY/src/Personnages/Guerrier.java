/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
    public class Guerrier extends Personnages {  
    boolean cheval;
    public static int nbGuerriers;
    

    public Guerrier(String nom, int hp, boolean chevaL) {
        super(nom, hp);
        cheval = chevaL;
        nbGuerriers ++;
    }
    
    public void finalize(){
    nbGuerriers = nbGuerriers - 1;
}

    @Override
    public String toString() {
        if (this.Arme_en_main == null) {
            if (cheval == true) {
                return "Guerrier "+ nom + " (" + hp + " points de vie), a cheval";
            }
            else {
                return "Guerrier "+ nom + " (" + hp + " points de vie), a pieds";
            }
        }
        else {
            if (cheval == true) {
                return "Guerrier "+ nom + " (" + hp + " points de vie), a cheval est equipe de "+ Arme_en_main;
            }
            else {
                return "Guerrier "+ nom + " (" + hp + " points de vie), a pieds est equipe de " + Arme_en_main;
            }
        }
    }
}
