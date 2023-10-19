/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import static Personnages.Guerrier.nbGuerriers;
import static Personnages.Magicien.nbMagiciens;
import java.util.ArrayList;
/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 */
import java.util.ArrayList;

public abstract class Personnages implements etreVivant {
    String nom;
    int hp;
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    Arme Arme_en_main = null;
    public static int nbPersos;
    public static int nbTotalPersonnages = 0;
    public static int nbGuerriers = 0;
    public static int nbMagiciens = 0;
    
    public void seFatiguer() {
        // Tous les personnages perdent 10 points de vie lorsqu'ils se fatiguent
        hp -= 10;
    }

    public boolean estVivant() {
        // Un personnage est vivant s'il a des points de vie positifs
        return hp > 0;
    }

    public void estAttaque(int points) {
        // Un personnage perd des points de vie lorsqu'il est attaqué
        hp -= points;
    }

    public Personnages (String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
        nbPersos++;
        // Mettre à jour le compteur total de personnages
        nbTotalPersonnages++;

        // Mettre à jour le compteur de guerriers et de magiciens (ajoutez d'autres types si nécessaire)
        if (this instanceof Guerrier) {
            nbGuerriers++;
        } else if (this instanceof Magicien) {
            nbMagiciens++;
        }
        
    }
    public void finalize(){
    nbPersos = nbPersos - 1;
    nbMagiciens = nbMagiciens - 1;
    nbGuerriers = nbGuerriers - 1;
}
    
    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void Ajouter_Arme(Arme Arme_a_ajouter) {
        if (inventaire.size() < 5) {
            this.inventaire.add(Arme_a_ajouter);
            Arme_a_ajouter.setProprietaire(this);
            System.out.println(Arme_a_ajouter.getNom() + " a bien ete ajoutee a l'inventaire de " + this.nom);
        } else {
            System.out.println(this.nom + " possede deja 5 armes dans son inventaire.");
        }
    }

    public void Equiper_Arme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                Arme_en_main = arme;
                System.out.println(this.nom + " a equipe " + arme.getNom() + " comme arme principale.");
                return;
            }
        }
        System.out.println(this.nom + " ne possede pas d'arme nommee " + nomArme + " dans son inventaire.");
    }
    

    @Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + hp + " points de vie)";
        if (Arme_en_main != null) {
            chaine_a_retourner += " avec " + Arme_en_main.getNom() + " (" + Arme_en_main.getNiveauAttaque() + " points d'attaque)";
        }
        return chaine_a_retourner;
    }
}
