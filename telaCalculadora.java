/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author estafanyribeiro
 */
public class telaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form telaCalculadora
     */
    public telaCalculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        visorCalculadora = new javax.swing.JTextField();
        botaoCE = new javax.swing.JButton();
        botaoVezes = new javax.swing.JButton();
        botaoDivisor = new javax.swing.JButton();
        botaoSoma = new javax.swing.JButton();
        botaoSubtracao = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        visorCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorCalculadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visorCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visorCalculadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });
        botaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCEActionPerformed(evt);
            }
        });

        botaoVezes.setText("*");
        botaoVezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVezesMouseClicked(evt);
            }
        });
        botaoVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVezesActionPerformed(evt);
            }
        });

        botaoDivisor.setText("/");
        botaoDivisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivisorMouseClicked(evt);
            }
        });

        botaoSoma.setText("+");
        botaoSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSomaMouseClicked(evt);
            }
        });

        botaoSubtracao.setText("-");
        botaoSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSubtracaoMouseClicked(evt);
            }
        });

        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });

        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });

        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });

        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });

        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });

        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });

        botaoIgual.setBackground(new java.awt.Color(255, 153, 102));
        botaoIgual.setText("=");
        botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIgualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(botaoDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCE)
                    .addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(botaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visorCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorCalculadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visorCalculadoraActionPerformed

    private void botaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCEActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoCEActionPerformed

    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCEMouseClicked
        // TODO add your handling code here:
        visorCalculadora.setText("");
    }//GEN-LAST:event_botaoCEMouseClicked

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao7MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor+"7");
    }//GEN-LAST:event_botao7MouseClicked

    private void botaoVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVezesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVezesActionPerformed

    private void botaoVezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVezesMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor+ "*");
    }//GEN-LAST:event_botaoVezesMouseClicked

    private void botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao8MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "8");
    }//GEN-LAST:event_botao8MouseClicked

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao9MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "9");
    }//GEN-LAST:event_botao9MouseClicked

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao4MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "4");
    }//GEN-LAST:event_botao4MouseClicked

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao5MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "5");
    }//GEN-LAST:event_botao5MouseClicked

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao6MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "6");
    }//GEN-LAST:event_botao6MouseClicked

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao1MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "1");
    }//GEN-LAST:event_botao1MouseClicked

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "2");
    }//GEN-LAST:event_botao2MouseClicked

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao3MouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "3");
    }//GEN-LAST:event_botao3MouseClicked

    private void botaoDivisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDivisorMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "/");
    }//GEN-LAST:event_botaoDivisorMouseClicked

    private void botaoSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSomaMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "+");
    }//GEN-LAST:event_botaoSomaMouseClicked

    private void botaoSubtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSubtracaoMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        visorCalculadora.setText(valor + "-");
    }//GEN-LAST:event_botaoSubtracaoMouseClicked

    private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIgualMouseClicked
        // TODO add your handling code here:
        String valor = visorCalculadora.getText();
        System.out.println(">>>>" + valor);
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(valor);
        
        visorCalculadora.setText(resultado);
    }//GEN-LAST:event_botaoIgualMouseClicked

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDivisor;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSubtracao;
    private javax.swing.JButton botaoVezes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField visorCalculadora;
    // End of variables declaration//GEN-END:variables
}
