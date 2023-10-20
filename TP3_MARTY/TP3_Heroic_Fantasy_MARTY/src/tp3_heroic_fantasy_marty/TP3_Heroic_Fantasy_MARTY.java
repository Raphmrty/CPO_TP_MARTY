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
        
        
        // Créez un tableau dynamique pour stocker les armes
        //ArrayList<Arme> armes = new ArrayList<Arme>();

        // Ajoutez les épées et les bâtons au tableau
        //armes.add(Excalibur);
        //armes.add(Durandal);
        //armes.add(Chene);
        //armes.add(Charme);

        //System.out.println(armes);
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lanister",45,true);
        
        ArrayList<Personnages> persos = new ArrayList<Personnages>();
        persos.add(Gandalf);
        persos.add(Garcimore);
        persos.add(Conan);
        persos.add(Lannister);
        //Afficher les persos et leurs caractéristiques
        System.out.println(persos);
        
        Magicien Merlin = new Magicien("Merlin", 90, true);
        Guerrier Legolass = new Guerrier("Legolass", 85, false);
        Epee Zora = new Epee("Zora", 55, 75);
        Epee Epéedelegende = new Epee("Epee de legende", 100, 85);
        Epee Epéeenor = new Epee("Epee en or", 60, 40);
        Baton Massue = new Baton("Massue", 30, 10);
        Baton Mojo = new Baton("Mojo", 64, 99);
        Baton BatonMagique = new Baton("Baton magique", 90, 50);
        
        // Création des 6 armes et des 2 personnages
        
        Merlin.Ajouter_Arme(Mojo);
        Merlin.Ajouter_Arme(Massue);
        Merlin.Ajouter_Arme(BatonMagique);
        
        Legolass.Ajouter_Arme(Epéedelegende);
        Legolass.Ajouter_Arme(Epéeenor);
        Legolass.Ajouter_Arme(Zora);
        
        // Ajout des armes aux personnages
        
        Merlin.Equiper_Arme("Mojo");
        Legolass.Equiper_Arme("Epee de legende");
        
        // Equipement des armes
        
        System.out.println(Merlin);
        System.out.println(Legolass);
        
        // Affichage des personnages
         
        System.out.println("Il y a " + Magicien.nbMagiciens + " magiciens");
        System.out.println("Il y a " + Guerrier.nbGuerriers + " guerriers");
        System.out.println("Il y a " + Personnages.nbPersos + " personnages");
        
        /// On a bien le bon nombre de magiciens, guerriers et personnages crées
        
      
        // 54. Créer un magicien et un guerrier
        Magicien Loard = new Magicien("Loard", 100,false);
        Guerrier Arthur = new Guerrier("Arthur", 150,true);

        // Afficher leurs caractéristiques
        System.out.println("Caracteristiques de Loard (Magicien): " + Loard);
        System.out.println("Caracteristiques d'Arthur (Guerrier): " + Arthur);

        // Afficher le nombre de personnages, de guerriers et de magiciens
        System.out.println("Nombre de personnages crees: " + Personnages.nbPersos);
        System.out.println("Nombre de guerriers crees: " + Guerrier.nbGuerriers);
        System.out.println("Nombre de magiciens crees: " + Magicien.nbMagiciens);

        // 55. Fatiguez le guerrier
        Arthur.seFatiguer();

        // 56. Afficher les caractéristiques du guerrier et vérifier s'il est toujours vivant
        System.out.println("Caracteristiques d'Arthur apres s'etre fatigue: " + Arthur);
        System.out.println("Arthur est vivant : " + Arthur.estVivant());

        // 57. Faire en sorte que le magicien soit victime d'une attaque de la part du guerrier
        Loard.estAttaque(100);

        // Afficher leurs caractéristiques après l'attaque
        System.out.println("Caracteristiques de Loard apres l'attaque d'Arthur: " + Loard);
        System.out.println("Caracteristiques d'Arthur apres avoir attaque Loard: " + Arthur);
        
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme",5,6);
        Magicien Osiris = new Magicien("Osiris",160,false);
        Guerrier Jean = new Guerrier("Jean",150,true);
        Osiris.Ajouter_Arme(Chene);
        Osiris.Ajouter_Arme(Charme);
        Osiris.Equiper_Arme("Chene");
        Jean.Ajouter_Arme(Excalibur);
        Jean.Ajouter_Arme(Durandal);
        Jean.Equiper_Arme("Excalibur");
        Osiris.attaquer(Jean,Chene );
        System.out.println("Caracteristiques d'Osiris (Magicien): " + Osiris);
        System.out.println("Caracteristiques de Jean (Guerrier): " + Jean);
        Jean.attaquer(Osiris, Excalibur);
        System.out.println("Caracteristiques d'Osiris (Magicien): " + Osiris);
        System.out.println("Caracteristiques de Jean (Guerrier): " + Jean);
        Osiris.estVivant();
        Jean.estVivant();
    }
    
}

    

        
        
    
    

