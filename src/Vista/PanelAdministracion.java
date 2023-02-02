package Vista;

import Controlador.Administrador;
import Controlador.Usuario;
import dao.clases.administradorCAD;
import dao.clases.usuarioCAD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAdministracion extends javax.swing.JFrame {

    administradorCAD cad_administrador = new administradorCAD();
    usuarioCAD cad_usuario = new usuarioCAD();

    public PanelAdministracion() {
        initComponents();
        muestra_admins();
        muestra_usuarios();
    }

    void muestra_admins() {
        DefaultTableModel dts = (DefaultTableModel) tablaAdministracion.getModel();
        dts.setRowCount(0);
        for (Administrador p : cad_administrador.obtener()) {
            Object v[] = {p.getId_usuario(),p.getContraseña(),p.getNombre(),p.getApellido(),p.getDni(),p.getCorreo(),p.getEdad()};
            dts.addRow(v);
        }
    }
    void muestra_usuarios() {
        DefaultTableModel dt = (DefaultTableModel) tablaUsuario.getModel();
        dt.setRowCount(0);
        for (Usuario p : cad_usuario.obtener()) {
            Object v[] = {p.getId_usuario(),p.getContraseña(),p.getNombre(),p.getApellido(),p.getDni(),p.getCorreo(),p.getEdad()};
            dt.addRow(v);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdministracion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbTipo1 = new javax.swing.JComboBox<>();
        txtContraseña1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtDni1 = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtID_USUARIO = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbTipo2 = new javax.swing.JComboBox<>();
        txtID_USUARIO1 = new javax.swing.JTextField();
        btnActualizar1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaAdministracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_USUARIO", "CONTRASEÑA", "NOMBRE", "APELLIDO", "DNI", "CORREO", "EDAD"
            }
        ));
        jScrollPane1.setViewportView(tablaAdministracion);

        jLabel1.setText("Cuentas de Administracion");

        jLabel2.setText("Cuentas de Usuarios");

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_USUARIO", "CONTRASEÑA", "NOMBRE", "APELLIDO", "DNI", "CORREO", "EDAD"
            }
        ));
        jScrollPane3.setViewportView(tablaUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Cuentas", jPanel1);

        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuarios" }));
        cbTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo"));

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        jTextField7.setEditable(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario Generado"));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEdad)
                    .addComponent(txtDni)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 255, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(161, 161, 161))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Cuentas", jPanel2);

        cbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuarios" }));
        cbTipo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        txtContraseña1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        txtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtApellido1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        txtDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));

        txtCorreo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo"));

        txtEdad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtID_USUARIO.setBorder(javax.swing.BorderFactory.createTitledBorder("Id usuario"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEdad1)
                        .addComponent(txtDni1)
                        .addComponent(txtCorreo1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtApellido1)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbTipo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContraseña1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtID_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(161, 161, 161))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtID_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Cuentas", jPanel3);

        cbTipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuarios" }));
        cbTipo2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        txtID_USUARIO1.setBorder(javax.swing.BorderFactory.createTitledBorder("Id usuario"));

        btnActualizar1.setText("Eliminar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        jButton5.setText("Nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID_USUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID_USUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Cuentas", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id_usuario = "", contraseña, nombre, apellido, dni, correo, tipo;
        int edad;
        contraseña = txtContraseña.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        dni = txtDni.getText();
        correo = txtCorreo.getText();
        tipo = cbTipo.getSelectedItem().toString();
        edad = Integer.parseInt(txtEdad.getText());
        switch (tipo) {
            case "Administrador":
                Administrador administrador = new Administrador(id_usuario, contraseña, nombre, apellido, dni, correo, edad);
                cad_administrador.crear(administrador);
                JOptionPane.showMessageDialog(null, "Administrador Creado con exito");
                jTextField7.setText(cad_administrador.obtener().get((cad_administrador.obtener().size() - 1)).getId_usuario());
                break;
            case "Usuarios":
                Usuario usuario = new Usuario(id_usuario, contraseña, nombre, apellido, dni, correo, edad);
                cad_usuario.crear(usuario);
                JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                jTextField7.setText(cad_usuario.obtener().get((cad_usuario.obtener().size() - 1)).getId_usuario());
                break;
        }
        muestra_admins();
        muestra_usuarios();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String id_usuario = txtID_USUARIO.getText(), contraseña, nombre, apellido, dni, correo, tipo;
        int edad;
        tipo = cbTipo1.getSelectedItem().toString();
        switch (tipo) {
            case "Administrador":
                contraseña = txtContraseña1.getText();
                nombre = txtNombre1.getText();
                apellido = txtApellido1.getText();
                dni = txtDni1.getText();
                correo = txtCorreo1.getText();
                edad = Integer.parseInt(txtEdad1.getText());
                Administrador bus_admin = cad_administrador.buscar(id_usuario);
                if (bus_admin == null) {
                    JOptionPane.showMessageDialog(null, "El id usuario del administrador no existe");
                } else {
                    bus_admin.setContraseña(contraseña);
                    bus_admin.setNombre(nombre);
                    bus_admin.setApellido(apellido);
                    bus_admin.setDni(dni);
                    bus_admin.setCorreo(correo);
                    bus_admin.setEdad(edad);
                    cad_administrador.actualizar(bus_admin);
                    JOptionPane.showMessageDialog(null, "Actualizacion correcta");
                }
                break;
            case "Usuarios":
                contraseña = txtContraseña1.getText();
                nombre = txtNombre1.getText();
                apellido = txtApellido1.getText();
                dni = txtDni1.getText();
                correo = txtCorreo1.getText();
                edad = Integer.parseInt(txtEdad1.getText());
                Usuario bus_user = cad_usuario.buscar(id_usuario);
                if (bus_user == null) {
                    JOptionPane.showMessageDialog(null, "El id usuario del usuario no existe");
                } else {
                    bus_user.setContraseña(contraseña);
                    bus_user.setNombre(nombre);
                    bus_user.setApellido(apellido);
                    bus_user.setDni(dni);
                    bus_user.setCorreo(correo);
                    bus_user.setEdad(edad);
                    cad_usuario.actualizar(bus_user);
                    JOptionPane.showMessageDialog(null, "Actualizacion correcta");
                }
                break;
        }
        muestra_admins();
        muestra_usuarios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        String tipo, id_usuario;
        tipo = cbTipo2.getSelectedItem().toString();
        id_usuario = txtID_USUARIO1.getText();
        switch (tipo) {
            case "Administrador":
                Administrador bus_a = cad_administrador.buscar(id_usuario);
                if (bus_a == null) {
                    JOptionPane.showMessageDialog(null, "El id administrador del usuario no existe");
                } else {
                    cad_administrador.borrar(id_usuario);
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                }
                break;
            case "Usuarios":
                Usuario bus_u = cad_usuario.buscar(id_usuario);
                if (bus_u == null) {
                    JOptionPane.showMessageDialog(null, "El id usuario del usuario no existe");
                } else {
                    cad_usuario.borrar(id_usuario);
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                }
                break;
        }
        muestra_admins();
        muestra_usuarios();
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTipo1;
    private javax.swing.JComboBox<String> cbTipo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tablaAdministracion;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtContraseña1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtID_USUARIO;
    private javax.swing.JTextField txtID_USUARIO1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
