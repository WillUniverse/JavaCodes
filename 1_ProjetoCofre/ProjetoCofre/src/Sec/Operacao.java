package Sec;
//DOis métodos construtor, depósito e saque

import javax.swing.*;
import java.util.*;

public class Operacao extends javax.swing.JFrame {

    private Vector vetd;
    private Vector vetr;

    public Vector getVetr() {
        return vetr;
    }

    public void setVetr(Vector vetr) {
        this.vetr = vetr;
    }

    public Vector getVetd() {
        return vetd;
    }

    public void setVetd(Vector vetd) {
        this.vetd = vetd;
    }

    public Operacao() {
        initComponents();
        vetd = new Vector();
        vetr = new Vector();
    }

    public void depositar() {
        String data = "", horario = "";
        double valor = 0;
        data = txtdata.getText();
        horario = txthorario.getText();
        valor = Double.parseDouble(txtvalor.getText());

        Dados d = new Dados(data, horario, valor);
        vetd.addElement(d);

        JOptionPane.showMessageDialog(null, "DEPÓSITO CONCLUÍDO", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        limpar();
        txtdata.requestFocus();
        relatorio();
        DepRet();

    }

    public void sacar() {
        String data = "", horario = "";
        double valor = 0;
        data = txtdata.getText();
        horario = txthorario.getText();
        valor = Double.parseDouble(txtvalor.getText());

        Dados d = new Dados(data, horario, valor);
        vetr.addElement(d);

        JOptionPane.showMessageDialog(null, "SAQUE CONCLUÍDO", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        limpar();
        txtdata.requestFocus();
        relatorio2();
        DepRet();

    }

    public void DepRet() {
        double saida2 = 0, saida3 = 0, saida4 = 0;
        Dados d = new Dados();

        for (int i = 0; i < vetd.size(); i++) {
            d = (Dados) vetd.elementAt(i);
            saida2 = saida2 + d.getValor();

        }

        for (int i = 0; i < vetr.size(); i++) {
            d = (Dados) vetr.elementAt(i);
            saida3 = saida3 + d.getValor();

        }
        jtdepositado.setText(String.valueOf(saida2));
        jtretirado.setText(String.valueOf(saida3));

        saida4 = saida2 - saida3;
        jtsaldo.setText(String.valueOf(saida4));
    }

    public void relatorio() {

        Dados d = new Dados();
        String saida = "";
        for (int i = 0; i < vetd.size(); i++) {
            d = (Dados) vetd.elementAt(i);
            saida += "Op. Depósito:" + (i + 1);
            saida += "        Data:" + d.getData();
            saida += "        Horário:" + d.getHorario();
            saida += "        Valor:" + d.getValor() + "\n";

        }
        jtsaida.setText(saida);
    }

    public void relatorio2() {

        Dados d = new Dados();
        String saida2 = "";
        for (int i = 0; i < vetr.size(); i++) {
            d = (Dados) vetr.elementAt(i);
            saida2 += "Op. Saque:" + (i + 1);
            saida2 += "        Data:" + d.getData();
            saida2 += "        Horário:" + d.getHorario();
            saida2 += "        Valor:" + d.getValor() + "\n";

        }
        jtsaida2.setText(saida2);
    }

    public void pesquisar() {
        Pesquisar pe = new Pesquisar();
        pe.setVetd(vetd);
        pe.setVetr(vetr);
        pe.show();
        this.hide();
        this.dispose();
        pe.setVisible(true);
    }

    public void limpar() {
        txtdata.setText("");
        txthorario.setText("");
        txtvalor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthorario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        btndepositar = new javax.swing.JButton();
        btnsacar = new javax.swing.JButton();
        jtsaida = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        jtdepositado = new javax.swing.JTextField();
        btnpesq = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtretirado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtsaldo = new javax.swing.JTextField();
        jtsaida2 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operação");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Horário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Valor");

        btndepositar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndepositar.setText("Depositar");
        btndepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositarActionPerformed(evt);
            }
        });
        btndepositar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndepositarKeyPressed(evt);
            }
        });

        btnsacar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsacar.setText("Sacar");
        btnsacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsacarActionPerformed(evt);
            }
        });
        btnsacar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsacarKeyPressed(evt);
            }
        });

        jtsaida.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Depositado");

        jtdepositado.setEditable(false);

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Retirado");

        jtretirado.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Saldo");

        jtsaldo.setEditable(false);

        jtsaida2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btndepositar)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnsacar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnpesq))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtdepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtretirado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtsaida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txthorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndepositar)
                    .addComponent(btnsacar)
                    .addComponent(btnpesq))
                .addGap(18, 18, 18)
                .addComponent(jtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtsaida2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtdepositado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jtretirado)
                    .addComponent(jLabel6)
                    .addComponent(jtsaldo))
                .addGap(209, 209, 209))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        setSize(new java.awt.Dimension(480, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositarActionPerformed
        depositar();
    }//GEN-LAST:event_btndepositarActionPerformed

    private void btndepositarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndepositarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            depositar();
        }
    }//GEN-LAST:event_btndepositarKeyPressed

    private void btnsacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsacarActionPerformed
        sacar();
    }//GEN-LAST:event_btnsacarActionPerformed

    private void btnsacarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsacarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            sacar();
        }
    }//GEN-LAST:event_btnsacarKeyPressed

    private void btnpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnpesqActionPerformed

    private void btnpesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnpesqKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_btnpesqKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndepositar;
    private javax.swing.JButton btnpesq;
    private javax.swing.JButton btnsacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtdepositado;
    private javax.swing.JTextField jtretirado;
    private java.awt.TextArea jtsaida;
    private java.awt.TextArea jtsaida2;
    private javax.swing.JTextField jtsaldo;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
