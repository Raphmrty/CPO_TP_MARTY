/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int nivAtq, int agE) {
        super(nom, nivAtq);
        age = agE;
    }

    // Méthode pour obtenir l'âge du bâton
    public int getAge() {
        return age;
    }
    // Méthode pour contraindre les valeurs d'âge saisies
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if(age > 100) {
            this.age = 100;
        }
        else {
            this.age = age;
    }
}

    
    
}