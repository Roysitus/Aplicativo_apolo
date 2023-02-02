
package Vista;

import Controlador.Docente;
import dao.clases.docenteCAD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Docentes_ extends javax.swing.JFrame {

    docenteCAD cad_docente = new docenteCAD();
    public Docentes_() {
        initComponents();
        muestra();
    }
    void muestra() {
        DefaultTableModel dts = (DefaultTableModel) jTable1.getModel();
        dts.setRowCount(0);
        for (Docente p : cad_docente.obtener()) {
            Object v[] = {p.getId_docente(),p.getNombre(),p.getApellido(),p.getEspecilidad(),p.getTipo()};
            dts.addRow(v);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombreCreate = new javax.swing.JTextField();
        txtApellidoCreate = new javax.swing.JTextField();
        btnCrearDocente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbEspecialidadCreate = new javax.swing.JComboBox<>();
        cbTipoCreate = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtNombreUpdate = new javax.swing.JTextField();
        txtApellidoUpdate = new javax.swing.JTextField();
        btnActualizarDocente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtIDupdate = new javax.swing.JTextField();
        cbEspecialidadUpdate = new javax.swing.JComboBox<>();
        cbTipoCreateUpdate = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txtIDdelete = new javax.swing.JTextField();
        btnEliminarDocente = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Docente"));

        txtNombreCreate.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtApellidoCreate.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        btnCrearDocente.setText("Crear Docente");
        btnCrearDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDocenteActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        cbEspecialidadCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desarrollo Web", "Programacion" }));
        cbEspecialidadCreate.setBorder(javax.swing.BorderFactory.createTitledBorder("Especialidad"));

        cbTipoCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BACKEND", "FRONT END", "JAVA", "PYTHON", "KOTLIN" }));
        cbTipoCreate.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrearDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbEspecialidadCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTipoCreate)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbEspecialidadCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearDocente)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Docentes"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id docente", "Nombre", "Apellido", "Especialidad", "Tipo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Docente"));

        txtNombreUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtApellidoUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        btnActualizarDocente.setText("Actualizar Docente");
        btnActualizarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDocenteActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar");

        txtIDupdate.setEditable(false);
        txtIDupdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Id docente"));

        cbEspecialidadUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desarrollo Web", "Programacion" }));
        cbEspecialidadUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Especialidad"));

        cbTipoCreateUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BACKEND", "FRONT END", "JAVA", "PYTHON", "KOTLIN" }));
        cbTipoCreateUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNombreUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizarDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbEspecialidadUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoCreateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(txtIDupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIDupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecialidadUpdate)
                    .addComponent(cbTipoCreateUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarDocente)
                    .addComponent(jButton4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Docente"));

        txtIDdelete.setEditable(false);
        txtIDdelete.setBorder(javax.swing.BorderFactory.createTitledBorder("Id docente"));

        btnEliminarDocente.setText("Eliminar Docente");
        btnEliminarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDocenteActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIDdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarDocente)
                    .addComponent(jButton6))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDocenteActionPerformed
        String nombre, apellido, tipo, especialidad;
        nombre = txtNombreCreate.getText();
        apellido = txtApellidoCreate.getText();
        tipo = cbTipoCreate.getSelectedItem().toString();
        especialidad = cbEspecialidadCreate.getSelectedItem().toString();
        Docente d = new Docente(nombre, apellido, "", especialidad, tipo);
        cad_docente.crear(d);
        muestra();
        JOptionPane.showMessageDialog(null, "Cliente creado con exito");
    }//GEN-LAST:event_btnCrearDocenteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        txtIDupdate.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txtNombreUpdate.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txtApellidoUpdate.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        txtIDdelete.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnActualizarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDocenteActionPerformed
        String nombre, apellido, dni, id_docente, tipo , especialidad;
        int edad;
        id_docente = txtIDupdate.getText();
        nombre = txtNombreUpdate.getText();
        apellido = txtApellidoUpdate.getText();
        tipo = cbEspecialidadUpdate.getSelectedItem().toString();
        especialidad = cbEspecialidadUpdate.getSelectedItem().toString();
        Docente d = new Docente(nombre, apellido, id_docente, especialidad, tipo);
        cad_docente.actualizar(d);
        muestra();
        JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
    }//GEN-LAST:event_btnActualizarDocenteActionPerformed

    private void btnEliminarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDocenteActionPerformed
        String id_docente = txtIDdelete.getText();
        //sql
        cad_docente.borrar(id_docente);
        muestra();
        JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
    }//GEN-LAST:event_btnEliminarDocenteActionPerformed

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
            java.util.logging.Logger.getLogger(Docentes_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docentes_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docentes_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docentes_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docentes_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDocente;
    private javax.swing.JButton btnCrearDocente;
    private javax.swing.JButton btnEliminarDocente;
    private javax.swing.JComboBox<String> cbEspecialidadCreate;
    private javax.swing.JComboBox<String> cbEspecialidadUpdate;
    private javax.swing.JComboBox<String> cbTipoCreate;
    private javax.swing.JComboBox<String> cbTipoCreateUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidoCreate;
    private javax.swing.JTextField txtApellidoUpdate;
    private javax.swing.JTextField txtIDdelete;
    private javax.swing.JTextField txtIDupdate;
    private javax.swing.JTextField txtNombreCreate;
    private javax.swing.JTextField txtNombreUpdate;
    // End of variables declaration//GEN-END:variables
}
