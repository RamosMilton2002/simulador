/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_superm;

import java.awt.Color;
import static java.awt.PageAttributes.MediaType.C;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author MSI-THIN
 */
public class SuperM extends javax.swing.JFrame {

    /**
     * Creates new form SuperM
     */
    public ArrayList<JLabel> cajas;
    public ArrayList<JLabel> clientes;
    private Random random;
    private Timer timer;

    public SuperM() {
        initComponents();
       
        cajas = new ArrayList<>();
       
        cajas.add(lblCj2);
        cajas.add(lblCj3);

        clientes = new ArrayList<>();
        clientes.add(lblCli1);
        clientes.add(lblCli2);
        clientes.add(lblS1);
        clientes.add(lblCli3);
        clientes.add(lblCli4);
        clientes.add(lblS2);
        clientes.add(lblCli5);
        clientes.add(lblCli6);
        clientes.add(lblS3);
        clientes.add(lblCli7);
        clientes.add(lblCli8);
        clientes.add(lblS4);
        clientes.add(lblCli9);
        clientes.add(lblCli10);
        clientes.add(lblS5);
        clientes.add(lblCli11);
        clientes.add(lblCli12);
        clientes.add(lblS6);
        

   

        for (JLabel cliente : clientes) {
            cliente.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCli9 = new javax.swing.JLabel();
        lblCli10 = new javax.swing.JLabel();
        lblCli11 = new javax.swing.JLabel();
        lblCli12 = new javax.swing.JLabel();
        lblCj1 = new javax.swing.JLabel();
        lblCj2 = new javax.swing.JLabel();
        lblCj3 = new javax.swing.JLabel();
        lblCj4 = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();
        btnIni = new javax.swing.JButton();
        lblCli5 = new javax.swing.JLabel();
        lblCli1 = new javax.swing.JLabel();
        lblCli6 = new javax.swing.JLabel();
        lblCli2 = new javax.swing.JLabel();
        lblCli7 = new javax.swing.JLabel();
        lblCli3 = new javax.swing.JLabel();
        lblCli8 = new javax.swing.JLabel();
        lblCli4 = new javax.swing.JLabel();
        lblS1 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        lblS4 = new javax.swing.JLabel();
        lblS5 = new javax.swing.JLabel();
        lblS6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCli9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hombre.png"))); // NOI18N
        jPanel1.add(lblCli9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, -1));

        lblCli10.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        lblCli10.setText("jLabel2");
        jPanel1.add(lblCli10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 221, 59, -1));

        lblCli11.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        lblCli11.setText("jLabel3");
        jPanel1.add(lblCli11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 379, 72, -1));

        lblCli12.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        lblCli12.setText("jLabel4");
        jPanel1.add(lblCli12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 540, 62, -1));

        lblCj1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\cashier_machine_cash_register_pos_icon_225201.png")); // NOI18N
        lblCj1.setText("jLabel5");
        jPanel1.add(lblCj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 69, -1));

        lblCj2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\cashier_machine_cash_register_pos_icon_225201.png")); // NOI18N
        lblCj2.setText("jLabel6");
        jPanel1.add(lblCj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 69, -1));

        lblCj3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\cashier_machine_cash_register_pos_icon_225201.png")); // NOI18N
        lblCj3.setText("jLabel7");
        jPanel1.add(lblCj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 69, -1));

        lblCj4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\cashier_machine_cash_register_pos_icon_225201.png")); // NOI18N
        lblCj4.setText("jLabel8");
        jPanel1.add(lblCj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 69, -1));

        lblSal.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\exit_door_cinema_icon_190851.png")); // NOI18N
        lblSal.setText("jLabel9");
        jPanel1.add(lblSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 60, -1));

        btnIni.setText("INICIAR");
        btnIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniActionPerformed(evt);
            }
        });
        jPanel1.add(btnIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, -1, -1));

        lblCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mujer.png"))); // NOI18N
        lblCli5.setText("jLabel1");
        jPanel1.add(lblCli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 72, 62, -1));

        lblCli1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        lblCli1.setText("jLabel2");
        jPanel1.add(lblCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 68, 67, -1));

        lblCli6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        lblCli6.setText("jLabel3");
        jPanel1.add(lblCli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 217, 62, -1));

        lblCli2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        lblCli2.setText("jLabel4");
        jPanel1.add(lblCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 221, 59, -1));

        lblCli7.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        lblCli7.setText("jLabel5");
        jPanel1.add(lblCli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 383, 62, -1));

        lblCli3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        lblCli3.setText("jLabel6");
        jPanel1.add(lblCli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 379, 69, -1));

        lblCli8.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        lblCli8.setText("jLabel7");
        jPanel1.add(lblCli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 526, 62, -1));

        lblCli4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        lblCli4.setText("jLabel8");
        jPanel1.add(lblCli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 530, 59, -1));

        lblS1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        jPanel1.add(lblS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        lblS2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        jPanel1.add(lblS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        lblS3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        jPanel1.add(lblS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        lblS4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        jPanel1.add(lblS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 50, 70));

        lblS5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\User-80_icon-icons.com_57249 (1).png")); // NOI18N
        jPanel1.add(lblS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 70, -1));

        lblS6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSI-THIN\\Downloads\\customer_person_people_woman_you_1627 (1).png")); // NOI18N
        jPanel1.add(lblS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniActionPerformed
        // TODO add your handling code here:
        
            int index = obtenerCajaConColaMenor();
            if (index != -1) {
                JLabel cliente = obtenerClienteDisponible();
                if (cliente != null) {
                    cliente.setVisible(true);
                    atenderCliente(cliente);
                }
            }
        
        

    }//GEN-LAST:event_btnIniActionPerformed

    private int obtenerCajaConColaMenor() {
        int colaMenor = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < cajas.size(); i++) {
            int cola = obtenerCola();
            if (cola < colaMenor) {
                colaMenor = cola;
               
            }
        }
        return index;
    }

    private int obtenerCola() {
        int contador = 0;
        for (JLabel cliente : clientes) {
            if (cliente.isVisible()) {
                contador++;
            }
        }
        return contador;
    }

    private JLabel obtenerClienteDisponible() {
        for (JLabel cliente : clientes) {
            if (!cliente.isVisible()) {
                return cliente;
            }
        }
        return null;
    }

    private void atenderCliente(JLabel cliente) {
        int tiempoAtencion = random.nextInt(7000) +1000; 
            cliente.setVisible(false);
            iniciarSalidaCliente(cliente);  
        
    }

    /**
     * @param args the command line arguments
     */
    private void iniciarSalidaCliente(JLabel cliente) {
            cliente.setVisible(!cliente.isVisible());
    }

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
            java.util.logging.Logger.getLogger(SuperM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCj1;
    private javax.swing.JLabel lblCj2;
    private javax.swing.JLabel lblCj3;
    private javax.swing.JLabel lblCj4;
    private javax.swing.JLabel lblCli1;
    private javax.swing.JLabel lblCli10;
    private javax.swing.JLabel lblCli11;
    private javax.swing.JLabel lblCli12;
    private javax.swing.JLabel lblCli2;
    private javax.swing.JLabel lblCli3;
    private javax.swing.JLabel lblCli4;
    private javax.swing.JLabel lblCli5;
    private javax.swing.JLabel lblCli6;
    private javax.swing.JLabel lblCli7;
    private javax.swing.JLabel lblCli8;
    private javax.swing.JLabel lblCli9;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblS4;
    private javax.swing.JLabel lblS5;
    private javax.swing.JLabel lblS6;
    private javax.swing.JLabel lblSal;
    // End of variables declaration//GEN-END:variables
}
