
package view;

import java.awt.Image;
import java.awt.Toolkit;


public class MDIView extends javax.swing.JFrame {
    public MDIView() {
        initComponents();
        iniFavicon();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        mnuManejoUsuarios = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        MnuCliente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('s');
        fileMenu.setText("Sistema");
        fileMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('u');
        editMenu.setText("Usuarios");
        editMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        mnuManejoUsuarios.setMnemonic('m');
        mnuManejoUsuarios.setText("Manejo de Usuarios");
        mnuManejoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManejoUsuariosActionPerformed(evt);
            }
        });
        editMenu.add(mnuManejoUsuarios);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('c');
        helpMenu.setText("Clientes");
        helpMenu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        MnuCliente.setMnemonic('c');
        MnuCliente.setText("Clientes");
        MnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuClienteActionPerformed(evt);
            }
        });
        helpMenu.add(MnuCliente);

        menuBar.add(helpMenu);

        jMenu1.setMnemonic('v');
        jMenu1.setText("Ventas");
        jMenu1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        menuBar.add(jMenu1);

        jMenu2.setMnemonic('a');
        jMenu2.setText("Acerca de");
        jMenu2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnuManejoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManejoUsuariosActionPerformed
      usuarioView uv = new usuarioView(this,true);
      uv.setSize(this.getWidth(), this.getHeight() - 50);  /// le doy el tamaño al form
      uv.setLocation(-5, 45);  // le doy la posicion
      uv.setVisible(true);
        
    }//GEN-LAST:event_mnuManejoUsuariosActionPerformed

    private void MnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuClienteActionPerformed
      ClienteView cv = new ClienteView(this,true);
      cv.setSize(this.getWidth(), this.getHeight() - 50);  /// le doy el tamaño al form
      cv.setLocation(-5, 45);  // le doy la posicion
      cv.setVisible(true);
    
    }//GEN-LAST:event_MnuClienteActionPerformed
      
    private void iniFavicon(){
    Toolkit miForm = Toolkit.getDefaultToolkit();
    Image miIcono = miForm.getImage("src/images/quesologo.jpg");
    setIconImage(miIcono);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuCliente;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuManejoUsuarios;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
