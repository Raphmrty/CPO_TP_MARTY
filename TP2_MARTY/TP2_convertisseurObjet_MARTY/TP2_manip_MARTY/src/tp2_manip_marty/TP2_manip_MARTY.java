/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_marty;

/**
 *groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_manip
 * Date : 06/10/23
 * 
 */
public class TP2_manip_MARTY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;
    Tartiflette assiette3 = assiette2 ;
    //Q4:réponse:
    //Deux tartiflettes ont rééllement été créées car on utilise deux fois l'instruction "new"
    //Elles référencent la même tartiflette
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    assiette2.nbCalories = 750;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    //Q5:
    Tartiflette assiette4 = assiette1 ;
    assiette1=assiette2;
    assiette2=assiette4;
    System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    
    //Q6:réponse:
    // Les deux lignes ne sont pas correctes. Car l'attribut assiette ne peut pas être celui d'une Moussaka
    // La deuxieme ligne confond un objet moussaka avec la création d'un objet tartiflette, cela ne peut pas fonctionner.
    //Donc pour répondre à la question , cela ne peut pas fonctionner car les références objets sont différentes, elles n'appartiennent pas à la même classe.
    
    //Q7:
    // Créez un tableau de 10 références de Moussaka
        Moussaka[] tableauDeMoussaka = new Moussaka[10];

        // Pour chaque référence dans le tableau, créez un nouvel objet de type Moussaka
        for (int i = 0; i < 10; i++) {
            tableauDeMoussaka[i] = new Moussaka(i);
    }
      // réponse question réthorique : Oui cela est possible pour associer deux objets entre eux
}
}