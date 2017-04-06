/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlador.ControladorCamareros;
import javax.swing.ButtonGroup;

/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        jPanel2.setVisible(false);
        controlador = ControladorCamareros.getSingleton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanelOpciones = new javax.swing.JPanel();
        jButtonUsuario = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioMesa1 = new javax.swing.JRadioButton();
        jRadioMesa2 = new javax.swing.JRadioButton();
        jRadioMesa3 = new javax.swing.JRadioButton();
        jRadioMesa4 = new javax.swing.JRadioButton();
        jRadioMesa5 = new javax.swing.JRadioButton();
        jRadioMesa6 = new javax.swing.JRadioButton();
        jRadioMesa7 = new javax.swing.JRadioButton();
        jRadioMesa8 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelAsientos = new javax.swing.JLabel();
        jLabelNumeroAsientos = new javax.swing.JLabel();
        jLabelCamarero = new javax.swing.JLabel();
        jLabelNombreCamarero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("RESTAURANTE");

        jPanelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Cliente"));

        jButtonUsuario.setText("Aceptar");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("¿En que mesa estas sentado?"));

        buttonGroup1.add(jRadioMesa1);
        jRadioMesa1.setText("Mesa nº1");
        jRadioMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa2);
        jRadioMesa2.setText("Mesa nº2");
        jRadioMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa3);
        jRadioMesa3.setText("Mesa nº3");
        jRadioMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa4);
        jRadioMesa4.setText("Mesa nº4");
        jRadioMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa5);
        jRadioMesa5.setText("Mesa nº5");
        jRadioMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa6);
        jRadioMesa6.setText("Terraza nº1");
        jRadioMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa7);
        jRadioMesa7.setText("Terraza nº2");
        jRadioMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMesa8);
        jRadioMesa8.setText("Terraza nº3");
        jRadioMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMesa8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioMesa1)
                    .addComponent(jRadioMesa2)
                    .addComponent(jRadioMesa3)
                    .addComponent(jRadioMesa4)
                    .addComponent(jRadioMesa5)
                    .addComponent(jRadioMesa6)
                    .addComponent(jRadioMesa7)
                    .addComponent(jRadioMesa8))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioMesa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioMesa8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de la mesa:"));

        jLabelAsientos.setText("Numero de asientos:");

        jLabelCamarero.setText("Le atendera:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelAsientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCamarero))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addComponent(jLabelNombreCamarero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAsientos)
                    .addComponent(jLabelNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCamarero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionesLayout.createSequentialGroup()
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        menu.setVisible(true, controlador.getCamarero(camareroMesa), mesa);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonUsuarioActionPerformed
    
    private void jRadioMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa1ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("4");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(1));
        this.camareroMesa=1;
        this.mesa="Mesa 1";
    }//GEN-LAST:event_jRadioMesa1ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa2ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("4");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(2));
        this.camareroMesa=2;
        this.mesa="Mesa 2";
    }//GEN-LAST:event_jRadioMesa2ActionPerformed

    private void jRadioMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa3ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("6");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(2));
        this.camareroMesa=2;
        this.mesa="Mesa 3";
    }//GEN-LAST:event_jRadioMesa3ActionPerformed

    private void jRadioMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa4ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("6");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(3));
        this.camareroMesa=3;
        this.mesa="Mesa 4";
    }//GEN-LAST:event_jRadioMesa4ActionPerformed

    private void jRadioMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa5ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("8");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(1));
        this.camareroMesa=1;
        this.mesa="Mesa 5";
    }//GEN-LAST:event_jRadioMesa5ActionPerformed

    private void jRadioMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa6ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("4");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(0));
        this.camareroMesa=0;
        this.mesa="Terraza 1";
    }//GEN-LAST:event_jRadioMesa6ActionPerformed

    private void jRadioMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa7ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("4");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(0));
        this.camareroMesa=0;
        this.mesa="Terraza 2";
    }//GEN-LAST:event_jRadioMesa7ActionPerformed

    private void jRadioMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMesa8ActionPerformed
        // TODO add your handling code here:
        if(!jPanel2.isVisible()){
            jPanel2.setVisible(true);
        }
        jLabelNumeroAsientos.setText("4");
        jLabelNombreCamarero.setText(controlador.nombreCamarero(0));
        this.camareroMesa=0;
        this.mesa="Terraza 3";
    }//GEN-LAST:event_jRadioMesa8ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAsientos;
    private javax.swing.JLabel jLabelCamarero;
    private javax.swing.JLabel jLabelNombreCamarero;
    private javax.swing.JLabel jLabelNumeroAsientos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JRadioButton jRadioMesa1;
    private javax.swing.JRadioButton jRadioMesa2;
    private javax.swing.JRadioButton jRadioMesa3;
    private javax.swing.JRadioButton jRadioMesa4;
    private javax.swing.JRadioButton jRadioMesa5;
    private javax.swing.JRadioButton jRadioMesa6;
    private javax.swing.JRadioButton jRadioMesa7;
    private javax.swing.JRadioButton jRadioMesa8;
    // End of variables declaration//GEN-END:variables
    private ControladorCamareros controlador;
    private JDialogMenu menu = new JDialogMenu(this, true);
    private int camareroMesa;
    private String mesa;
}