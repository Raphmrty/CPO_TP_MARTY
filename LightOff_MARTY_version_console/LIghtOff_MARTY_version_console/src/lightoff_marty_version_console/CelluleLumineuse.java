/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;

/**
 *
 * @author marty
 */
public class CelluleLumineuse {
    private boolean etat = false;

    public CelluleLumineuse(boolean etat) {
        this.etat = etat;
    }
    
    public void activerCellule() {
        if(etat==false) {
            etat=true;
        }
        else if (etat==true) {
            etat=false;
        }
    }
    public void eteindreCellule() {
        if (etat==true) {
            etat = false;
        }
        else {
            etat=false;
        }
    }
    public boolean estEteint() {
        if (etat==false) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean getEtat() {
        if (etat==true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (etat==true) {
            return " X ";
        }else {
            return " O ";
        }
        
    }
    
}
