/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo2;

import java.util.Scanner;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP0
 * Date : 18/09/23
 */
public class Exo2 {

public static void main(String[] args) {
  int nb;
  Scanner sc = new Scanner(System.in);
  System.out.println("\n Entrer le nombre :");
  nb = sc.nextInt(); // On demande à sc de donner le prochain entier
  int result = 0; // resultat
  int ind = 1; // indice

  // Addition des nb premiers entiers
  while (ind <= nb) {
  result = result + ind;
  ind++; // N'oubliez pas d'incrémenter ind à chaque itération
  }

  // Affichage du resultat
  System.out.println();
  System.out.println("La somme des " + nb + " entiers est : " + result);
  }
}



        

        
