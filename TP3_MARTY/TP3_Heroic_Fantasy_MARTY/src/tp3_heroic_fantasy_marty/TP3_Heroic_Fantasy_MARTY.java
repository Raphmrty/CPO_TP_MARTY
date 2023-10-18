/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marty;


import java.util.ArrayList;
import Armes.*;

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

        // Parcourez le tableau et affichez les caractéristiques des armes
        for (Arme arme : armes) {
            System.out.println("Nom : " + arme.getNom());
            System.out.println("Niveau d'attaque : " + arme.getNiveauAttaque());
            if (arme instanceof Epee) {
                Epee epee = (Epee) arme;
                System.out.println("Finesse de l'epee : " + epee.getFinesse());
            } else if (arme instanceof Baton) {
                Baton baton = (Baton) arme;
                System.out.println("Age du baton : " + baton.getAge());
            }
            System.out.println();
        }
    }
}
        
        
    
    

