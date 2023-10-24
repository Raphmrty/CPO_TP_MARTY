/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;
import java.util.Random;

/**
 *
 * @author marty
 */
public class GrilleDeCellules {
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
    private Random randomGenerator=new Random();

    // Constructeur pour créer une grille avec un nombre donné de lignes et de colonnes
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation des cellules dans la grille
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    
    
    
    // Méthode pour éteindre toutes les cellules de la grille
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }     
   // Méthode pour activer de manière aléatoire une ligne, une colonne ou une diagonale
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int randomAction = randomGenerator.nextInt(3); // Génère un nombre aléatoire entre 0 et 2

        switch (randomAction) {
            case 0:
                // Activer une ligne aléatoire
                int ligneAleatoire = randomGenerator.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligneAleatoire][j].activerCellule();
                }
                break;
            case 1:
                // Activer une colonne aléatoire
                int colonneAleatoire = randomGenerator.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonneAleatoire].activerCellule();
                }
                break;
            case 2:
                // Activer une diagonale (de haut à gauche à bas à droite)
                for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                    matriceCellules[i][i].activerCellule();
                }
                break;
        }
    }

   // Méthode pour générer un plateau de cellules lumineuses de manière aléatoire sur un nombre de tours spécifié
    public void genererMatriceAleatoire(int nbTours) {
        // Éteindre toutes les cellules
        eteindreToutesLesCellules();

        // Générer le plateau de manière aléatoire sur le nombre de tours spécifié
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    // Méthode pour activer toutes les cellules d'une ligne spécifique
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

    // Méthode pour activer toutes les cellules d'une colonne spécifique
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }
    
    public void activerDiagonaleDescendante() {
        // Activer une diagonale (de haut à gauche à bas à droite)
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
    }
    public void activerDiagonaleMontante() {
        // Activer une diagonale (de bas à gauche à haut à droite)
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][nbColonnes - 1 - i].activerCellule();
            }
        
    }
     // Méthode pour vérifier si toutes les cellules de la grille sont éteintes
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    // S'il y a au moins une cellule allumée, retourne false
                    return false;
                }
            }
        }
        // Si toutes les cellules sont éteintes, retourne true
        return true;
    }
    
    // Méthode pour obtenir le nombre de lignes de la grille
    public int getNbLignes() {
        return nbLignes;
    }

    // Méthode pour obtenir le nombre de colonnes de la grille
    public int getNbColonnes() {
        return nbColonnes;
    }

    // Redéfinition de la méthode toString pour afficher l'état de la grille de manière organisée
    @Override
    public String toString() {
        String grilleString = "";

        // Ajouter des indices de colonnes en haut de la grille
        grilleString += "   | ";
        for (int j = 0; j < nbColonnes; j++) {
            grilleString += "" + j + " | ";
        }
        grilleString += "\n";

        // Ligne de séparation
        
        for (int j = 0; j < (nbColonnes+1); j++) {
            grilleString += "----";
        }
        grilleString += "\n";

        // Parcourir la grille et ajouter les indices de lignes et les états des cellules
        for (int i = 0; i < nbLignes; i++) {
            grilleString += " " + i + " |"; // Ajouter l'indice de ligne
            for (int j = 0; j < nbColonnes; j++) {
                // Centrer les caractères "X" et "O" dans chaque cellule
                grilleString += "" + matriceCellules[i][j] + "|";
            }
            grilleString += "\n";

            // Ligne de séparation
            
            for (int j = 0; j < (nbColonnes+1); j++) {
                grilleString += "----";
            }
            grilleString += "\n";
        }

        return grilleString;
    }

    
}




  







    


    
    
