/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Dominio.Alumno;
import Repository.Repositorio_Alumno_Db;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public class Ingreso_Alumno extends javax.swing.JFrame {

    Repositorio_Alumno_Db alumnos = new Repositorio_Alumno_Db();
    /**
     * Creates new form Ingreso_Alumno
     */
    public Ingreso_Alumno() {
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

        jLabel1 = new javax.swing.JLabel();
        txtid_alumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        cbnivel_grado = new javax.swing.JComboBox<>();
        cbcertificado_aprovacion = new javax.swing.JComboBox<>();
        cbcertificado_medico = new javax.swing.JComboBox<>();
        dtfecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingreso de Alumnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 23, -1, -1));
        getContentPane().add(txtid_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 85, 69, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 324, -1, -1));

        jLabel2.setText("Nivel de Grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 88, -1, -1));

        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 132, -1, -1));

        jLabel4.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 173, -1, -1));

        jLabel5.setText("Certificado de Aprovacion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 225, -1, -1));

        jLabel6.setText("Certificado Medico:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 276, -1, -1));

        jLabel7.setText("Direccion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 276, -1, -1));

        jLabel8.setText("id_alumno:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 88, -1, -1));

        jLabel9.setText("Cedula:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 132, -1, -1));

        jLabel10.setText("Nombre:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 173, -1, -1));

        jLabel11.setText("Apellidos:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 225, -1, -1));
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 129, 69, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 170, 69, -1));

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 222, 69, -1));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 273, 69, -1));

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 129, 79, -1));

        cbnivel_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "No Entregado" }));
        cbnivel_grado.setSelectedIndex(-1);
        getContentPane().add(cbnivel_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 85, 89, -1));

        cbcertificado_aprovacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "No Entregado" }));
        cbcertificado_aprovacion.setSelectedIndex(-1);
        getContentPane().add(cbcertificado_aprovacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 92, -1));

        cbcertificado_medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "No Entregado" }));
        cbcertificado_medico.setSelectedIndex(-1);
        getContentPane().add(cbcertificado_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 273, 89, -1));
        getContentPane().add(dtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 120, -1));

        jButton2.setText(".....");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Guardar*/
        Alumno alum = new Alumno();
        alum.setCedula(txtcedula.getText());
        alum.setNombre(txtnombre.getText());
        alum.setApellidos(txtapellidos.getText());
        alum.setDireccion(txtdireccion.getText());
        alum.setNivel_de_grado((String) cbnivel_grado.getSelectedItem());
        alum.setTelefono(Integer.parseInt(txttelefono.getText()));
        alum.setFecha_de_nacimiento(Convertirfecha());
        alum.setCertificado_aprovacion((String) cbcertificado_aprovacion.getSelectedItem());
        alum.setCertificado_medico((String) cbcertificado_medico.getSelectedItem());
        alumnos.ingresar(alum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Alumno alum = new Alumno();
        alum.setId_alumno(Integer.parseInt(txtid_alumno.getText()));
        alum.setCedula(txtcedula.getText());
        alum.setNombre(txtnombre.getText());
        alum.setApellidos(txtapellidos.getText());
        alum.setDireccion(txtdireccion.getText());
        alum.setNivel_de_grado((String) cbnivel_grado.getSelectedItem());
        alum.setTelefono(Integer.parseInt(txttelefono.getText()));
        alum.setFecha_de_nacimiento(Convertirfecha());
        alum.setCertificado_aprovacion((String) cbcertificado_aprovacion.getSelectedItem());
        alum.setCertificado_medico((String) cbcertificado_medico.getSelectedItem());
        alumnos.modificar(alum);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /*Consultar*/
        Alumno alum = new Alumno();
        alum.setId_alumno(Integer.parseInt(txtid_alumno.getText()));
        List<Alumno> alumno = alumnos.ConsultarId(alum);
        for (Alumno temp:alumno){
            txtcedula.setText(temp.getCedula());
            txtnombre.setText(temp.getNombre());
            txtapellidos.setText(temp.getApellidos());
            txtdireccion.setText(temp.getDireccion());
            cbnivel_grado.setSelectedItem(temp.getNivel_de_grado());
            txttelefono.setText(Integer.toString(temp.getTelefono()));
            dtfecha.setDate(temp.getFecha_de_nacimiento());
            cbcertificado_aprovacion.setSelectedItem(temp.getCertificado_aprovacion());
            cbcertificado_medico.setSelectedItem(temp.getCertificado_medico());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*Eliminar*/
        Alumno alum= new Alumno();
        alum.setId_alumno(Integer.parseInt(txtid_alumno.getText()));
        alumnos.eliminar(alum); 
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Alumno().setVisible(true);
            }
        });
    }
    public java.sql.Date Convertirfecha(){
        java.sql.Date fecha =new java.sql.Date(dtfecha.getDate().getTime());
        return fecha;
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcertificado_aprovacion;
    private javax.swing.JComboBox<String> cbcertificado_medico;
    private javax.swing.JComboBox<String> cbnivel_grado;
    private com.toedter.calendar.JDateChooser dtfecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid_alumno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
