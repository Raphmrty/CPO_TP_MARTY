/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_marty;

/**
 * groupe : TDC
 * Nom : MARTY
 * @author marty
 * rôle du programme : TP2_Bieres
 * Date : 03/10/23 
 */
public class TP2_Bieres_MARTY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0, "Dubuission") ;
        uneBiere.lireEtiquette();
        uneBiere.ouverte = false;
        uneBiere.Decapsuler();
        System.out.println(uneBiere) ;
        
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe") ;
        uneSecondeBiere.ouverte = false;
        uneSecondeBiere.lireEtiquette();
        uneSecondeBiere.Decapsuler();
        System.out.println(uneSecondeBiere) ;
        
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Kronenbourg", 4.2, "Calsberg");
        uneTroisiemeBiere.ouverte = false;
        uneTroisiemeBiere.lireEtiquette();
        uneTroisiemeBiere.Decapsuler();
        System.out.println(uneTroisiemeBiere) ;
        
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Meteor",5.4," Metzger Haag");
        uneQuatriemeBiere.ouverte = false;
        uneQuatriemeBiere.lireEtiquette();
        uneQuatriemeBiere.Decapsuler();
        System.out.println(uneQuatriemeBiere) ;
        
        BouteilleBiere uneCinquiemeBiere = new BouteilleBiere("Desperados",5.1,"Fischer");
        uneCinquiemeBiere.ouverte = false;
        uneCinquiemeBiere.lireEtiquette();  
        uneCinquiemeBiere.Decapsuler();
        System.out.println(uneCinquiemeBiere) ;
    }
    
}
