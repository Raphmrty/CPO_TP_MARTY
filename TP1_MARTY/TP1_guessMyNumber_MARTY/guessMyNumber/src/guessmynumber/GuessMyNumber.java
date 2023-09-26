/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP1_gusseMyNumber
 * Date : 26/09/23
 */
import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (nombre entre 1 et 50, aide pour les écarts importants, tentatives illimitées) ");
        System.out.println("2. Normal (nombre entre 1 et 100, tentatives illimitées) ");
        System.out.println("3. Difficile (nombre entre 1 et 100, tentatives limitées)" );

        int choixDifficulte = sc.nextInt();
        int min = 0;
        int max = 100;
        int nombreMaxTentatives = Integer.MAX_VALUE; // Par défaut, pas de limite de tentatives
        String messagePetit = "Trop petit.";
        String messageGrand = "Trop grand.";

        if (choixDifficulte == 1) {
            max = 50;
            messagePetit = "Vraiment trop petit.";
            messageGrand = "Vraiment trop grand.";
        } else if (choixDifficulte == 3) {
            nombreMaxTentatives = 10; // Par exemple, limite de 10 tentatives en mode difficile
        }

        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(max) + min;
        System.out.println("Choisissez une valeur entre " + min + " et " + max);

        int valeur;
        int tentatives = 0;

        do {
            tentatives++;
            valeur = sc.nextInt();

            if (valeur == n) {
                System.out.println("Gagné en " + tentatives + " tentatives !");
            } else if (valeur < n) {
                System.out.println(messagePetit + " Essayez à nouveau : ");
            } else {
                System.out.println(messageGrand + " Essayez à nouveau : ");
            }

        } while (valeur != n && tentatives < nombreMaxTentatives);

        if (valeur != n) {
            System.out.println("Vous avez épuisé toutes vos tentatives. Le nombre était : " + n);
        }

        sc.close();
    }
}








    

