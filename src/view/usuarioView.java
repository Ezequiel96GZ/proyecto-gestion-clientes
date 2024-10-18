package view;

import dao.usuarioDAO;
import identities.usuario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class usuarioView extends javax.swing.JDialog {

    final int MODIFICAR = 1;
    final int AGREGAR = 2;
    int accion;
    int idusr=0;

    public usuarioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Manejo de Usuarios");
        getAllUsuarios();
        iniciarComponentes();
        focus.requestFocus();
    }

    private void setearEstadosCajas(boolean b) {
        txtUsuario.setEnabled(b);
        txtPassword.setEnabled(b);
        btnModificar.setEnabled(b);
        btnGuardar.setEnabled(b);
        chkActivo.setEnabled(b);
    }

    private void iniciarComponentes() {
        setearEstadosCajas(false);
    }
    
    private void listarUsuarios(LinkedList<usuario> Listado){
        LinkedList<usuario> listau = Listado;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("pass");
        modelo.addColumn("Activo");
        modelo.addColumn("FecUltIngreso");
        tblUsuarios.setModel(modelo);

        Object[] dato = new Object[5];  // id | nombre | password | estado | fechaui
        for (usuario u : listau) {
            dato[0] = u.getIdusuario();
            dato[1] = u.getNombre();
            dato[2] = u.getPassword();
            dato[3] = (u.isEstado() ? "Si" : "No");
            dato[4] = u.getFecultingreso();
            modelo.addRow(dato);
        }
        tblUsuarios.setModel(modelo);

        // Asignar tamaño a las columnas de la tabla
        TableColumnModel modeloColumna = tblUsuarios.getColumnModel();
        modeloColumna.getColumn(1).setPreferredWidth(180);
        modeloColumna.getColumn(0).setMinWidth(0);
        modeloColumna.getColumn(0).setMaxWidth(0);
        modeloColumna.getColumn(2).setMinWidth(0);
        modeloColumna.getColumn(2).setMaxWidth(0);
        modeloColumna.getColumn(4).setMinWidth(0);
        modeloColumna.getColumn(4).setMaxWidth(0);
    }
    
    private void getAllUsuarios() {
        usuarioDAO uDAO = new usuarioDAO();
        LinkedList<usuario> listau = uDAO.getAllUsuarios();
        listarUsuarios(listau);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        chkActivo = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        focus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        btnSalir.setMnemonic('s');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        txtPassword.setText("jPasswordField1");

        chkActivo.setBackground(new java.awt.Color(204, 255, 204));
        chkActivo.setForeground(new java.awt.Color(0, 0, 0));
        chkActivo.setText("Activo");

        btnAgregar.setMnemonic('a');
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGuardar.setMnemonic('g');
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setMnemonic('m');
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnExportar.setMnemonic('e');
        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnExportar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkActivo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                            .addComponent(focus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkActivo)
                        .addGap(29, 29, 29)
                        .addComponent(focus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        setearEstadosCajas(true);
        txtUsuario.setText("");
        txtPassword.setText("");
        chkActivo.setSelected(false);
        btnAgregar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        txtUsuario.requestFocus();
        accion = AGREGAR;
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // validar las cajas de usuario y pass
        if (accion == AGREGAR){
            if (!(txtUsuario.getText().isEmpty() || txtPassword.getText().isEmpty())) {
                usuario usu = new usuario(0, txtUsuario.getText(), txtPassword.getText(), chkActivo.isSelected(), Date.from(Instant.now()));
                // Llamar al DAO
                usuarioDAO uDAO = new usuarioDAO();

                if (uDAO.addUsuario(usu) > 0) {
                    JOptionPane.showMessageDialog(this, "El Usuario fue ingresado con éxito!");
                    getAllUsuarios();
                    setearEstadosCajas(false);
                    btnGuardar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El Usuario ya existe en la lista");
                    txtUsuario.selectAll();
                }
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Los campos NO pueden estar vacios!");
                txtUsuario.requestFocus();
            }
        }

        if (accion == MODIFICAR){
            if (!(txtUsuario.getText().isEmpty() || txtPassword.getText().isEmpty())) {
                usuario usu = new usuario(idusr, txtUsuario.getText(), txtPassword.getText(), chkActivo.isSelected(), Date.from(Instant.now()));
                // Llamar al DAO
                usuarioDAO uDAO = new usuarioDAO();

                if (uDAO.updateUsuario(usu) > 0) {
                    JOptionPane.showMessageDialog(this, "El Usuario fue modificado con éxito!");
                    getAllUsuarios();
                    setearEstadosCajas(false);
                    btnGuardar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                    tblUsuarios.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurrió un error al modificar el usuario");
                    txtUsuario.selectAll();
                }
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Los campos NO pueden estar vacios!");
                txtUsuario.requestFocus();
            }
        }        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        if (tblUsuarios.getRowCount() > 0) {
            int rou = tblUsuarios.getSelectedRow();
            idusr = (int) tblUsuarios.getValueAt(rou, 0);
            usuarioDAO udao = new usuarioDAO();
            usuario u = udao.getUsuarioByID(idusr);

            txtUsuario.setText(u.getNombre());
            txtPassword.setText(u.getPassword());
            chkActivo.setSelected(u.isEstado());

            if (tblUsuarios.isEnabled()) {
                btnModificar.setEnabled(true);
            } else {
                btnModificar.setEnabled(false);
            }
            btnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btnGuardar.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtPassword.setEnabled(true);
        chkActivo.setEnabled(true);
        txtUsuario.requestFocus();
        btnModificar.setEnabled(false);
        tblUsuarios.setEnabled(false);
        accion = MODIFICAR;
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        btnGuardar.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
        chkActivo.setEnabled(false);
        btnModificar.setEnabled(false);
        btnAgregar.setEnabled(true);
        tblUsuarios.setEnabled(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
     
      // listausu = udao.getAllUsuariosFind(datoabuscar);
       
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       LinkedList<usuario> listausu = new LinkedList<>();
       String datoabuscar;
       datoabuscar = txtBuscar.getText();
       usuarioDAO udao = new usuarioDAO();
       listausu = udao.getAllUsuariosFind(datoabuscar);
       listarUsuarios(listausu);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        usuarioDAO uDAO = new usuarioDAO();
        LinkedList<usuario> listau = uDAO.getAllUsuarios();
     
        
        FileWriter fw = null;
        JFileChooser fch = new JFileChooser();
        int seleccion = fch.showSaveDialog(this);

        if (seleccion == (JFileChooser.APPROVE_OPTION)) {
            File archivoexportado = (fch.getSelectedFile());
            try {
                fw = new FileWriter(archivoexportado);
                BufferedWriter bw = new BufferedWriter(fw);
                for (usuario u : listau) {
                    bw.write(u.getIdusuario()+ ";");
                    bw.write(u.getNombre()+ ";");
                    bw.write(u.getPassword()+ ";");
                    bw.write(u.getFecultingreso() + ";");
                    bw.write((u.isEstado())? "Si":"NO" + ";");
                    bw.newLine();
                }
                bw.close();
            } catch (IOException ex) {
                System.out.println("Fallo la exportacion de Usuarios");
            }
        }

        
        
        
        
    }//GEN-LAST:event_btnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JTextField focus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
