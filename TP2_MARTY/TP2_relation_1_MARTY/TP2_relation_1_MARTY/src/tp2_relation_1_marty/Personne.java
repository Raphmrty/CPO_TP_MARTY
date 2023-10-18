/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_marty;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_relation_1
 * Date : 06/10/23
 * 
 * 
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public Personne(String prenom1, String nom1){
        nom=nom1;
        prenom=prenom1;
        int nbVoitures = 0;
        liste_voitures = new Voiture [3] ;
    }
    @Override
    public String toString() {
    String chaine_a_retourner; 
    chaine_a_retourner = prenom + nom; 
    return chaine_a_retourner ;
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;          
        }
        else {
             if (nbVoitures == 3) {
                 return false;
             }
             else {
                 liste_voitures [nbVoitures] = voiture_a_ajouter;
                 ++nbVoitures;
                 voiture_a_ajouter.Proprietaire = this ;
                 return true;
                 
             }
             
        }

    }
    
    
}
