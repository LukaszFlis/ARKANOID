/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akanoid;

import java.awt.Dimension;
import java.util.ResourceBundle;
import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;

/**
 *
 * @author Luk
 */
public class Main extends javax.swing.JFrame {  

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePlay1 = new GamePlay();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("Akanoid/Bundle"); // NOI18N
        setTitle(bundle.getString("Main.title")); // NOI18N
        setResizable(false);
        setSize(new Dimension(700, 600));

        GroupLayout gamePlay1Layout = new GroupLayout(gamePlay1);
        gamePlay1.setLayout(gamePlay1Layout);
        gamePlay1Layout.setHorizontalGroup(gamePlay1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(0, 700, Short.MAX_VALUE)
        );
        gamePlay1Layout.setVerticalGroup(gamePlay1Layout.createParallelGroup(GroupLayout.LEADING)
            .add(0, 600, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.LEADING)
            .add(gamePlay1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.LEADING)
            .add(gamePlay1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GamePlay gamePlay1;
    // End of variables declaration//GEN-END:variables
}
