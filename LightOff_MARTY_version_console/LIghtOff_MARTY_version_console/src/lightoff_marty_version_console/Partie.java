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
    Random randomGenerator = new Random();
    System.out.println("Bienvenue dans le jeu LightOff!"); //phrase d'accueil pour le joueur
    System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1. Facile (matrice 2x2, 3x3, ou 4X4; tentatives illimitees) ");
        System.out.println("2. Normal (matrice 5X5, 6X6, 7X7; tentatives limitees a 30) ");
        System.out.println("3. Difficile (matrice 7X7 ou non carrees, tentatives limitees a 20)" );
        int choixDifficulte = sc.nextInt();
        int nombreMaxTentatives = 10000; // Par défaut, pas de limite de tentatives
        if (choixDifficulte == 1) {
            int choixfacile = randomGenerator.nextInt(3); // Génère un nombre aléatoire entre 0 et 2
            if (choixfacile == 0) {
                grille = new GrilleDeCellules(2,2); // génère une matrice 2X2
            }
            else if (choixfacile == 1) {
                grille = new GrilleDeCellules(3,3); // génère une matrice 3X3
            }
            else  {
                grille = new GrilleDeCellules(4,4); // génère une matrice 4X4
            }
            nombreMaxTentatives = 10000; // nombre de tentavites illimitées.
        }
        else if (choixDifficulte == 2) {
            int choixnormal = randomGenerator.nextInt(3); // Génère un nombre aléatoire entre 0 et 2
            if (choixnormal == 0) {
                grille = new GrilleDeCellules(5,5); // génère une matrice 5X5   
            }
            else if (choixnormal == 1) {
                grille = new GrilleDeCellules(6,6); // génère une matrice 6X6
            }
            else  {
                grille = new GrilleDeCellules(7,7); // génère une matrice 7X7
            }
            nombreMaxTentatives = 30; // fixe le nombre de tentatives à 30 coups.
        }
        else if (choixDifficulte == 3) {
            int choixdifficile = randomGenerator.nextInt(2); // Génère un nombre aléatoire entre 0 et 1
            int lineAlea = randomGenerator.nextInt(7);
            int colAlea = randomGenerator.nextInt(7);
            if (choixdifficile == 0) {
                grille = new GrilleDeCellules(7,7);
            }
            else {
                grille = new GrilleDeCellules(lineAlea,colAlea);
            }
            nombreMaxTentatives = 20; // fixe le nombre de tentatives à 20 coups.
        }
    initialiserPartie(); // appel de la méthode initialiserPartie() pour mélanger la grille créée.
    // Tant que la grille n'est pas entièrement éteinte, la partie n'est pas terminée.
    while (!grille.cellulesToutesEteintes()) {
        System.out.println("Etat actuel de la grille :"); // l'état de la grille est continuellement affiché au joueur pour voir son avancement dans le jeu et opter pour telle ou telle stragégie de résolution.
        System.out.println(grille); // affiche la grille de jeu
        System.out.println("Le nombre de tentatives restant est :" + nombreMaxTentatives);

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
            if (nombreMaxTentatives == 0){
                System.out.println("Vous avez épuisé toutes vos tentatives. Veuillez reessayer");
            }
        }
    }

    System.out.println("Felicitations! Vous avez eteint toutes les cellules en " + nbCoups + " coups."); // phrase de fin de jeu + le nombre de coups mis par le joueur pour finir sa partie.
    sc.close();
    }       
}







