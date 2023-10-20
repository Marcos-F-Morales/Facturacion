/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

import static interfazproyecto.ComboSimple.ComCombos;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author pablo
 */
public class ComboFamiliar extends javax.swing.JFrame {

    String combos[] = {"Combo Familiar"};
    double precios[] ={200};
    double precio = 0;
    int noche = 0;
    ArrayList<FacturaCarrito> ListaVenta;
    /**
     * Creates new form ComboFamiliar
     */
    public ComboFamiliar() {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(Fondo_madera, "C:src\\imagen_interfaz\\madera.jpg");
        DefaultComboBoxModel ComboModel = new DefaultComboBoxModel(combos);
        ComCombos.setModel(ComboModel);
        
        ListaVenta = new ArrayList();
    }
    public ComboFamiliar(ArrayList listaVenta) {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(Fondo_madera, "C:src\\imagen_interfaz\\madera.jpg");
        DefaultComboBoxModel ComboModel = new DefaultComboBoxModel(combos);
        
        ComCombos.setModel(ComboModel);
        
        ListaVenta = listaVenta;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bd = new javax.swing.JPanel();
        Hotel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        Fondo_madera = new javax.swing.JLabel();
        bd1 = new javax.swing.JPanel();
        Hotel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo_madera1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComCombos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Unitario = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        SpnNoches = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        Total = new javax.swing.JLabel();
        bd2 = new javax.swing.JPanel();
        Hotel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Fondo_madera2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ComCombos1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        YearInicio = new javax.swing.JSpinner();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Unitario1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        SpnNoches1 = new javax.swing.JSpinner();
        diasInicio = new javax.swing.JSpinner();
        MesInicio = new javax.swing.JSpinner();
        Total1 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bd.setBackground(new java.awt.Color(0, 0, 0));
        bd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hotel.setBackground(new java.awt.Color(255, 204, 204));
        Hotel.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        Hotel.setForeground(new java.awt.Color(255, 255, 255));
        Hotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hotel.setText("hotel generico");
        Hotel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bd.add(Hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        bd.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bd.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 370, 120, 60));

        Fondo_madera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_interfaz/madera.jpg"))); // NOI18N
        Fondo_madera.setText("jLabel1");
        bd.add(Fondo_madera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 750, 140));

        bd1.setBackground(new java.awt.Color(0, 0, 0));
        bd1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hotel1.setBackground(new java.awt.Color(255, 204, 204));
        Hotel1.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        Hotel1.setForeground(new java.awt.Color(255, 255, 255));
        Hotel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hotel1.setText("hotel generico");
        Hotel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bd1.add(Hotel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        bd1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, -1));

        Fondo_madera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_interfaz/madera.jpg"))); // NOI18N
        Fondo_madera1.setText("jLabel1");
        bd1.add(Fondo_madera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 750, 140));

        jLabel1.setText("jLabel1");
        bd1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 330, 290));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("combos");
        bd1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dia");
        bd1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("noches");
        bd1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        ComCombos.setBackground(new java.awt.Color(102, 102, 102));
        ComCombos.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.acceleratorForeground"));
        ComCombos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComCombosActionPerformed(evt);
            }
        });
        bd1.add(ComCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 230, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año");
        bd1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("fecha de inicio");
        bd1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2023, 2023, null, 1));
        bd1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        bd1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 350, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        bd1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 112, 350, 10));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mes");
        bd1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio");
        bd1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        Unitario.setBackground(new java.awt.Color(255, 255, 255));
        Unitario.setForeground(new java.awt.Color(255, 255, 255));
        Unitario.setText("200.0Q");
        bd1.add(Unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        bd1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 350, -1));

        SpnNoches.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        SpnNoches.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnNochesStateChanged(evt);
            }
        });
        bd1.add(SpnNoches, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        bd1.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        Total.setBackground(new java.awt.Color(255, 255, 255));
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("200.0Q");
        bd1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        bd2.setBackground(new java.awt.Color(0, 0, 0));
        bd2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hotel2.setBackground(new java.awt.Color(255, 204, 204));
        Hotel2.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        Hotel2.setForeground(new java.awt.Color(255, 255, 255));
        Hotel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hotel2.setText("hotel generico");
        Hotel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bd2.add(Hotel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        bd2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, -1));

        Fondo_madera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_interfaz/madera.jpg"))); // NOI18N
        Fondo_madera2.setText("jLabel1");
        bd2.add(Fondo_madera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 750, 140));

        jLabel9.setText("jLabel1");
        bd2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 330, 290));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("combos");
        bd2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dia");
        bd2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("noches");
        bd2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        ComCombos1.setBackground(new java.awt.Color(102, 102, 102));
        ComCombos1.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.acceleratorForeground"));
        ComCombos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComCombos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComCombos1ActionPerformed(evt);
            }
        });
        bd2.add(ComCombos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 230, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Año");
        bd2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("fecha de inicio");
        bd2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        YearInicio.setModel(new javax.swing.SpinnerNumberModel(2023, 2023, null, 1));
        bd2.add(YearInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        bd2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 350, 10));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        bd2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 112, 350, 10));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mes");
        bd2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio");
        bd2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        Unitario1.setBackground(new java.awt.Color(255, 255, 255));
        Unitario1.setForeground(new java.awt.Color(255, 255, 255));
        bd2.add(Unitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        bd2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 350, -1));

        SpnNoches1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        SpnNoches1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnNoches1StateChanged(evt);
            }
        });
        bd2.add(SpnNoches1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        diasInicio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        bd2.add(diasInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        MesInicio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        bd2.add(MesInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        Total1.setBackground(new java.awt.Color(255, 255, 255));
        Total1.setForeground(new java.awt.Color(255, 255, 255));
        bd2.add(Total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        bd2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        bd1.add(bd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bd.add(bd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComCombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComCombosActionPerformed
        CalcularPrecio();
    }//GEN-LAST:event_ComCombosActionPerformed

    private void SpnNochesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnNochesStateChanged
        CalcularPrecio();
    }//GEN-LAST:event_SpnNochesStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dia = (int) diasInicio.getValue();
        int mes = (int) MesInicio.getValue();
        int año = (int) YearInicio.getValue();
        String InicioEstadia = dia + "/" + mes + "/" + año;

        FacturaCarrito carrito = new FacturaCarrito();
        carrito.setId(ComCombos.getSelectedIndex());
        carrito.setCombo(ComCombos.getSelectedItem().toString());
        carrito.setInicioEstadia(InicioEstadia);
        carrito.setPrecio(precio*noche);
        carrito.setNoches(noche);

        ListaVenta.add(carrito);

        Carrito formCarrito = new Carrito(ListaVenta);
        formCarrito.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComCombos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComCombos1ActionPerformed
        CalcularPrecio();
    }//GEN-LAST:event_ComCombos1ActionPerformed

    private void SpnNoches1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnNoches1StateChanged
        CalcularPrecio();
    }//GEN-LAST:event_SpnNoches1StateChanged

    public void CalcularPrecio(){
    precio = precios[ComCombos.getSelectedIndex()];
    noche = Integer.parseInt(SpnNoches.getValue().toString());
    Total.setText(aMoneda(precio*noche));
    Unitario.setText(aMoneda(precio));
    }
    
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0 + " Q";
    }
    
    private void setImageLabel(JLabel labelname, String root ){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
            labelname.setIcon(icon);
            this.repaint();
    }
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
            java.util.logging.Logger.getLogger(ComboFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboFamiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboFamiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComCombos;
    public static javax.swing.JComboBox<String> ComCombos1;
    private javax.swing.JLabel Fondo_madera;
    private javax.swing.JLabel Fondo_madera1;
    private javax.swing.JLabel Fondo_madera2;
    private javax.swing.JLabel Hotel;
    private javax.swing.JLabel Hotel1;
    private javax.swing.JLabel Hotel2;
    private javax.swing.JSpinner MesInicio;
    private javax.swing.JSpinner SpnNoches;
    private javax.swing.JSpinner SpnNoches1;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Total1;
    private javax.swing.JLabel Unitario;
    private javax.swing.JLabel Unitario1;
    private javax.swing.JSpinner YearInicio;
    private javax.swing.JPanel bd;
    private javax.swing.JPanel bd1;
    private javax.swing.JPanel bd2;
    private javax.swing.JSpinner diasInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    // End of variables declaration//GEN-END:variables
}
