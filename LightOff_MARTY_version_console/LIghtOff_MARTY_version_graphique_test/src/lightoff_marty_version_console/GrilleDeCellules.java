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
    private Random randomGenerator = new Random();
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String ANSI_RESET = "\u001B[0m"; 
   

    /**
     * Constructeur pour créer une grille avec un nombre donné de lignes et de colonnes.
     * @param nbLignes correspond au nombre de lignes de la matrice/grille créée.
     * @param nbColonnes correspond au nombre de colonnes de la matrice/grille créée.
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation des cellules dans la grille, le double for permet de traiter chaque cellule de la matrice.
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
                matriceCellules[i][j].eteindreCellule(); // eteint toutes les cellules grâce à la méthode de la classe CelluleLumineuse.
            }
        }
    }     
  

    /**
     * Méthode pour activer de manière aléatoire une ligne, une colonne ou une diagonale.
     * Un nombre aléatoire est généré entre 0 et 3 et chacun correspond à la modification d'une (ligne/colonne/diagonale) en particulier.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int randomAction = randomGenerator.nextInt(4); // Génère un nombre aléatoire entre 0 et 3

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
            case 3:
                //Activer une diagonale (de bas à gauche à bas à droite)
                for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][nbColonnes - i - 1].activerCellule();
            }
        }
    }

   
    /**
     * Méthode pour générer un plateau de cellules lumineuses de manière aléatoire sur un nombre de tours spécifié.

     * @param nbTours, il s'agit d'un entier saisie par l'utilisateur, qui mélange autant de fois la grille que ce nombre choisi.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        // Éteindre toutes les cellules
        this.eteindreToutesLesCellules();

        // Générer le plateau de manière aléatoire sur le nombre de tours spécifié
        for (int tour = 0; tour < nbTours; tour++) {
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Cette méthode permet de creer une matrice avec un nombre de ligne et de colonne aléatoire compris entre 1 et 8.
     */
    public void CreerMatriceNonCarrees() {
    Random randomGenerator = new Random();
    
    // Générez aléatoirement le nombre de lignes et de colonnes entre 1 et 8
    nbLignes = randomGenerator.nextInt(8) + 1;
    nbColonnes = randomGenerator.nextInt(8) + 1;

    // Créez une nouvelle matrice de cellules lumineuses
    matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

    // Initialisez la matrice avec des cellules éteintes
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j] = new CelluleLumineuse();
        }
    }

    // Générez un nombre aléatoire de cellules à activer
    int nombreCellulesAActiver = randomGenerator.nextInt(nbLignes * nbColonnes) + 1;

    for (int k = 0; k < nombreCellulesAActiver; k++) {
        int ligneAlea = randomGenerator.nextInt(nbLignes);
        int colonneAlea = randomGenerator.nextInt(nbColonnes);
        matriceCellules[ligneAlea][colonneAlea].activerCellule();
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
            for (int i = 0; i < Math.min(nbLignes,nbColonnes) ; i++) {
                matriceCellules[i][i].activerCellule();
            }
    }

    /**
     * Cette méthode permet d'activer toutes les cellules sur la diagonale montante, 
     * c'est à dire sur tous les éléments diagonaux en partant d'en bas à gauche de la matrice jusqu'à en haut à droite de la matrice
     */
    public void activerDiagonaleMontante() {
        // Activer une diagonale (de bas à gauche à haut à droite)
            for (int i = 0; i < Math.min(nbLignes,nbColonnes) ; i++) {
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
                if (matriceCellules[i][j].estEteint()==false) {
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
        grilleString += BLUE + "   | " + ANSI_RESET; // barre de séparation bleue
        for (int j = 0; j < nbColonnes; j++) {
            grilleString += BLUE + "" + j + " | " + ANSI_RESET; // barre de séparation bleue
        }
        grilleString += "\n"; // saut de ligne

        // Ligne de séparation
        
        for (int j = 0; j < (nbColonnes+1); j++) {
            grilleString += BLUE + "----" + ANSI_RESET; // interlignes bleus
        }
        grilleString += "\n"; // saut de ligne

        // Parcourir la grille et ajouter les indices de lignes et les états des cellules
        for (int i = 0; i < nbLignes; i++) {
            grilleString += BLUE + " " + i + " |" + ANSI_RESET; // Ajouter l'indice de ligne
            for (int j = 0; j < nbColonnes; j++) {
                // Centrer les caractères "X" , "O"  et "#" dans chaque cellule
                    
                    if(matriceCellules[i][j].getEtat()==0) {
                        grilleString+=RED+"" + matriceCellules[i][j]+ ""+ANSI_RESET; // etat 0 = rouge
                    }
                    if(matriceCellules[i][j].getEtat()==1) {
                        grilleString +=GREEN+"" + matriceCellules[i][j]+""+ANSI_RESET; // etat 1 = vert
                    }
                    if(matriceCellules[i][j].getEtat()==2) {
                        grilleString +=YELLOW+"" + matriceCellules[i][j]+""+ANSI_RESET; // etat 2 = jaune
                    }
                grilleString += BLUE + "|" + ANSI_RESET; // barres de séparation bleues
            }
            grilleString += "\n"; // saut de ligne

            // Ligne de séparation
            
            for (int j = 0; j < (nbColonnes+1); j++) {
                grilleString += BLUE + "----" + ANSI_RESET; // interlignes bleus
            }
            grilleString += "\n"; // saut de ligne
        }

        return grilleString; // retourne la grille
    }

    
}




  







    


    
    
