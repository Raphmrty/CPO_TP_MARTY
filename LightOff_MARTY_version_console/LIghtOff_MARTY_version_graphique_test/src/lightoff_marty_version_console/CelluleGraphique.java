/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : donner aux cellules lumineuses une interface graphique
 * Date : 06/11/23
 * 
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur; //largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    
    
    // constructeur (appelé depuis FenetrePrincipale)

    /**
     * Cette méthode permet de définir la taille, la forme et la couleur des cellules graphiques
     * @param celluleLumineuseAssociee
     * @param largeur
     * @param hauteur
     */
public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, 
int hauteur) {
 this.largeur = largeur;
 this.hauteur = hauteur;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 // Methode gérant le dessin de la cellule 
 @Override
 protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.etat == 0) {
 g.setColor(Color.red); // couleur rouge pour l'état éteint
 } else if (celluleLumineuseAssociee.etat==1){
 g.setColor(Color.green); // couleur vert pour l'état allumé
 } else {
 g.setColor(Color.yellow); // couleur jaune pour l'état intermédiaire
 }
 g.fillOval(2, 2, w - 4, h - 4);
 }

}   


