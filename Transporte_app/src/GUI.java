
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class GUI extends javax.swing.JFrame {

    LinkedList<VehiculosCl>vehiculos = new LinkedList<>();
    
    boolean sw,sw2;
    int posicion;
    
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Transportes LTDA");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_registro = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        lb_placa = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        txt_nombrecon = new javax.swing.JTextField();
        lb_descripcion = new javax.swing.JLabel();
        lb_ruta = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        lb_marca = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        lb_modelo = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_descripcion = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lb_consulta = new javax.swing.JLabel();
        txt_placa_consulta = new javax.swing.JTextField();
        lb_placa2 = new javax.swing.JLabel();
        bl_info = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        btn_borrar2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        lb_titulo.setBackground(new java.awt.Color(255, 255, 255));
        lb_titulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Transportes LTDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(lb_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_titulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        lb_registro.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb_registro.setForeground(new java.awt.Color(153, 153, 153));
        lb_registro.setText("Registro");

        txt_placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_placa.setBorder(null);

        lb_placa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_placa.setForeground(new java.awt.Color(102, 102, 102));
        lb_placa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_placa.setText("Placa:");

        lb_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(102, 102, 102));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nombre.setText("Nombre conductor:");

        txt_nombrecon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombrecon.setBorder(null);

        lb_descripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_descripcion.setForeground(new java.awt.Color(102, 102, 102));
        lb_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_descripcion.setText("Descripcion:");

        lb_ruta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_ruta.setForeground(new java.awt.Color(102, 102, 102));
        lb_ruta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_ruta.setText("Ruta:");

        txt_ruta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ruta.setBorder(null);

        lb_marca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_marca.setForeground(new java.awt.Color(102, 102, 102));
        lb_marca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_marca.setText("Marca:");

        txt_marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_marca.setBorder(null);

        lb_modelo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_modelo.setForeground(new java.awt.Color(102, 102, 102));
        lb_modelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_modelo.setText("Modelo:");

        txt_modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modelo.setBorder(null);

        txa_descripcion.setColumns(20);
        txa_descripcion.setRows(5);
        jScrollPane1.setViewportView(txa_descripcion);

        btn_guardar.setBackground(new java.awt.Color(51, 204, 255));
        btn_guardar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lb_registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_placa)
                    .addComponent(lb_ruta)
                    .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre)
                    .addComponent(txt_nombrecon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_marca)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_descripcion)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_modelo)
                                .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_borrar)
                .addGap(68, 68, 68)
                .addComponent(btn_guardar)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_registro)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_placa)
                    .addComponent(lb_descripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombrecon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_ruta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_modelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_borrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));

        lb_consulta.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb_consulta.setForeground(new java.awt.Color(153, 153, 153));
        lb_consulta.setText("Consulta");

        txt_placa_consulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_placa_consulta.setBorder(null);

        lb_placa2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_placa2.setForeground(new java.awt.Color(102, 102, 102));
        lb_placa2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_placa2.setText("Numero de Placa:");

        bl_info.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bl_info.setForeground(new java.awt.Color(102, 102, 102));
        bl_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bl_info.setText("Consulta el vehiculo por medio de su placa.");

        btn_consultar.setBackground(new java.awt.Color(51, 204, 255));
        btn_consultar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_borrar2.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrar2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_borrar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar2.setText("Borrar");
        btn_borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lb_consulta))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_placa2)
                            .addComponent(bl_info)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_placa_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_consultar)))))
                .addGap(17, 17, 17))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btn_borrar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_consulta)
                .addGap(29, 29, 29)
                .addComponent(bl_info)
                .addGap(18, 18, 18)
                .addComponent(lb_placa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_placa_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar))
                .addGap(18, 18, 18)
                .addComponent(btn_borrar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
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

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        txt_placa.setText("");
        txa_descripcion.setText("");
        txt_nombrecon.setText("");
        txt_ruta.setText("");
        txt_marca.setText("");
        txt_modelo.setText("");
        txt_placa.requestFocus();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void fn_guardar(){
        if(txt_placa.getText().equals("") || txa_descripcion.getText().equals("") || txt_nombrecon.getText().equals("") || txt_nombrecon.getText().equals("") || txt_ruta.getText().equals("") || txt_marca.getText().equals("") || txt_modelo.getText().equals("")){
                JOptionPane.showMessageDialog(null, "completa todos los campos");
        }else{
            posicion = 0;
            sw = false;
            for(int i=0;i<vehiculos.size();i++){
                if(vehiculos.get(i).getPlacacl().equals(txt_placa.getText())){
                    sw = true;
                }
            }
            
            if(sw == false){
                vehiculos.add(new VehiculosCl(txt_placa.getText(),
       txa_descripcion.getText(),
   txt_nombrecon.getText(),
            txt_ruta.getText(),
            txt_marca.getText(),
            txt_modelo.getText()));
                    
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Este registro ya existe");
            }
        }
    }
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        fn_guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void fn_mostrar(){
        for(int i=0;i<vehiculos.size();i++){
            if(vehiculos.get(i).getPlacacl().equals(txt_placa_consulta.getText())){
                JOptionPane.showMessageDialog(null, "==========Transportes=========="+
                        "\n Placa: "+vehiculos.get(i).getPlacacl()+
                        "\n Conductor: "+vehiculos.get(i).getNombre_conductorcl()+
                        "\n Descripcion: "+vehiculos.get(i).getDescripcioncl()+
                        "\n Ruta: "+vehiculos.get(i).getRutacl()+
                        "\n Marca: "+vehiculos.get(i).getMarcacl()+
                        "\n Modelo: "+vehiculos.get(i).getModelo());
            }
        }
    }
    
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        fn_mostrar();
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar2ActionPerformed
        txt_placa_consulta.setText("");
        txt_placa_consulta.requestFocus();
    }//GEN-LAST:event_btn_borrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bl_info;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_borrar2;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_consulta;
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_marca;
    private javax.swing.JLabel lb_modelo;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_placa;
    private javax.swing.JLabel lb_placa2;
    private javax.swing.JLabel lb_registro;
    private javax.swing.JLabel lb_ruta;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextArea txa_descripcion;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombrecon;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_placa_consulta;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables
}
