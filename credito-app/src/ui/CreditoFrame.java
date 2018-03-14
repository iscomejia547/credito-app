/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.sun.glass.events.KeyEvent;
import helpers.StaticHelpers;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sistema30
 */
public class CreditoFrame extends javax.swing.JInternalFrame {
    
    private final Object[] headers={"N°", "Interés", "Amortizacion", "Cuota", "Saldo"};
    private DefaultTableModel mod;

    /**
     * Creates new form CreditoFrame
     */
    public CreditoFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        montotxt = new javax.swing.JTextField();
        cuotastxt = new javax.swing.JTextField();
        tasatxt = new javax.swing.JTextField();
        calcbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Monto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("N° de Cuotas (Mensual)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Tasa %");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        montotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                montotxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montotxtKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel1.add(montotxt, gridBagConstraints);

        cuotastxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuotastxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuotastxtKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 15);
        jPanel1.add(cuotastxt, gridBagConstraints);

        tasatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tasatxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasatxtKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel1.add(tasatxt, gridBagConstraints);

        calcbtn.setText("Calcular");
        calcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbtnActionPerformed(evt);
            }
        });
        calcbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcbtnKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(calcbtn, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        cTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(cTable);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 626, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mod=new DefaultTableModel(new Object[0][0], headers);
        cTable.setModel(mod);
    }//GEN-LAST:event_formInternalFrameOpened

    private void calcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbtnActionPerformed
        add();
    }//GEN-LAST:event_calcbtnActionPerformed

    private void calcbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcbtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcbtnKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            add();
        }
    }//GEN-LAST:event_formKeyPressed

    private void montotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montotxtKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            montotxt.setBorder(
                    new javax.swing.border.LineBorder(
                            new java.awt.Color(255, 0, 0),
                            1, true));
        }else{
            montotxt.setBorder(
                    new javax.swing.border.LineBorder(null));
        }
    }//GEN-LAST:event_montotxtKeyTyped

    private void tasatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasatxtKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
            tasatxt.setBorder(
                    new javax.swing.border.LineBorder(
                            new java.awt.Color(255, 0, 0),
                            1, true));
        }else{
            tasatxt.setBorder(
                    new javax.swing.border.LineBorder(null));
        }
    }//GEN-LAST:event_tasatxtKeyTyped

    private void cuotastxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotastxtKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            montotxt.setBorder(
                    new javax.swing.border.LineBorder(
                            new java.awt.Color(255, 0, 0),
                            1, true));
        }else{
            montotxt.setBorder(
                    new javax.swing.border.LineBorder(null));
        }
    }//GEN-LAST:event_cuotastxtKeyTyped

    private void cuotastxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotastxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            add();
        }
    }//GEN-LAST:event_cuotastxtKeyPressed

    private void montotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montotxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            add();
        }
    }//GEN-LAST:event_montotxtKeyPressed

    private void tasatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasatxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            add();
        }
    }//GEN-LAST:event_tasatxtKeyPressed

    private void add(){
        if(montotxt.getText().isEmpty() || tasatxt.getText().isEmpty() || cuotastxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos necesarios", 
                    "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        float capital=Float.parseFloat(montotxt.getText());
        float tasa=Float.parseFloat(tasatxt.getText())/100;
        int n=Integer.parseInt(cuotastxt.getText());
        Object[][] table=StaticHelpers.calc(capital, (tasa/12), n);//tasa convertida a mensual
        mod=new DefaultTableModel(table, headers);
        cTable.setModel(mod);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cTable;
    private javax.swing.JButton calcbtn;
    private javax.swing.JTextField cuotastxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField montotxt;
    private javax.swing.JTextField tasatxt;
    // End of variables declaration//GEN-END:variables
}
