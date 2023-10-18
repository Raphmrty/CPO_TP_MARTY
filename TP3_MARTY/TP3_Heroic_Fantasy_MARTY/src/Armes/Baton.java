/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marty
 */
public class Baton extends Arme {
    private int age;

    // Constructeur de Baton
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age < 100) {
            this.age = age;
        } else {
            System.out.print("L'âge du bâton doit être inférieur à 100.");
        }
    }

    // Méthode pour obtenir l'âge du bâton
    public int getAge() {
        return age;
    }
}