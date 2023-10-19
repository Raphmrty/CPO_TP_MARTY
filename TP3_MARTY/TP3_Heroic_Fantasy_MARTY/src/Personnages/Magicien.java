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
public class Magicien extends Personnages {
    boolean conf;
    public static int nbMagiciens;
    
    
    public Magicien (String nom, int hp, boolean conF) {
        super(nom, hp);
        conf = conF;
        nbMagiciens ++;
    }
    
    public void finalize(){
    nbMagiciens = nbMagiciens - 1;
}

    @Override
    public String toString() {
        if (this.Arme_en_main == null) {
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirme";
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice";
            }
        }
        else {
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirme est equipe de "+ Arme_en_main;
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice est equipe de " + Arme_en_main;
            }
        }
    }
}
