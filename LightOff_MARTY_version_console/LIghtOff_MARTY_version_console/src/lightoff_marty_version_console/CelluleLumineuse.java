/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;

import java.util.Random;

/**
 *
 * @author marty
 * Rôle du programme : classe CelluleLumineuse, son rôle est de gérer l'état des cellules de la grille de jeu.
 */
public class CelluleLumineuse {
    public static Random randomGenerator = new Random();
    private int etat;
    /*
    * etat est désormais un entier compris entre 0 et 2:
    * 0 est équivalent à l'ancien "false", est à dire éteint ; 1 est équivalent à l'ancien "true" c'est à dire allumé; 2 est un etat intermédiaire, "semi-allumé"
     */
    
    
    /**
     * Lorsque une cellule est créée son état vaut par défaut 0 qui correspond à une cellule éteinte, elle pourra prendre deux autres états différents.
     */
    public CelluleLumineuse() {
        etat = 0;
    }
    
    /**
     * Change l'état d'une cellule
     * Depend du niveau de difficulté:
     * Facile (1) ou Normal(2) : l'état reste soit allumé, soit éteint
     * Difficile (3) : l'état prend une valeur aléatoire entre 
     * 0 et 2, il peut donc être éteint, allumé ou intermédaire.
     */
    public void activerCellule() {
        if (Partie.nivDifficult()==1 || Partie.nivDifficult()==2) { // la méthode nivDifficult() prend trois valeurs possibles, 1 = facile ; 2 = normal ; 3 = difficile
            if (etat == 0) {
                etat = 1;
            } else {
                etat = 0;
            }
        } else {
            switch (etat) {
                case 0:
                    etat=randomGenerator.nextInt(1, 3);
                    break;
                case 2:
                    etat=randomGenerator.nextInt(1);
                    break;
                default:
                    while(etat==1){
                        etat=randomGenerator.nextInt(3);
                    break;
                    }
            }
        }
    }
    /**
     *
     * @return Retourne l'état actuel de la cellule
     */
    public int getEtat() {
        return etat;
    }
    
    /**
     * Change l'état de la cellule en 0/=éteint
     */
    public void eteindreCellule() {
        if(etat!=0){
            etat=0;
        }
    }
    
    /**
     * Verifie que l'état de la cellule vaut "0"
     *
     * @return Renvoie "true" si l'état est 0 et "false" sinon
     */
    public boolean estEteint() {
        if (etat != 0) {
            return false;
        } else {
            return true;
        }
    }
    
     /**
     * Cette méthode permet d'attribuer à chaque état un signe distinctif dans la grille affichée dans la console.
     *
     * @return Retourne "0" si son état = 0, "X" si son état = 1, ou "#" si 
     * son état = 2
     */
    @Override
    public String toString() {
        switch (this.etat) {
            case 0:
                return " O ";
            case 1:
                return " X ";
            default:
                return " # ";
        }
    }


}





