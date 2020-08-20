package Sec;

import java.util.Vector;
import javax.swing.JOptionPane;

public class Pesquisar extends javax.swing.JFrame {

    private Vector vetd;
    private Vector vetr;

    public Vector getVetd() {
        return vetd;
    }

    public void setVetd(Vector vetd) {
        this.vetd = vetd;
    }

    public Vector getVetr() {
        return vetr;
    }

    public void setVetr(Vector vetr) {
        this.vetr = vetr;
    }

    public Pesquisar() {
        initComponents();
    }

    public void pesquisar() {
        Dados d = new Dados();
        String saida = "";
        String data = "";
        data = txtdata.getText();
        int tot = 0;

        for (int i = 0; i < vetd.size(); i++) {
            d = (Dados) vetd.elementAt(i);
            if (data.equals(d.getData())) {
                saida += "Op. Depósito:" + (i + 1);
                saida += "        Data:" + d.getData();
                saida += "        Horário:" + d.getHorario();
                saida += "        Valor:" + d.getValor() + "\n";
                tot = i + 1;
            }
        }

        if (tot == 0) {
            JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADOS", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
        jtsaida.setText(saida);
        txtdata.requestFocus();
    }
    
      public void pesquisar2() {
        Dados d = new Dados();
        String saida = "";
        String horario = "";
        horario = txtdata.getText();
        int tot = 0;

        for (int i = 0; i < vetd.size(); i++) {
            d = (Dados) vetd.elementAt(i);
            if (horario.equals(d.getData())) {
                saida += "Op. Depósito:" + (i + 1);
                saida += "        Data:" + d.getData();
                saida += "        Horário:" + d.getHorario();
                saida += "        Valor:" + d.getValor() + "\n";
                tot = i + 1;
            }
        }

        if (tot == 0) {
            JOptionPane.showMessageDialog(null, "DADOS NÃO ENCONTRADOS", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
        jtsaida.setText(saida);
        txtdata.requestFocus();
    }

     public void voltar() {
        Operacao op = new Operacao();
        op.setVetd(vetd);
        op.setVetr(vetr);
        op.show();
        this.hide();
        this.dispose();
        op.setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthorario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        btnpesq = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        jtsaida = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Horário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Valor");

        btnpesq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpesq.setText("Pesquisar");
        btnpesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqActionPerformed(evt);
            }
        });
        btnpesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnpesqKeyPressed(evt);
            }
        });

        btnvoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        btnvoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnvoltarKeyPressed(evt);
            }
        });

        jtsaida.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnpesq, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnvoltar))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpesq)
                    .addComponent(btnvoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(478, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqActionPerformed
        pesquisar();
        pesquisar2();
    }//GEN-LAST:event_btnpesqActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
 voltar();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnpesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnpesqKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            pesquisar();
            pesquisar2();
        }
    }//GEN-LAST:event_btnpesqKeyPressed

    private void btnvoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnvoltarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            voltar();
        }
    }//GEN-LAST:event_btnvoltarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesq;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea jtsaida;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
