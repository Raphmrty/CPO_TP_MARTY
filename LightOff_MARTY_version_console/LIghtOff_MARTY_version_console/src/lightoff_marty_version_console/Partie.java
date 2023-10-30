/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_marty_version_console;
import java.util.Scanner;
import java.util.Random;

/**
 * classe Partie, elle permet de jouer et de faire participer le joueur sur la grille, via le système de Scanner
 * @author marty
 */
public class Partie {
    private GrilleDeCellules grille;
    private int nbCoups;
    private static int niveau=0;
    
   
    /**
     * Cette méthode crée une nouvelle instance de la grille de cellules lumineuses 
     * et initialise le nombre de coups que le joueur met pour eteindre la grille entièrement à 0.
     */
    public Partie() {
        
        grille = new GrilleDeCellules(6,6);
        
        
        // Initialise le compteur de coups à zéro
        nbCoups = 0;
    }

    /**
     * Cette méthode permet de mélanger aléatoirement la grille créée dans le constructeur Partie(),
     * grâce à la méthode melangerMatriceAleatoirement définie dans la classe GrilleDeCellules avec un nombre de tours fixé en paramètre.
     */
    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(15);
    }
    /**
     * Cette méthode permet au joueur lorsqu'il lance sa partie de pourvoir jouer avec des règles très simples pour prendre ses repères sur le jeu.
     * La taille des grilles de jeu sont assez simples à résoudre (2X2, 3X3, 4X4) et le nombre de tentative est illimité.
     */
    void choisirNiveauFacile() {
    Random randomGenerator = new Random();
    int choixfacile = randomGenerator.nextInt(3);

        switch (choixfacile) {
            case 0:
                grille = new GrilleDeCellules(2, 2);
                break;
            case 1:
                grille = new GrilleDeCellules(3, 3);
                break;
            default:
                grille = new GrilleDeCellules(4, 4);
                break;
        }
        niveau=1; 
    }
    /**
     * Cette méthode permet au joueur de rencontrer certaines difficultées dans sa partie, la taille de la matrice est plus grande(5X5, 6X6, 7X7) et les tentatives sont limitées à 30.
     */
    private void choisirNiveauMoyen() {
    Random randomGenerator = new Random();
    int choixmoyen = randomGenerator.nextInt(3); 
        
        switch (choixmoyen) {
            case 0:
                grille = new GrilleDeCellules(5,5); // génère une matrice 5X5   
                break;
            case 1:
                grille = new GrilleDeCellules(6,6); // génère une matrice 6X6
                break;
            default:
                grille = new GrilleDeCellules(7,7); // génère une matrice 7X7
                break;
        }
        niveau=2;
    }
    /**
     * Cette méthode permet au joueur de jouer avec un niveau de difficulté élevé, il peut avoir une matrice 7X7, ou bien une matrice non carrée avec un nombre de colonne et de ligne compris entre 6 et 8.
     * Le nombre de tentatives est limité à 20. L'appartition d'un nouvel état intermédiraire des cellules permet de varier les combinaisons et de rendre le jeu plus compliqué (CelluleLumineuse).
     */
    private void choisirNiveauDifficile() {
    Random randomGenerator = new Random();    
    int choixdifficile = randomGenerator.nextInt(2); // Génère un nombre aléatoire entre 0 et 1
    int lineAlea;
    int colAlea;
        switch (choixdifficile) {
            case 0:
                grille = new GrilleDeCellules(7,7);
                break;
            default:
                do {
                    lineAlea = randomGenerator.nextInt(8);
                    colAlea = randomGenerator.nextInt(8);
                    grille = new GrilleDeCellules(lineAlea,colAlea);
                } while(lineAlea<6 && colAlea<6 && lineAlea>=8 && colAlea>=8); 
                break;
        }
        niveau=3;
    }

    /**
     * Cette méthode permet de retourner le niveau de difficulté de la partie
     * @return le niveau de difficulté (facile (=1), normal(=2) ou difficile(=3)
     */
    public static int nivDifficult() {
        return niveau;
    }
     
    // Méthode pour lancer la partie
    /**
     * Cette méthode est le coeur du jeu, elle permet au joueur d'intéragir avec la console grâce au scanner.
     * Tant que la grille de cellules n'est pas complètement éteinte, la partie n'est pas terminée.
     * Le joueur peut choisir d'allumer une ligne, une collone ou bien une des deux diagonales,
     * en saisissant la valeur correspondante à celle qu'il souhaite (entre 1 et 4). Ensuite selon la saisie (1 ou 2), seulement pour les lignes et colonnes,
     * une seconde saisie est demandée au joueur pour savoir quelle ligne ou colonne il souhaite modifier en particulier.
     */
    public void lancerPartie() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenue dans le jeu LightOff!"); //phrase d'accueil pour le joueur
    System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1. Facile (matrice 2x2, 3x3, ou 4X4; tentatives illimitees) ");
        System.out.println("2. Normal (matrice 5X5, 6X6, 7X7; tentatives limitees a 30) ");
        System.out.println("3. Difficile (matrice 7X7 ou non carrees, tentatives limitees a 20)" );
        int choixDifficulte = sc.nextInt();
        
        switch (choixDifficulte) {
            case 1:
                choisirNiveauFacile();
                break;
            case 2:
                choisirNiveauMoyen();
                break;
            case 3:
                choisirNiveauDifficile();
                break;
            default:
                break;
        }
    initialiserPartie(); // appel de la méthode initialiserPartie() pour mélanger la grille créée.
    // Tant que la grille n'est pas entièrement éteinte, la partie n'est pas terminée.
    int nombreMaxTentatives = (choixDifficulte == 2) ? 30 : (choixDifficulte == 3) ? 20 : Integer.MAX_VALUE; // nombre tentatives possibles selon le niveau de difficuulté de la partie.
    while (!grille.cellulesToutesEteintes() && nombreMaxTentatives > 0) {
        System.out.println("Etat actuel de la grille :"); // l'état de la grille est continuellement affiché au joueur pour voir son avancement dans le jeu et opter pour telle ou telle stragégie de résolution.
        System.out.println(grille); // affiche la grille de jeu
        

        // Demander au joueur de choisir une action entre modification de : ligne, colonne , diagonale montante ou descendante.
        System.out.print("""
                         Veuillez entrer l'action que vous souhaitez effectuer :
                         1. Pour activer une ligne (0-""" + (grille.getNbLignes() - 1) + ")\n" + "2. Pour activer une colonne (0-" + (grille.getNbColonnes() - 1) + ")\n" + "3. Pour activer la diagonale descendante \n" + "4. Pour activer la diagonale montante \n" + "Votre choix : ");
        String choix = sc.next(); // permet d'intéragir avec le joueur.
        // Conditions sur le chiffre compris entre 1 et 4, correspondant à la modifaction choisie par joueur.
        if (choix.equals("1")) {
            System.out.print("Veuillez entrer la ligne a activer (0-" + (grille.getNbLignes() - 1) + ") : ");
            int num = sc.nextInt();
            if (num >= 0 && num < grille.getNbLignes()) {
                grille.activerLigneDeCellules(num);
            } else {
                System.out.println("Choix de ligne invalide. Veuillez entrer une ligne valide."); // message d'erreur affiché au cas où le joueur saisie une valeur incohérente. 
            }
        } else if (choix.equals("2")) {
            System.out.print("Veuillez entrer la colonne a activer (0-" + (grille.getNbColonnes() - 1) + ") : ");
            int col = sc.nextInt();
            if (col >= 0 && col < grille.getNbColonnes()) {
                grille.activerColonneDeCellules(col);
            } else {
                System.out.println("Choix de colonne invalide. Veuillez entrer une colonne valide."); // message d'erreur affiché au cas où le joueur saisie une valeur incohérente.
            }
        } else if (choix.equals("3")) {
            grille.activerDiagonaleDescendante();
        } else if (choix.equals("4")) {
            grille.activerDiagonaleMontante();
        } else {
            System.out.println("Choix invalide. Veuillez entrer une option valide (1, 2, 3 ou 4)."); // message d'erreur affiché au cas où le joueur saisie une valeur incohérente.
        }
        if (choixDifficulte==1) {
            nbCoups++; // le nombre de coup est incrémenté de +1 à chaque tour.
        }
        else {
            nbCoups++;
            nombreMaxTentatives--;
            System.out.println("Le nombre de tentatives restant est :" + nombreMaxTentatives);
            if (nombreMaxTentatives == 0){
                System.out.println("Vous avez épuisé toutes vos tentatives. Veuillez reessayer");
                break;
            }
        }
    }
    System.out.println(grille); // affiche la grille avec toutes les cellules éteintes.
    System.out.println("Felicitations! Vous avez eteint toutes les cellules en " + nbCoups + " coups."); // phrase de fin de jeu + le nombre de coups mis par le joueur pour finir sa partie.
    sc.close();
    }       
}








