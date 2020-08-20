package Sec;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Autenticar extends javax.swing.JFrame {
    
    public Clip clip;
    public String rota = "/audio/" ; 
    
    public Autenticar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void som (String arquivo){
    try {
    clip = AudioSystem.getClip();
    clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(rota + arquivo + ".wav")));
    clip.start();
    }catch (Exception e) {
    
    }
    }
    
    
    public void autenticar() {
        String login = "", senha = "";
        login = txtlogin.getText();
        senha = txtsenha.getText();
        
        if (login.equals("")) {
            JOptionPane.showMessageDialog(null, "O CAMPO LOGIN É OBRIGATÓRIO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            txtlogin.requestFocus();
        } else if (senha.equals("")) {
            JOptionPane.showMessageDialog(null, "O CAMPO SENHA É OBRIGATÓRIO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            txtsenha.setText("");
            txtsenha.requestFocus();
        } else {
            if ((login.equals("willmoney")) && (senha.equals("sanches09"))) {
              
                som("will");
                Operacao op = new Operacao();
                op.show();
                this.hide();
                this.dispose();
                op.setVisible(true);

               

            } else {
                JOptionPane.showMessageDialog(null, "VOCÊ NÃO PODE ACESSAR ESTE SISTEMA.", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpar();
                txtlogin.requestFocus();
            }
        }
    }

    public void limpar() {
        txtlogin.setText("");
        txtsenha.setText("");
        txtlogin.grabFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        btnok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 255, 204));

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 90, 50);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SENHA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 180, 100, 60);

        txtlogin.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        txtlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtloginKeyPressed(evt);
            }
        });
        jPanel1.add(txtlogin);
        txtlogin.setBounds(100, 130, 240, 30);

        txtsenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtsenha);
        txtsenha.setBounds(100, 200, 240, 30);

        btnok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        btnok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnokKeyPressed(evt);
            }
        });
        jPanel1.add(btnok);
        btnok.setBounds(170, 260, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/will2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -150, 500, 640);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(445, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
          txtsenha.requestFocus();  
        } 
    }//GEN-LAST:event_txtloginKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
if (evt.getKeyCode() == evt.VK_ENTER) {
          btnok.requestFocus();  
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaKeyPressed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        autenticar();
    }//GEN-LAST:event_btnokActionPerformed

    private void btnokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnokKeyPressed
     if (evt.getKeyCode() == evt.VK_ENTER) {
         autenticar ();  
        } 
    }//GEN-LAST:event_btnokKeyPressed

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
            java.util.logging.Logger.getLogger(Autenticar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
