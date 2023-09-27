/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP1_stats
 * Date : 27/09/23
 */
public class Stats {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] faceCounts = new int[6]; // Crée un tableau pour stocker les résultats
        int m; // Le nombre d'itérations

        // Demande à l'utilisateur de saisir le nombre d'itérations
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre d'iterations (m) : ");
        m = sc.nextInt();

        // Initialise le générateur de nombres aléatoires
        Random random = new Random();

        // Effectue les itérations pour simuler le lancer du dé
        for (int i = 0; i < m; i++) {
            int randomFace = random.nextInt(6); // Génère un nombre aléatoire entre 0 et 5 inclus
            faceCounts[randomFace]++; // Incrémente la case correspondante dans le tableau
        }

        // Affiche les résultats sous forme de pourcentages
        NumberFormat percentFormat = new DecimalFormat("#0.00%");
        for (int face = 0; face < 6; face++) {
            double pourcentage = (double) faceCounts[face] / m;
            System.out.println("Face " + (face + 1) + ": " + percentFormat.format(pourcentage));
        }
    }
}
