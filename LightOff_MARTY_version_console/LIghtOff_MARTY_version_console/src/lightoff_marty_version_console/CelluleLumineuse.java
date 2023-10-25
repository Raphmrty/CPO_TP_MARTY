/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;

/**
 *
 * @author marty
 * Rôle du programme : classe CelluleLumineuse, son rôle est de gérer l'état des cellules de la grille de jeu.
 */
public class CelluleLumineuse {
    private boolean etat = false;

    /**
     * Initialisation de l'état des cellules à l'état eteint.
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     * Cette méthode permet d'inverser l'état actuel de la cellule, si elles téteinte, elle devient allumée, et inversement.
     */
    public void activerCellule() {
        if(etat==false) {
            etat=true;
        }
        else if (etat==true) {
            etat=false;
        }
    }

    /**
     * Cette méthode permet d'éteindre une cellule si elle est éteinte.
     */
    public void eteindreCellule() {
        if (etat==true) {
            etat = false;
        }
        else {
            etat=false;
        }
    }

    /**
     * Cette méthode permet de vérifier si la cellule est actuellement éteinte, la méthode est donc booléenne elle retourne true ou false.
     * @return
     */
    public boolean estEteint() {
        if (etat==false) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Cette méthode renvoie l'état actuel de la cellule, c'est une méthode booléenne, elle renvoie true si la cellule est allumée et false si la cellule est éteinte
     * @return
     */
    public boolean getEtat() {
        if (etat==true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cette méthode affiche "X" si la cellule est allumée et "O" si la cellule est éteinte.
     * @return
     */
    @Override
    public String toString() {
        if (etat==true) {
            return " X ";
        }else {
            return " O ";
        }
        
    }
    
}
