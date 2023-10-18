/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marty
 */
public class Epee extends Arme {
    private int finesse;

    // Constructeur de Epee
    public Epee(String nom, int nivAtq, int finesse) {
        super(nom, nivAtq);
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            System.out.print("L'indice de finesse de l'épée doit être inférieur à 100.");
        }
    }

    // Méthode pour obtenir l'indice de finesse de l'épée
    public int getFinesse() {
        return finesse;
    }
}

