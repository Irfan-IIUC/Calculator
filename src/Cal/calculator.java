/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cal;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author QUAZI HASNAT IRFAN
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    double first_num, second_num, result;
    String operation;
    boolean b = true;

    public calculator() {
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

        jb7 = new javax.swing.JButton();
        jb18 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb19 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jtf1 = new javax.swing.JTextField();
        jb11 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb15 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb16 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jb7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb7.setText("6");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb18.setText("=");
        jb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb18ActionPerformed(evt);
            }
        });

        jb8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb8.setText("x");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb19.setText("+/-");
        jb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb19ActionPerformed(evt);
            }
        });

        jb9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb9.setText("2");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb10.setText("3");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        jtf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtf1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf1ActionPerformed(evt);
            }
        });

        jb11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb11.setText("-");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });

        jb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb1.setText("7");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb12.setText("1");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb2.setText("8");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb13.setText("0");
        jb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb13ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb3.setText("9");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb14.setText(".");
        jb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb14ActionPerformed(evt);
            }
        });

        jb4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb4.setText("/");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb15.setText("CE");
        jb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb15ActionPerformed(evt);
            }
        });

        jb5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb5.setText("4");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb16.setText("+");
        jb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb16ActionPerformed(evt);
            }
        });

        jb6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb6.setText("5");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb17.setText("√x");
        jb17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jb16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb7.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb18ActionPerformed
        // TODO add your handling code here:
        String answer;

        second_num = Double.parseDouble(jtf1.getText());

        if (operation == "+") {

            result = first_num + second_num;
            answer = String.format("%.2f", result);
            jtf1.setText(answer);
        } else if (operation == "-") {

            result = first_num - second_num;
            answer = String.format("%.2f", result);
            jtf1.setText(answer);
        } else if (operation == "x") {

            result = first_num * second_num;
            answer = String.format("%.2f", result);
            jtf1.setText(answer);
        } else if (operation == "/") {

            result = first_num / second_num;
            answer = String.format("%.2f", result);
            jtf1.setText(answer);
        }
    }//GEN-LAST:event_jb18ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // TODO add your handling code here:
        first_num = Double.parseDouble(jtf1.getText());
        jtf1.setText("");
        operation = "x";
        b = true;
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb19ActionPerformed
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtf1.getText()));
        ops = ops * (-1);
        jtf1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jb19ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb9.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb10.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb10ActionPerformed

    private void jtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf1ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        // TODO add your handling code here:
        first_num = Double.parseDouble(jtf1.getText());
        jtf1.setText("");
        operation = "-";
        b = true;
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb1.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb12.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb12ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb2.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb13ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb13.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb13ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb3.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb14ActionPerformed
        // TODO add your handling code here:
        if (b) {
            String enter_num = jtf1.getText() + jb14.getText();
            jtf1.setText(enter_num);
            b = false;
        }
    }//GEN-LAST:event_jb14ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        first_num = Double.parseDouble(jtf1.getText());
        jtf1.setText("");
        operation = "/";
        b = true;
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb15ActionPerformed
        // TODO add your handling code here:
        jtf1.setText("");
        b = true;
    }//GEN-LAST:event_jb15ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb5.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb16ActionPerformed
        // TODO add your handling code here:
        first_num = Double.parseDouble(jtf1.getText());
        jtf1.setText("");
        operation = "+";
        b = true;
    }//GEN-LAST:event_jb16ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
        String enter_num = jtf1.getText() + jb6.getText();
        jtf1.setText(enter_num);
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb17ActionPerformed
        // TODO add your handling code here:
        String s1 = jtf1.getText();
        double d1 = Double.parseDouble(s1);
        double d2 = Math.sqrt(d1);
        String s2 = String.format("%.2f", d2);
        jtf1.setText(s2);
    }//GEN-LAST:event_jb17ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb13;
    private javax.swing.JButton jb14;
    private javax.swing.JButton jb15;
    private javax.swing.JButton jb16;
    private javax.swing.JButton jb17;
    private javax.swing.JButton jb18;
    private javax.swing.JButton jb19;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JTextField jtf1;
    // End of variables declaration//GEN-END:variables
}
