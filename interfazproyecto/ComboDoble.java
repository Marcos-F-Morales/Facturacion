/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

import static interfazproyecto.ComboSimple.ComCombos;

/**
 *
 * @author pablo
 */
public class ComboDoble extends javax.swing.JFrame {
    String combos[] = {"Combo Economico", "Combo Estandar", "Combo de lujo"};
    double precios[] ={60,80,120};
    double precio = 0;
    int noche = 0;
    /**
     * Creates new form ComboDoble
     */
    public ComboDoble() {
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

        bd = new javax.swing.JPanel();
        Hotel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        Total = new javax.swing.JLabel();

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
        Unitario.setText("jLabel9");
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

        jSpinner3.setModel(new javax.swing.SpinnerListModel(new String[] {"empty"}));
        bd1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        bd1.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        Total.setBackground(new java.awt.Color(255, 255, 255));
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("jLabel9");
        bd1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

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
    
    public void CalcularPrecio(){
    precio = precios[ComCombos.getSelectedIndex()];
    noche = Integer.parseInt(SpnNoches.getValue().toString());
    Total.setText(aMoneda(precio*noche));
    Unitario.setText(aMoneda(precio));
    }
    
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0 + " Q";
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
            java.util.logging.Logger.getLogger(ComboDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboDoble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComCombos;
    private javax.swing.JLabel Fondo_madera;
    private javax.swing.JLabel Fondo_madera1;
    private javax.swing.JLabel Hotel;
    private javax.swing.JLabel Hotel1;
    private javax.swing.JSpinner SpnNoches;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Unitario;
    private javax.swing.JPanel bd;
    private javax.swing.JPanel bd1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    // End of variables declaration//GEN-END:variables
}
