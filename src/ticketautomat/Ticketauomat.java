package ticketautomat;

public class Ticketauomat extends javax.swing.JFrame {
    
    int anzahl10 = 10;
    int anzahl20 = 10;
    int anzahl50 = 10;
    int anzahl100 = 10;
    int anzahl200 = 10;
    double preis = 0.0;
    double eingeworfen = 0.0;
    
    public Ticketauomat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PreisstufebuttonA = new javax.swing.JButton();
        PreisstufebuttonB = new javax.swing.JButton();
        PreisstuebuttonC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Preisfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Eingeworfenfield = new javax.swing.JTextField();
        Druckenbutton = new javax.swing.JButton();
        zehncentbutton = new javax.swing.JButton();
        zwanzigcentbutton = new javax.swing.JButton();
        fuenfzigcentbutton = new javax.swing.JButton();
        eineurobutton = new javax.swing.JButton();
        zweieurobutton = new javax.swing.JButton();
        zehncentfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        zwanzigcentfield = new javax.swing.JTextField();
        fuenfzigcentfield = new javax.swing.JTextField();
        eineurofield = new javax.swing.JTextField();
        zweieurofield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        wechselgeldfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ticketautomat");

        jLabel2.setText("Preisstufe:");

        PreisstufebuttonA.setText("A");
        PreisstufebuttonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreisstufebuttonAActionPerformed(evt);
            }
        });

        PreisstufebuttonB.setText("B");
        PreisstufebuttonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreisstufebuttonBActionPerformed(evt);
            }
        });

        PreisstuebuttonC.setText("C");
        PreisstuebuttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreisstuebuttonCActionPerformed(evt);
            }
        });

        jLabel3.setText("Preis:");

        jLabel4.setText("Eingeworfen:");

        Druckenbutton.setText("Drucken");
        Druckenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DruckenbuttonActionPerformed(evt);
            }
        });

        zehncentbutton.setText("10 Cent");
        zehncentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zehncentbuttonActionPerformed(evt);
            }
        });

        zwanzigcentbutton.setText("20 Cent");
        zwanzigcentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwanzigcentbuttonActionPerformed(evt);
            }
        });

        fuenfzigcentbutton.setText("50 Cent");
        fuenfzigcentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenfzigcentbuttonActionPerformed(evt);
            }
        });

        eineurobutton.setText("1 Euro");
        eineurobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eineurobuttonActionPerformed(evt);
            }
        });

        zweieurobutton.setText("2 Euro");
        zweieurobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zweieurobuttonActionPerformed(evt);
            }
        });

        zehncentfield.setText("10");

        jLabel5.setText("Münzanzahl:");

        zwanzigcentfield.setText("10");

        fuenfzigcentfield.setText("10");
        fuenfzigcentfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenfzigcentfieldActionPerformed(evt);
            }
        });

        eineurofield.setText("10");

        zweieurofield.setText("10");

        jLabel6.setText("Wechselgeld:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Druckenbutton)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wechselgeldfield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Preisfield))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(PreisstufebuttonA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PreisstufebuttonB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PreisstuebuttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Eingeworfenfield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zwanzigcentbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zehncentbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fuenfzigcentbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eineurobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zweieurobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zehncentfield)
                            .addComponent(zwanzigcentfield)
                            .addComponent(fuenfzigcentfield)
                            .addComponent(eineurofield)
                            .addComponent(zweieurofield)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PreisstufebuttonA)
                            .addComponent(PreisstufebuttonB)
                            .addComponent(PreisstuebuttonC))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Preisfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eingeworfenfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zehncentbutton)
                            .addComponent(zehncentfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zwanzigcentbutton)
                            .addComponent(zwanzigcentfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuenfzigcentbutton)
                            .addComponent(fuenfzigcentfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eineurobutton)
                            .addComponent(eineurofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zweieurobutton)
                            .addComponent(zweieurofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Druckenbutton)
                    .addComponent(jLabel6)
                    .addComponent(wechselgeldfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreisstufebuttonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreisstufebuttonBActionPerformed
        preis = 3.2;
        Preisfield.setText(preis + "");
    }//GEN-LAST:event_PreisstufebuttonBActionPerformed

    private void PreisstufebuttonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreisstufebuttonAActionPerformed
        preis = 1.6;
        Preisfield.setText(preis + "");
    }//GEN-LAST:event_PreisstufebuttonAActionPerformed

    private void fuenfzigcentfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenfzigcentfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuenfzigcentfieldActionPerformed

    private void zehncentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zehncentbuttonActionPerformed
        anzahl10 = anzahl10 + 1;
        eingeworfen = eingeworfen + 0.1;
        zehncentfield.setText(anzahl10+"");
        Eingeworfenfield.setText(eingeworfen + "");
        ueberpruefeGeld();
    }//GEN-LAST:event_zehncentbuttonActionPerformed

    private void zwanzigcentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwanzigcentbuttonActionPerformed
        anzahl20 = anzahl20 + 1;
        eingeworfen = eingeworfen + 0.2;
        zwanzigcentfield.setText(anzahl20+"");
        Eingeworfenfield.setText(eingeworfen + "");
        ueberpruefeGeld();
    }//GEN-LAST:event_zwanzigcentbuttonActionPerformed

    private void fuenfzigcentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenfzigcentbuttonActionPerformed
        anzahl50 = anzahl50 + 1;
        eingeworfen = eingeworfen + 0.5;
        fuenfzigcentfield.setText(anzahl50+"");
        Eingeworfenfield.setText(eingeworfen + "");
        ueberpruefeGeld();
    }//GEN-LAST:event_fuenfzigcentbuttonActionPerformed

    private void eineurobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eineurobuttonActionPerformed
        anzahl100 = anzahl100 + 1;
        eingeworfen = eingeworfen + 1.0;
        eineurofield.setText(anzahl100+"");
        Eingeworfenfield.setText(eingeworfen + "");
        ueberpruefeGeld();
    }//GEN-LAST:event_eineurobuttonActionPerformed

    private void zweieurobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zweieurobuttonActionPerformed
        anzahl200 = anzahl200 + 1;
        eingeworfen = eingeworfen + 2.0;
        zweieurofield.setText(anzahl200+"");
        Eingeworfenfield.setText(eingeworfen + "");
        ueberpruefeGeld();
    }//GEN-LAST:event_zweieurobuttonActionPerformed

    private void DruckenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DruckenbuttonActionPerformed
        eingeworfen = 0.0;
        Eingeworfenfield.setText("0.0");
        wechselgeldfield.setText("0.0");
    }//GEN-LAST:event_DruckenbuttonActionPerformed

    private void PreisstuebuttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreisstuebuttonCActionPerformed
        preis = 5.4;
        Preisfield.setText(preis + "");
    }//GEN-LAST:event_PreisstuebuttonCActionPerformed

    void ueberpruefeGeld() {
        if(eingeworfen >= preis) {
            zehncentbutton.setEnabled(false);
            zwanzigcentbutton.setEnabled(false);
            fuenfzigcentbutton.setEnabled(false);
            eineurobutton.setEnabled(false);
            zweieurobutton.setEnabled(false);
            double rueckgeld = eingeworfen - preis;
            rueckgeld = rueckgeld * 100;
            rueckgeld = Math.round(rueckgeld);
            rueckgeld = rueckgeld / 100;
            wechselgeldfield.setText(rueckgeld + "");
            int rueckgeldcent = (int) (rueckgeld * 100);
            int rueckgeld10 = 0;
            int rueckgeld20 = 0;
            int rueckgeld50 = 0;
            int rueckgeld100 = 0;
            int rueckgeld200 = 0;
            while(rueckgeldcent >= 200) {
                rueckgeldcent = rueckgeldcent - 200;
                rueckgeld200++;
            }
            while(rueckgeldcent >= 100) {
                rueckgeldcent = rueckgeldcent - 100;
                rueckgeld100++;
            }
            while(rueckgeldcent >= 50) {
                rueckgeldcent = rueckgeldcent - 50;
                rueckgeld50++;
            }
            while(rueckgeldcent >= 20) {
                rueckgeldcent = rueckgeldcent - 20;
                rueckgeld20++;
            }
            while(rueckgeldcent >= 10) {
                rueckgeldcent = rueckgeldcent - 10;
                rueckgeld10++;
            }
            anzahl10 = anzahl10 - rueckgeld10;
            anzahl20 = anzahl20 - rueckgeld20;
            anzahl50 = anzahl50 - rueckgeld50;
            anzahl100 = anzahl100 - rueckgeld100;
            anzahl200 = anzahl200 - rueckgeld200;
            zehncentfield.setText(anzahl10+"");
            zwanzigcentfield.setText(anzahl20+"");
            fuenfzigcentfield.setText(anzahl50+"");
            eineurofield.setText(anzahl100+"");
            zweieurofield.setText(anzahl200+"");
            System.out.println("===== RÜCKGELD =====");
            System.out.println("10cent = " + rueckgeld10);
            System.out.println("20cent = " + rueckgeld20);
            System.out.println("50cent = " + rueckgeld50);
            System.out.println("1 euro = " + rueckgeld100);
            System.out.println("2 euro = " + rueckgeld200);
        }
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
            java.util.logging.Logger.getLogger(Ticketauomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticketauomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticketauomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticketauomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticketauomat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Druckenbutton;
    private javax.swing.JTextField Eingeworfenfield;
    private javax.swing.JTextField Preisfield;
    private javax.swing.JButton PreisstuebuttonC;
    private javax.swing.JButton PreisstufebuttonA;
    private javax.swing.JButton PreisstufebuttonB;
    private javax.swing.JButton eineurobutton;
    private javax.swing.JTextField eineurofield;
    private javax.swing.JButton fuenfzigcentbutton;
    private javax.swing.JTextField fuenfzigcentfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField wechselgeldfield;
    private javax.swing.JButton zehncentbutton;
    private javax.swing.JTextField zehncentfield;
    private javax.swing.JButton zwanzigcentbutton;
    private javax.swing.JTextField zwanzigcentfield;
    private javax.swing.JButton zweieurobutton;
    private javax.swing.JTextField zweieurofield;
    // End of variables declaration//GEN-END:variables
}