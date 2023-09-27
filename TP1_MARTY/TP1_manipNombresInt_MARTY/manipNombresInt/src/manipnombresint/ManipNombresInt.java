/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint;

import java.util.Scanner;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP1_maniNombresInt
 * Date : 26/09/23
 */
public class ManipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        // demande de saisie de deux entiers à l'utilisateur
        System.out.println("Saisissez un premier nombre entier");
        System.out.println("Saisissez un deuxieme nombre entier");
        // saisie des deux entiers
        int entier1 = sc.nextInt();
        int entier2 = sc.nextInt();
        // ensemble des opérations effectuées sur les entiers saisis par l'utilisateur
        int produit = entier1*entier2;
        int difference = entier1 - entier2;
        int somme = entier1 + entier2;
        int quotient = entier1 / entier2;
        int reste = entier1 % entier2;
        // affichage des résultats
        System.out.println("La somme des deux entiers est : " + somme + " La difference des deux entiers est : " + difference + " Le produit des deux entiers est : " + produit );
        System.out.println("Le quotient entier est : " + quotient + " Le reste de la division euclidienne est : " + reste );
    }
    
}
