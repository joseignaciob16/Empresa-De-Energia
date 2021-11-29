import javax.swing.JOptionPane;

/** @author Jose Ignacio */

public class Login extends javax.swing.JFrame {

    Vista ventana = new Vista();
        
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AfiniaEPM (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        jPanel4.setBackground(new java.awt.Color(33, 45, 62));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 37, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 129, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 239, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 209, 310, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Email_25px.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 169, 48, 36));

        txtusuario.setBackground(new java.awt.Color(33, 45, 62));
        txtusuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(73, 181, 172));
        txtusuario.setBorder(null);
        txtusuario.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel4.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 169, 270, 40));

        txtpassword.setBackground(new java.awt.Color(33, 45, 62));
        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+7f));
        txtpassword.setForeground(new java.awt.Color(73, 181, 172));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel4.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 269, 270, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Lock_25px.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 259, 48, 42));

        jCheckBox1.setBackground(new java.awt.Color(33, 45, 62));
        jCheckBox1.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recuérdame");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, -1));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 309, 310, 10));

        btnIngresar.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFocusable(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 210, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 0, 16, -1));

        txtmensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmensaje.setForeground(new java.awt.Color(73, 181, 172));
        jPanel4.add(txtmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 220, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 380, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            String usuario = txtusuario.getText();
            String password = txtpassword.getText();
            
            if (usuario.equals("Jose Ignacio") && password.equalsIgnoreCase("password")) {
                ventana.setVisible(true);
                this.dispose();
            } else {
                txtmensaje.setText("Usuario y/o Contraseña incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Usuario y Contraseña");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtmensaje;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
