/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marty;


import java.util.ArrayList;
import Armes.*;
import Personnages.*;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP3_Heroic_Fantasy
 * Date : 18/10/23
 * 
 *
 */
public class TP3_Heroic_Fantasy_MARTY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
        // Créez un tableau dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<Arme>();

        // Ajoutez les épées et les bâtons au tableau
        armes.add(Excalibur);
        armes.add(Durandal);
        armes.add(Chene);
        armes.add(Charme);

        System.out.println(armes);
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lanister",45,true);
        
        ArrayList<Personnages> perso = new ArrayList<Personnages>();
        perso.add(Gandalf);
        perso.add(Garcimore);
        perso.add(Conan);
        perso.add(Lannister);
        
        System.out.println(perso);
        
        Magicien Merlin = new Magicien("Merlin", 90, true);
        Guerrier Legolass = new Guerrier("Legolass", 85, false);
        Epee Carte = new Epee("Carte", 40, 1);
        Epee Epéeendiamant = new Epee("Epee en diamant", 80, 50);
        Epee Epéeenor = new Epee("Epee en or", 60, 40);
        Baton Massue = new Baton("Massue", 30, 10);
        Baton Battedebaseball = new Baton("Batte de baseball", 35, 5);
        Baton BatonMagique = new Baton("Baton magique", 90, 50);
        
        // Création des 6 armes et des 2 personnages
        
        Merlin.Ajouter_Arme(Carte);
        Merlin.Ajouter_Arme(Massue);
        Merlin.Ajouter_Arme(BatonMagique);
        
        Legolass.Ajouter_Arme(Epéeendiamant);
        Legolass.Ajouter_Arme(Epéeenor);
        Legolass.Ajouter_Arme(Battedebaseball);
        
        // Ajout des armes aux personnages
        
        Merlin.Equiper_Arme("Massue");
        Legolass.Equiper_Arme("Epee en diamant");
        
        // Equipement des armes
        
        System.out.println(Merlin);
        System.out.println(Legolass);
        
        // Affichage des personnages
       
        
        
        
        System.out.println("Il y a " + Magicien.nbMagiciens + " magiciens");
        System.out.println("Il y a " + Guerrier.nbGuerriers + " guerriers");
        System.out.println("Il y a " + Personnages.nbPersos + " personnages");
        
        /// On a bien le bon nombre de magiciens, guerriers et personnages crées
    }
}
        
        
    
    

