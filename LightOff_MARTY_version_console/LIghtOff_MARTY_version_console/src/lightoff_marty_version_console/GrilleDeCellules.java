/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;

/**
 *
 * @author marty
 */
public class GrilleDeCellules {
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
    }
    
    public void genererNouvelleMatriceCellulesLumineuses(int nbLignes,int nbColonnes ) {
        matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
    }
    public void eteindreToutesLesCellules() {
        
    }
    public void activerLigneOuColonneAleatoire() {
        
    }
    public void genererMatriceAleatoire(int nbTours) {
        
    }
    
}

    
    
