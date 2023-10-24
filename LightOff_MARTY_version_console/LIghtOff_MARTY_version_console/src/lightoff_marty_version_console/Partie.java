/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;
import java.util.Scanner;

/**
 *
 * @author marty
 */
public class Partie {
    private GrilleDeCellules grille;
    private int nbCoups;
    
    

    public Partie() {
        // Crée une nouvelle instance de la grille de cellules lumineuses
        grille = new GrilleDeCellules(6,6);
        
        // Initialise le compteur de coups à zéro
        nbCoups = 0;
    }
    
    // Méthode pour lancer la partie
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Etat actuel de la grille :");
            System.out.println(grille);

            // Demander au joueur de choisir une ligne, une colonne ou une diagonale
            System.out.print("Veuillez entrer la ligne (0-" + (grille.getNbLignes() - 1) + "), la colonne (0-" + (grille.getNbColonnes() - 1) + "), ou la diagonale (d) à activer : ");
            String choix = sc.next();

            if (choix.equalsIgnoreCase("d")) {
                grille.activerDiagonaleDescendante();
            } else {
                try {
                    int num = Integer.parseInt(choix);
                    if (num >= 0 && num < grille.getNbLignes()) {
                        grille.activerLigneDeCellules(num);
                    } else {
                        System.out.println("Choix invalide. Veuillez entrer une ligne, une colonne ou 'd' pour la diagonale.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Choix invalide. Veuillez entrer une ligne, une colonne ou 'd' pour la diagonale.");
                }
            }

            nbCoups++;
        }

        System.out.println("Felicitations! Vous avez eteint toutes les cellules en " + nbCoups + " coups.");
        sc.close();
    }

   
       
}







