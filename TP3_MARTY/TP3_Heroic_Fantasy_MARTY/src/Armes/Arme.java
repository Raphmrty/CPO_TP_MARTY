/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marty
 */
public abstract class Arme {
  private  String nom;
  private  int nivAtq;


    public Arme(String nom1, int nivAtq1) {
    nom = nom1;
    nivAtq = nivAtq1;   
    if(nivAtq >= 0 && nivAtq <=100) {
        nivAtq = nivAtq;
    } else { 
        System.out.println("Le niveau d'attaque doit être compris entre 0 et 100.");
    }
    }
    
    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return nivAtq;
    }
    
     // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", nivAtq=" + nivAtq + '}';
    }
      

}


    
