/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import helpers.StaticHelpers;
import javax.swing.JFrame;

/**
 *
 * @author Sistema30
 */
public class Main extends javax.swing.JFrame {
    private StaticHelpers stat;
    /**
     * Creates new form Main
     */
    public Main() {
        stat=new StaticHelpers("C$");
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

        MainPane = new javax.swing.JDesktopPane();
        mainmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cpropitem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Optionmn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamos EXPRESS");
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        javax.swing.GroupLayout MainPaneLayout = new javax.swing.GroupLayout(MainPane);
        MainPane.setLayout(MainPaneLayout);
        MainPaneLayout.setHorizontalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        MainPaneLayout.setVerticalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        getContentPane().add(MainPane, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Creditos");

        cpropitem.setText("Cuota proporcional");
        cpropitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpropitemActionPerformed(evt);
            }
        });
        jMenu1.add(cpropitem);

        mainmenu.add(jMenu1);

        jMenu2.setText("Opciones");

        Optionmn.setText("Unidad monetaria");
        Optionmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionmnActionPerformed(evt);
            }
        });
        jMenu2.add(Optionmn);

        mainmenu.add(jMenu2);

        setJMenuBar(mainmenu);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpropitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpropitemActionPerformed
        CreditoFrame credit=new CreditoFrame();
        credit.setStat(stat);
        MainPane.add(credit,true);
        credit.setVisible(true);
    }//GEN-LAST:event_cpropitemActionPerformed

    private void OptionmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionmnActionPerformed
        UnitDlg unit=new UnitDlg(this, true);
        unit.setStat(stat);      
        unit.setVisible(true);
    }//GEN-LAST:event_OptionmnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainPane;
    private javax.swing.JMenuItem Optionmn;
    private javax.swing.JMenuItem cpropitem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar mainmenu;
    // End of variables declaration//GEN-END:variables
}
