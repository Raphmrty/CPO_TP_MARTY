/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;

/**
 * groupe : TDC Nom : MARTY
 *
 * @author marty rôle du programme : TP3_Heroic_Fantasy Date : 18/10/23
 *
 */
public class Guerrier extends Personnages {

    boolean cheval;
    public static int nbGuerriers;

    public Guerrier(String nom, int hp, boolean chevaL) {
        super(nom, hp);
        cheval = chevaL;
        nbGuerriers++;
    }

    public void finalize() {
        nbGuerriers = nbGuerriers - 1;
    }

    @Override
    public void estAttaque(int points) {
        hp -= points;
    }

    @Override
    public void seFatiguer() {
        // Tous les personnages perdent 10 points de vie lorsqu'ils se fatiguent
        hp -= 10;
    }

    @Override
    public boolean estVivant() {
        // Un personnage est vivant s'il a des points de vie positifs
        return hp > 0;
    }

    public void attaquer(Personnages cible, Arme armeUtilisee) {
        int degats = armeUtilisee.getNiveauAttaque();

        if (this instanceof Guerrier && armeUtilisee instanceof Epee) {
            // Si le personnage est un guerrier et qu'il utilise une épée, multipliez les dégâts par la finesse de l'épée
            degats *= ((Epee) armeUtilisee).getFinesse();
            seFatiguer();
        }

        // Vérifiez si la cible magicien est confirmé 
        if (cible instanceof Magicien) {
            if (((Magicien) cible).conf==true){
            degats /= 2;
        }
    }
        //verifie si la cible guerrier est confirmé
        if (cible instanceof Guerrier){
            if (((Guerrier)cible).cheval==true){
            degats /= 2;
        }
            
    }
        

        // Appliquez les dégâts à la cible
        cible.estAttaque(degats);
    }

    @Override
    public String toString() {
        if (this.Arme_en_main == null) {
            if (cheval == true) {
                return "Guerrier " + nom + " (" + hp + " points de vie), a cheval";
            } else {
                return "Guerrier " + nom + " (" + hp + " points de vie), a pieds";
            }
        } else {
            if (cheval == true) {
                return "Guerrier " + nom + " (" + hp + " points de vie), a cheval est equipe de " + Arme_en_main;
            } else {
                return "Guerrier " + nom + " (" + hp + " points de vie), a pieds est equipe de " + Arme_en_main;
            }
        }
    }
}
