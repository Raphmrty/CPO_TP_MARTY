/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;


/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
public class Magicien extends Personnages {
    boolean conf;
    public static int nbMagiciens;
    
    
    public Magicien (String nom, int hp, boolean conF) {
        super(nom, hp);
        conf = conF;
        nbMagiciens ++;
    }
    
    public void finalize(){
    nbMagiciens = nbMagiciens - 1;
}   @Override
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

    if (this instanceof Magicien && armeUtilisee instanceof Baton) {
        // Si le personnage est un magicien et qu'il utilise un bâton, multipliez les dégâts par l'âge du bâton
        degats *= ((Baton) armeUtilisee).getAge();
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
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirme";
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice";
            }
        }
        else {
            if (conf == true) {
                return "Magicien "+ nom + " (" + hp + " points de vie), confirme est equipe de "+ Arme_en_main;
            }
            else {
                return "Magicien "+ nom + " (" + hp + " points de vie), novice est equipe de " + Arme_en_main;
            }
        }
    }

    
}
