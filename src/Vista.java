
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jose Ignacio
 */
public class Vista extends javax.swing.JFrame {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - ");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");

    float Ganancias = 0;
    int contfact = 1;

    Modelo Datos = new Modelo(10);

    int i = 0;

    DefaultListModel deflistaFacturas = new DefaultListModel();

    public Vista() {
        initComponents();
        listFacturas.setModel(deflistaFacturas);
        btnGuardar.setBackground(new java.awt.Color(44, 59, 66));
        this.setLocationRelativeTo(null);
        txtganancias.setText(String.valueOf(Ganancias));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFinanzas = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnlGuardar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btngd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtdireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtpropietario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txttelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtestrato = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pnlUsuarios = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        pnlFinanzas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtbuscarId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtpropietario1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        txtestrato1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        txtlecturaactual = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtconsumo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        BuscarPropietario = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listFacturas = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        txtganancias = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 45, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(54, 127, 168));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("online");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 30));

        btnFinanzas.setBackground(new java.awt.Color(34, 45, 49));
        btnFinanzas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnFinanzas.setForeground(new java.awt.Color(255, 255, 255));
        btnFinanzas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFinanzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-orden-de-compra-30.png"))); // NOI18N
        btnFinanzas.setText("Facturación");
        btnFinanzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanzas.setOpaque(true);
        btnFinanzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinanzasMouseClicked(evt);
            }
        });
        jPanel2.add(btnFinanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 30));

        lblUser.setBackground(new java.awt.Color(54, 127, 168));
        lblUser.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setText("Jose Ignacio");
        jPanel2.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        btnSalir.setBackground(new java.awt.Color(34, 45, 49));
        btnSalir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 30));

        btnGuardar.setBackground(new java.awt.Color(34, 45, 49));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-guardar-30.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        btnUsuarios.setBackground(new java.awt.Color(34, 45, 49));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-tareas-30.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setOpaque(true);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        jPanel2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jLabel11.setBackground(new java.awt.Color(54, 127, 168));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel18.setBackground(new java.awt.Color(54, 127, 168));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Afinia EPM");
        jLabel18.setOpaque(true);
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

        jPanel3.setBackground(new java.awt.Color(60, 141, 188));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(54, 127, 168));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 40));

        jLabel4.setBackground(new java.awt.Color(54, 127, 168));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Afinia EPM");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 690, 40));

        jPanel6.setLayout(new java.awt.CardLayout());

        pnlGuardar.setBackground(new java.awt.Color(236, 239, 244));
        pnlGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-guardar-30.png"))); // NOI18N
        jLabel10.setText("Home  >");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Guardar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlGuardar.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Ingreso de Usuario");
        pnlGuardar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID Propietario:");
        pnlGuardar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtid.setBackground(new java.awt.Color(236, 239, 244));
        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtid.setBorder(null);
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGuardar.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 20));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Propietario:");
        pnlGuardar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Direccíon:");
        pnlGuardar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono:");
        pnlGuardar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Estrato:");
        pnlGuardar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        btngd.setBackground(new java.awt.Color(60, 141, 188));
        btngd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btngd.setForeground(new java.awt.Color(255, 255, 255));
        btngd.setText("Guardar ");
        btngd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngdActionPerformed(evt);
            }
        });
        pnlGuardar.add(btngd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));
        pnlGuardar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 10));

        txtdireccion.setBackground(new java.awt.Color(236, 239, 244));
        txtdireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtdireccion.setBorder(null);
        txtdireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGuardar.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));
        pnlGuardar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 10));

        txtpropietario.setBackground(new java.awt.Color(236, 239, 244));
        txtpropietario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpropietario.setBorder(null);
        txtpropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGuardar.add(txtpropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));
        pnlGuardar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 10));

        txttelefono.setBackground(new java.awt.Color(236, 239, 244));
        txttelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttelefono.setBorder(null);
        txttelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGuardar.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, 20));
        pnlGuardar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, 10));

        txtestrato.setBackground(new java.awt.Color(236, 239, 244));
        txtestrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtestrato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtestrato.setBorder(null);
        txtestrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlGuardar.add(txtestrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, 20));
        pnlGuardar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 40, 10));

        jPanel6.add(pnlGuardar, "card2");

        pnlUsuarios.setBackground(new java.awt.Color(236, 239, 244));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Usuarios Registrados");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-tareas-30.png"))); // NOI18N
        jLabel21.setText("Home  >");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Usuarios");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Propietario", "Direccion", "Telefono", "Estrato"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
        );

        jPanel6.add(pnlUsuarios, "card3");

        pnlFinanzas.setBackground(new java.awt.Color(236, 239, 244));
        pnlFinanzas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Generar Facturas");
        pnlFinanzas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 150, 30));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-orden-de-compra-30.png"))); // NOI18N
        jLabel24.setText("Home  >");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Finanzas");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(0, 406, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlFinanzas.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("ID Propietario:");
        pnlFinanzas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 99, -1, -1));

        txtbuscarId.setBackground(new java.awt.Color(236, 239, 244));
        txtbuscarId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscarId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbuscarId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFinanzas.add(txtbuscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 99, 108, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Propietario:");
        pnlFinanzas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        txtpropietario1.setEditable(false);
        txtpropietario1.setBackground(new java.awt.Color(236, 239, 244));
        txtpropietario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpropietario1.setBorder(null);
        txtpropietario1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlFinanzas.add(txtpropietario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 150, 100, -1));
        pnlFinanzas.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 170, 110, 10));

        jLabel30.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Estrato:");
        pnlFinanzas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 198, -1, -1));

        txtestrato1.setEditable(false);
        txtestrato1.setBackground(new java.awt.Color(236, 239, 244));
        txtestrato1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtestrato1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtestrato1.setBorder(null);
        txtestrato1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlFinanzas.add(txtestrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 198, 40, -1));
        pnlFinanzas.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 218, 40, 10));

        jLabel31.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Lectura Antigua:");
        pnlFinanzas.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 20));

        txtlecturaactual.setEditable(false);
        txtlecturaactual.setBackground(new java.awt.Color(236, 239, 244));
        txtlecturaactual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtlecturaactual.setBorder(null);
        txtlecturaactual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlFinanzas.add(txtlecturaactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));
        pnlFinanzas.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, 10));

        txtconsumo.setBackground(new java.awt.Color(236, 239, 244));
        txtconsumo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtconsumo.setBorder(null);
        txtconsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFinanzas.add(txtconsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 297, 110, -1));

        jLabel32.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Lectura Actual:");
        pnlFinanzas.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 296, -1, -1));
        pnlFinanzas.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 318, 110, 10));

        BuscarPropietario.setBackground(new java.awt.Color(60, 141, 188));
        BuscarPropietario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-package-search-30.png"))); // NOI18N
        BuscarPropietario.setBorder(null);
        BuscarPropietario.setBorderPainted(false);
        BuscarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPropietarioActionPerformed(evt);
            }
        });
        pnlFinanzas.add(BuscarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        btnGenerarFactura.setBackground(new java.awt.Color(60, 141, 188));
        btnGenerarFactura.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        pnlFinanzas.add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 356, -1, -1));

        listFacturas.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(listFacturas);

        pnlFinanzas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 230, 330));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 204, 0));
        jLabel28.setText("$");
        pnlFinanzas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 30));

        txtganancias.setEditable(false);
        txtganancias.setBackground(new java.awt.Color(236, 239, 244));
        txtganancias.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtganancias.setForeground(new java.awt.Color(0, 204, 0));
        txtganancias.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtganancias.setBorder(null);
        txtganancias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlFinanzas.add(txtganancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 100, 30));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Ganancias = ");
        pnlFinanzas.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 120, 30));

        jPanel6.add(pnlFinanzas, "card4");

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 580, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        btnGuardar.setBackground(new java.awt.Color(44, 59, 66));
        pnlGuardar.setVisible(true);

        btnUsuarios.setBackground(new java.awt.Color(34, 45, 49));
        pnlUsuarios.setVisible(false);

        btnFinanzas.setBackground(new java.awt.Color(34, 45, 49));
        pnlFinanzas.setVisible(false);
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        btnGuardar.setBackground(new java.awt.Color(34, 45, 49));
        pnlGuardar.setVisible(false);

        btnUsuarios.setBackground(new java.awt.Color(44, 59, 66));
        pnlUsuarios.setVisible(true);

        btnFinanzas.setBackground(new java.awt.Color(34, 45, 49));
        pnlFinanzas.setVisible(false);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnFinanzasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinanzasMouseClicked
        btnGuardar.setBackground(new java.awt.Color(34, 45, 49));
        pnlGuardar.setVisible(false);

        btnUsuarios.setBackground(new java.awt.Color(34, 45, 49));
        pnlUsuarios.setVisible(false);

        btnFinanzas.setBackground(new java.awt.Color(44, 59, 66));
        pnlFinanzas.setVisible(true);
    }//GEN-LAST:event_btnFinanzasMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btngdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngdActionPerformed

        int Ide = 0, Estr = 0;
        float cons = 0;
        String Nomb = "", dir = "", Tel = "";

        try {
            Nomb = txtpropietario.getText();
            dir = txtdireccion.getText();
            Tel = txttelefono.getText();
            Ide = Integer.parseInt(txtid.getText());
            Estr = Integer.parseInt(txtestrato.getText());

            if (i < 10) {
                Datos.LlevaId(Ide, i);
                Datos.LlevaPropietario(Nomb, i);
                Datos.LlevaDireccion(dir, i);
                Datos.LlevaTelefono(Tel, i);
                Datos.LlevaEstrato(Estr, i);
                Datos.LlevaConsumo(cons, i);

                if (Datos.TraeId(i) == 0) {

                } else {

                    if ((Datos.TraeEstrato(i) >= 1 && Datos.TraeEstrato(i) <= 6) && (!Datos.TraePropietario(i).isEmpty()
                            && !Datos.TraeDireccion(i).isEmpty() && !Datos.TraeTelefono(i).isEmpty())) {

                        DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();

                        Object[] registro = new Object[5];

                        registro[0] = Datos.TraeId(i);
                        registro[1] = Datos.TraePropietario(i);
                        registro[2] = Datos.TraeDireccion(i);
                        registro[3] = Datos.TraeTelefono(i);
                        registro[4] = Datos.TraeEstrato(i);

                        model.addRow(registro);
                        tablaUsuarios.setModel(model);
                        i++;

                        txtid.setText("");
                        txtpropietario.setText("");
                        txtdireccion.setText("");
                        txttelefono.setText("");
                        txtestrato.setText("");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Estrato debe estar entre 1 - 6");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El numero de Usuarios ha llegado a su limite");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos de textos");
        }
    }//GEN-LAST:event_btngdActionPerformed

    //boton generar facturas
    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed

        for (int i = 0; i < 1; i++) {

            try {

                int Id, Identificacion, posicion, Estrato;
                String Propietario, Direccion;
                float ConsumoActual = 0, ConsumoNuevo = 0, ConsumoPendiente = 0;
                float descuento = 0;
                Id = Integer.parseInt(txtbuscarId.getText());
                posicion = Datos.BuscaCodigo(Id);
                Propietario = Datos.TraePropietario(posicion);
                Estrato = Datos.TraeEstrato(posicion);
                Direccion = Datos.TraeDireccion(posicion);
                Identificacion = Datos.TraeId(posicion);
                posicion = Datos.BuscaCodigo(Id);

                ConsumoNuevo = Float.parseFloat(txtconsumo.getText());
                ConsumoActual = Float.parseFloat(txtlecturaactual.getText());

                ConsumoPendiente = (ConsumoNuevo - ConsumoActual);

                float valor = 0, valorfinal = 0;
                switch (Datos.TraeEstrato(posicion)) {
                    case 1:
                    case 2:
                        if (ConsumoPendiente <= 150) {
                            valor = (500 * ConsumoPendiente);
                            descuento = 20000;
                            valorfinal = (valor - descuento);
                        } else {
                            valor = (650 * ConsumoPendiente);
                            valorfinal = valor;
                        }
                        break;
                    case 3:
                    case 4:
                        if (ConsumoPendiente <= 150) {
                            valor = (700 * ConsumoPendiente);
                            valorfinal = valor;
                        } else {
                            valor = (850 * ConsumoPendiente);
                            valorfinal = valor;
                        }
                        break;
                    case 5:
                    case 6:
                        if (ConsumoPendiente <= 150) {
                            valor = (1000 * ConsumoPendiente);
                            valorfinal = valor;
                        } else {
                            valor = (1150 * ConsumoPendiente);
                            valorfinal = valor;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(rootPane, "Ingrese un valor valido");
                }

                if (ConsumoNuevo >= ConsumoActual) {
                    
                    deflistaFacturas.add(i, " " );
                    deflistaFacturas.add(i, " ____________________________");
                    deflistaFacturas.add(i, "Total:                    $ " + valorfinal);
                    deflistaFacturas.add(i, "Descuento:          $ " + descuento);
                    deflistaFacturas.add(i, "Valor Consumo:  $ " + valor);
                    deflistaFacturas.add(i, "Consumo en kilowatts: " + ConsumoPendiente);
                    deflistaFacturas.add(i, "Estrato: " + Estrato);
                    deflistaFacturas.add(i, "Direccíon: " + Direccion);
                    deflistaFacturas.add(i, "Nombre: " + Propietario);
                    deflistaFacturas.add(i, "Identificacion: " + Identificacion);
                    deflistaFacturas.add(i, "Fecha: " + dtf.format(LocalDateTime.now()) + "Hora: " + dtf2.format(LocalDateTime.now()));
                    deflistaFacturas.add(i, "                   Factura N° 00" + contfact);
                    
                    
                    txtconsumo.setText("");
                    txtpropietario1.setText("");
                    txtbuscarId.setText("");
                    txtestrato1.setText("");
                    txtlecturaactual.setText("");

                    Datos.LlevaConsumo(ConsumoPendiente + Datos.TraeConsumo(posicion), posicion);

                    Ganancias += valorfinal;

                    txtganancias.setText(String.valueOf(Ganancias));
                    
                    contfact++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "¡¡¡Lectura Actual es inferior a Lectura Antigua!!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "No se ha podido general la Factura");
            }
        }
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void BuscarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPropietarioActionPerformed
        try {
            int Id, Identificacion, posicion, Estrato;
            String Propietario, Direccion;
            float Consumo;

            Id = Integer.parseInt(txtbuscarId.getText());
            posicion = Datos.BuscaCodigo(Id);
            Propietario = Datos.TraePropietario(posicion);
            Estrato = Datos.TraeEstrato(posicion);
            Direccion = Datos.TraeDireccion(posicion);
            Identificacion = Datos.TraeId(posicion);
            Consumo = Datos.TraeConsumo(posicion);

            txtpropietario1.setText(Propietario);
            txtestrato1.setText(String.valueOf(Estrato));
            txtlecturaactual.setText(String.valueOf(Consumo));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado");
        }
    }//GEN-LAST:event_BuscarPropietarioActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(WIDTH);
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarPropietario;
    private javax.swing.JLabel btnFinanzas;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnUsuarios;
    private javax.swing.JButton btngd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblUser;
    private javax.swing.JList<String> listFacturas;
    private javax.swing.JPanel pnlFinanzas;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtbuscarId;
    private javax.swing.JTextField txtconsumo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtestrato;
    private javax.swing.JTextField txtestrato1;
    private javax.swing.JTextField txtganancias;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlecturaactual;
    private javax.swing.JTextField txtpropietario;
    private javax.swing.JTextField txtpropietario1;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
