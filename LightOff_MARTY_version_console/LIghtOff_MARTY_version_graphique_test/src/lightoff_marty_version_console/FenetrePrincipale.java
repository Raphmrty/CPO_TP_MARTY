package lightoff_marty_version_console;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author marty
 */


public class FenetrePrincipale extends javax.swing.JFrame {
    
    GrilleDeCellules grille;
    int nbCoups;
    int i; 
    
    
   
    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
         int nbLignes=5;
         int nbColonnes=5;
         this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
         // Ajoutez cette méthode pour afficher la grille dans la fenêtre principale
    
         PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
            PanneauGrille.add(bouton_cellule);
        }
    }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonVerticaux,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes) 
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    FinDePartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);
            nbCoups++;

        }
        PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, nbColonnes * 40,1 * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes) 
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    FinDePartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonHorizontaux.add(bouton_colonne);
            nbCoups++;

        }
        getContentPane().add(btnDiagM,new org.netbeans.lib.awtextra.AbsoluteConstraints(60,60+nbLignes*40,1*40,1*40));
        getContentPane().add(btnDiagD,new org.netbeans.lib.awtextra.AbsoluteConstraints(60,10,1*40,1*40));
         // Rafraîchir l'interface graphique après avoir ajouté les boutons
        
        // Configurer le panneau de boutons de difficulté
        PanneauBoutonsDifficulte.setLayout(new GridLayout(1, 3));

        JButton boutonFacile = new JButton("Facile");
        JButton boutonNormal = new JButton("Normal");
        JButton boutonDifficile = new JButton("Difficile");
        PanneauBoutonsDifficulte.add(boutonFacile);
        PanneauBoutonsDifficulte.add(boutonNormal);
        PanneauBoutonsDifficulte.add(boutonDifficile);

        getContentPane().add(PanneauBoutonsDifficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 3 * 80, 1 * 40));
        this.pack();
        this.revalidate();

        boutonFacile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetrePrincipale f1 = new FenetrePrincipale();
                grille = new GrilleDeCellules(4,4);
                f1.setVisible(true);
                dispose();
                
                
            }
        });

        boutonNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetrePrincipale f2 = new FenetrePrincipale();
                 grille = new GrilleDeCellules(5,5);
                 f2.setVisible(true);
                 dispose();
                
                
            }
        });

        boutonDifficile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetrePrincipale f3 = new FenetrePrincipale();
                 grille = new GrilleDeCellules(6,6);
                 f3.setVisible(true);
                 dispose();
                
                
            }
        });

        
        
       initialiserPartie();
        
        
       
        
    }
    
  
     
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(50);
    }
    
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        btnDiagD = new javax.swing.JButton();
        btnDiagM = new javax.swing.JButton();
        PanneauBoutonsDifficulte = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 500, 500));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnDiagD.setBackground(new java.awt.Color(0, 255, 51));
        btnDiagD.setText("DiagD");
        btnDiagD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagDActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnDiagM.setBackground(new java.awt.Color(0, 255, 0));
        btnDiagM.setText("DiagM");
        btnDiagM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagMActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        javax.swing.GroupLayout PanneauBoutonsDifficulteLayout = new javax.swing.GroupLayout(PanneauBoutonsDifficulte);
        PanneauBoutonsDifficulte.setLayout(PanneauBoutonsDifficulteLayout);
        PanneauBoutonsDifficulteLayout.setHorizontalGroup(
            PanneauBoutonsDifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsDifficulteLayout.setVerticalGroup(
            PanneauBoutonsDifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDifficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagDActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        nbCoups++;
        FinDePartie();
    }//GEN-LAST:event_btnDiagDActionPerformed
        
    private void btnDiagMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagMActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        nbCoups++;
        FinDePartie();
    }//GEN-LAST:event_btnDiagMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauBoutonsDifficulte;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnDiagD;
    private javax.swing.JButton btnDiagM;
    // End of variables declaration//GEN-END:variables

public void FinDePartie() {
        if (this.grille.cellulesToutesEteintes() == true) {
            PanneauGrille.setEnabled(false);
            PanneauBoutonHorizontaux.setEnabled(false);
            PanneauBoutonVerticaux.setEnabled(false);
            PanneauBoutonsDifficulte.setEnabled(false);
            btnDiagM.setEnabled(false);
            btnDiagD.setEnabled(false);
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
            dispose();
            System.out.println("Bravo vous avez termine la partie en " + nbCoups + "coups");
        }

    }   

}
