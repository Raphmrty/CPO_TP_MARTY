/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;
import java.util.Random;

/**
 * rôle du programme : Classe GrilleDeCellules, elle permet de creer une grille (=une matrice de n'importe quelle taille) 
 * composée de cellules lumineuses
 * @author marty
 */
public class GrilleDeCellules {
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
    private Random randomGenerator=new Random();

   

    /**
     * Constructeur pour créer une grille avec un nombre donné de lignes et de colonnes.
     * @param nbLignes correspond au nombre de lignes de la matrice/grille créée.
     * @param nbColonnes correspond au nombre de colonnes de la matrice/grille créée.
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation des cellules dans la grille
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse(); // création d'un nouvel objet grille
            }
        }
    }
    
    
    
     

    /**
     * Méthode pour éteindre toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }     
  

    /**
     * Méthode pour activer de manière aléatoire une ligne, une colonne ou une diagonale
     */
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

   
    /**
     * Méthode pour générer un plateau de cellules lumineuses de manière aléatoire sur un nombre de tours spécifié.

     * @param nbTours, il s'agit d'un entier saisie par l'utilisateur, qui mélange autant de fois la grille que ce nombre choisi.
     */
    public void genererMatriceAleatoire(int nbTours) {
        // Éteindre toutes les cellules
        eteindreToutesLesCellules();

        // Générer le plateau de manière aléatoire sur le nombre de tours spécifié
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    

    /**
     * Méthode pour activer toutes les cellules d'une ligne spécifique
     * @param idLigne , il s'agit d'un paramétre d'entrée à la méthode, il correspond à l'identification d'une
     * ligne prise entre la première ligne et la dernière.
     */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }

    

    /**
     * Méthode pour activer toutes les cellules d'une colonne spécifique
     * @param idColonne il s'agit d'un paramétre d'entrée à la méthode, il correspond à l'identification d'une
     * colonne prise entre la première colonne et la dernière.
     */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
        }
    }
    
    /**
     * Cette méthode permet d'activer toutes les cellules sur la diagonale descendante, 
     * c'est à dire sur tous les éléments diagonaux en partant d'en haut à gauche de la matrice jusqu'à en bas à droite de la matrice.
     */
    public void activerDiagonaleDescendante() {
        // Activer une diagonale (de haut à gauche à bas à droite)
            for (int i = 0; i <  nbColonnes; i++) {
                matriceCellules[i][i].activerCellule();
            }
    }

    /**
     * Cette méthode permet d'activer toutes les cellules sur la diagonale montante, 
     * c'est à dire sur tous les éléments diagonaux en partant d'en bas à gauche de la matrice jusqu'à en haut à droite de la matrice
     */
    public void activerDiagonaleMontante() {
        // Activer une diagonale (de bas à gauche à haut à droite)
            for (int i = 0; i <  nbColonnes; i++) {
                matriceCellules[i][nbColonnes - i - 1].activerCellule();
            }
        
    }
     

    /**
     * Méthode booléenne pour vérifier si toutes les cellules de la grille sont éteintes
     * @return l'état de la grille en général , si au moins une cellule est allumée,
     * elle retournera false, sinon si elles sont toutes éteintes, elle retournera true.
     */
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
    
    

    /**
     * Méthode pour obtenir le nombre de lignes de la grille.
     * @return le nombre de lignes.
     */
    public int getNbLignes() {
        return nbLignes;
    }

     

    /**
     * Méthode pour obtenir le nombre de colonnes de la grille.
     * @return le nombre de colonnes.
     */
    public int getNbColonnes() {
        return nbColonnes;
    }

    

    /**
     * la méthode toString permet d'organiser la grille avec des symboles spéciaux,
     * la première ligne est indépendante de la grille de jeu, elle numérote chaque colonne de 0 à j-1.
     * Chaque ligne est séparé par des tirets "-", chaque ligne est ensuite numéroté de 0 à i-1. 
     * Le coeur est la grille est constitué de l'état des cellules c'est à dire éteint "O" ou allumé "X"
     * @return sert à retourner la grille complète et son affichage.
     */
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




  







    


    
    