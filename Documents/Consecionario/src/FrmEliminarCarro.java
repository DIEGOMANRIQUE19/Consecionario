
import java.util.HashMap;
import javax.swing.JOptionPane;
import vehiculos.Carro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class FrmEliminarCarro extends javax.swing.JFrame {

    public static HashMap<String, Carro> listaCarro = new HashMap<>();

    public FrmEliminarCarro() {
        this.listaCarro = FrmMenuCarro.getListaCarro();
        initComponents();
        this.btnEliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        serialCarro = new javax.swing.JLabel();
        txtSerialBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        Serial = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        Color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        Titulo.setText("Eliminar Carro");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        serialCarro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        serialCarro.setText("Serial carro");
        getContentPane().add(serialCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        getContentPane().add(txtSerialBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 92, 200, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 110, 30));

        Serial.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        Serial.setText("Serial");
        getContentPane().add(Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, -1));

        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });
        getContentPane().add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 190, -1));

        Color.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        Color.setText("Color");
        getContentPane().add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, -1));

        Marca.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        Marca.setText("Marca");
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 190, -1));

        Modelo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        Modelo.setText("Modelo");
        getContentPane().add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, 20));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 190, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 332, 120, 40));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, 40));

        btnVolver.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 332, 120, 40));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String serialCarro = this.txtSerialBuscar.getText();
        if (listaCarro.containsKey(serialCarro)) {
            Carro carro = listaCarro.get(serialCarro);
            this.txtSerial.setText(String.valueOf(carro.getSerial()));
            this.txtColor.setText(carro.getColor());
            this.txtMarca.setText(carro.getMarca());
            this.txtModelo.setText(String.valueOf(carro.getModelo()));
            this.btnEliminar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error, Carro no existe");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de eleiminar el carro");
        if (respuesta == JOptionPane.YES_OPTION) {
            listaCarro.remove(this.txtSerialBuscar.getText());
            this.btnLimpiar.doClick();
            JOptionPane.showMessageDialog(null, "Carro Eliminado");

        } else {
            JOptionPane.showMessageDialog(null, "Acción cancelada");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new FrmMenuCarro().setVisible(true);
        FrmMenuCarro.setListaCarro(listaCarro);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed

    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed

    }//GEN-LAST:event_txtColorActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed

    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       this.txtSerialBuscar.setText("");
       this.txtColor.setText("");
       this.txtMarca.setText("");
       this.txtModelo.setText("");
       this.txtSerial.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEliminarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEliminarCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEliminarCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Color;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Serial;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel serialCarro;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtSerialBuscar;
    // End of variables declaration//GEN-END:variables
}
