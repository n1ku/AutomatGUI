/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.awt.Color;

/**
 *
 * @author n1k
 */
public class myAutomat extends javax.swing.JFrame {
    
    private Automat aut = new Automat();
    private String defaultScreenTxt;
    private boolean befuellenState;
    /**
     * Creates new form myAutomat
     */
    public myAutomat() {
        initComponents();
        this.befuellenState = false;
        this.defaultScreenTxt = "Willkommen\n" + "\n" + 
"Bitte Fach auswählen\n" +
"oder Geld einwerfen";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        field_coins = new javax.swing.JTextField();
        btn_geldWEinwerfen = new javax.swing.JButton();
        btn_R = new javax.swing.JButton();
        btn_buy = new javax.swing.JButton();
        field_item2 = new javax.swing.JTextField();
        field_item3 = new javax.swing.JTextField();
        field_item4 = new javax.swing.JTextField();
        field_item1 = new javax.swing.JTextField();
        btn_befuellen = new javax.swing.JButton();
        field_ablaufdatum = new javax.swing.JTextField();
        field_einheit = new javax.swing.JTextField();
        field_menge = new javax.swing.JTextField();
        field_waehrung = new javax.swing.JTextField();
        field_preis = new javax.swing.JTextField();
        field_produkt = new javax.swing.JTextField();
        btn_abschluss = new javax.swing.JButton();
        field_selected = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 68, 54));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(0, 51, 51));
        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        screen.setRows(5);
        screen.setText("Willkommen\n\nBitte Fach auswählen\noder Geld einwerfen");
        screen.setToolTipText("");
        jScrollPane1.setViewportView(screen);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        btn_1.setText("1");
        btn_1.setToolTipText("");
        btn_1.setActionCommand("btn1");
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });

        btn_2.setText("2");
        btn_2.setActionCommand("btn2");
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
        });

        btn_3.setText("3");
        btn_3.setActionCommand("btn3");
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
        });

        btn_4.setText("4");
        btn_4.setActionCommand("btn4");
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
        });
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        field_coins.setText("Betrag eingeben");
        field_coins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_coinsMouseClicked(evt);
            }
        });

        btn_geldWEinwerfen.setText("Geld einwerfen");
        btn_geldWEinwerfen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_geldWEinwerfenMouseClicked(evt);
            }
        });

        btn_R.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btn_R.setText("R");
        btn_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RActionPerformed(evt);
            }
        });

        btn_buy.setText("Kaufen");
        btn_buy.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_coins, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_geldWEinwerfen))
                        .addGap(18, 18, 18)
                        .addComponent(btn_R, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_4))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(field_coins, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_geldWEinwerfen))
                    .addComponent(btn_R, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        field_item2.setEditable(false);
        field_item2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        field_item2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_item2.setText("Leer");
        field_item2.setBorder(new javax.swing.border.MatteBorder(null));

        field_item3.setEditable(false);
        field_item3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        field_item3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_item3.setText("Leer");
        field_item3.setBorder(new javax.swing.border.MatteBorder(null));

        field_item4.setEditable(false);
        field_item4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        field_item4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_item4.setText("Leer");
        field_item4.setBorder(new javax.swing.border.MatteBorder(null));

        field_item1.setEditable(false);
        field_item1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        field_item1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_item1.setText("Leer");
        field_item1.setBorder(new javax.swing.border.MatteBorder(null));

        btn_befuellen.setText("Befüllen");
        btn_befuellen.setToolTipText("Bitte zuerst auswählen");
        btn_befuellen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_befuellenMouseClicked(evt);
            }
        });

        field_ablaufdatum.setEditable(false);
        field_ablaufdatum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_ablaufdatum.setText("Ablaufdatum");
        field_ablaufdatum.setEnabled(false);

        field_einheit.setEditable(false);
        field_einheit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_einheit.setText("Einheit");
        field_einheit.setEnabled(false);

        field_menge.setEditable(false);
        field_menge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_menge.setText("Menge");
        field_menge.setToolTipText("");
        field_menge.setEnabled(false);

        field_waehrung.setEditable(false);
        field_waehrung.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_waehrung.setText("Währung");
        field_waehrung.setEnabled(false);

        field_preis.setEditable(false);
        field_preis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_preis.setText("Preis");
        field_preis.setEnabled(false);

        field_produkt.setEditable(false);
        field_produkt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_produkt.setText("Produktname");
        field_produkt.setEnabled(false);

        btn_abschluss.setText("Abschluss");
        btn_abschluss.setEnabled(false);

        field_selected.setEditable(false);
        field_selected.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_selected.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(field_preis)
                                    .addComponent(field_produkt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(field_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(field_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(field_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(field_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(field_einheit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(field_waehrung)
                                    .addComponent(field_menge)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn_befuellen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(field_selected)
                                        .addGap(7, 7, 7)
                                        .addComponent(btn_abschluss))
                                    .addComponent(field_ablaufdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(field_produkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_preis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_waehrung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_menge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_einheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_ablaufdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_befuellen)
                            .addComponent(btn_abschluss)
                            .addComponent(field_selected))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_geldWEinwerfenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geldWEinwerfenMouseClicked
        if(!"".equals(this.field_coins.getText()))
        {
            this.aut.geldEinwerfen(Double.parseDouble(this.field_coins.getText()));
        }
        if(this.aut.gibBisherBezahltenBetrag() != 0)
        {
            this.screen.setText("Credit: " + this.aut.gibBisherBezahltenBetrag() + " Fr.");
            if(this.btn_1.getBackground() == Color.RED || this.btn_2.getBackground() == Color.RED || this.btn_3.getBackground() == Color.RED || this.btn_4.getBackground() == Color.RED)
            {
                this.btn_buy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_geldWEinwerfenMouseClicked

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        Color dflt = this.btn_R.getBackground();
        this.btn_1.setBackground(Color.RED);
        this.btn_2.setBackground(dflt);
        this.btn_3.setBackground(dflt);
        this.btn_4.setBackground(dflt);
        this.field_selected.setText(this.btn_1.getText());
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RActionPerformed
        // reset all buttons
        Color dflt = this.btn_R.getBackground();
        this.btn_1.setBackground(dflt);
        this.btn_2.setBackground(dflt);
        this.btn_3.setBackground(dflt);
        this.btn_4.setBackground(dflt);
        this.field_selected.setText("0");
        this.aut.restGeldAusgeben();
        this.screen.setText("Bitte entnehmen Sie ihr Rückgeld.");
        this.resetScreenTxt();
    }//GEN-LAST:event_btn_RActionPerformed

    private void resetScreenTxt()
    {
        this.screen.setText(defaultScreenTxt);
    }
    
    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        Color dflt = this.btn_R.getBackground();
        this.btn_2.setBackground(Color.RED);
        this.btn_1.setBackground(dflt);
        this.btn_3.setBackground(dflt);
        this.btn_4.setBackground(dflt);
        this.field_selected.setText(this.btn_2.getText());
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        Color dflt = this.btn_R.getBackground();
        this.btn_3.setBackground(Color.RED);
        this.btn_2.setBackground(dflt);
        this.btn_1.setBackground(dflt);
        this.btn_4.setBackground(dflt);
        this.field_selected.setText(this.btn_3.getText());
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        Color dflt = this.btn_R.getBackground();
        this.btn_4.setBackground(Color.RED);
        this.btn_2.setBackground(dflt);
        this.btn_3.setBackground(dflt);
        this.btn_1.setBackground(dflt);
        this.field_selected.setText(this.btn_4.getText());
    }//GEN-LAST:event_btn_4MouseClicked

    private void field_coinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_coinsMouseClicked
        this.field_coins.setText("");
    }//GEN-LAST:event_field_coinsMouseClicked

    private void btn_befuellenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_befuellenMouseClicked
        this.field_ablaufdatum.setEnabled(true);
        this.field_einheit.setEnabled(true);
        this.field_menge.setEnabled(true);
        this.field_preis.setEnabled(true);
        this.field_ablaufdatum.setEnabled(true);
        this.field_produkt.setEnabled(true);
        this.field_waehrung.setEnabled(true);
        this.btn_abschluss.setEnabled(true);
    }//GEN-LAST:event_btn_befuellenMouseClicked

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
            java.util.logging.Logger.getLogger(myAutomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myAutomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myAutomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myAutomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myAutomat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_R;
    private javax.swing.JButton btn_abschluss;
    private javax.swing.JButton btn_befuellen;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_geldWEinwerfen;
    private javax.swing.JTextField field_ablaufdatum;
    private javax.swing.JTextField field_coins;
    private javax.swing.JTextField field_einheit;
    private javax.swing.JTextField field_item1;
    private javax.swing.JTextField field_item2;
    private javax.swing.JTextField field_item3;
    private javax.swing.JTextField field_item4;
    private javax.swing.JTextField field_menge;
    private javax.swing.JTextField field_preis;
    private javax.swing.JTextField field_produkt;
    private javax.swing.JTextField field_selected;
    private javax.swing.JTextField field_waehrung;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea screen;
    // End of variables declaration//GEN-END:variables
}