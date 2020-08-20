package janelas;

import java.util.Vector;

public class Relatorio extends javax.swing.JFrame {

    private Vector vetf;

    public Relatorio() {
        initComponents();
        vetf = new Vector();
    }

    public Vector getVetf() {
        return vetf;
    }

    public void setVetf(Vector vetf) {
        this.vetf = vetf;
    }

    public void listartodos() {
        Funcionario f = new Funcionario();
        String saida = "";

        for (int i = 0; i < vetf.size(); i++) {
            f = (Funcionario) vetf.elementAt(i);
            saida += "---------------\n";
            saida += "Registro: " + (i + 1) + "\n";
            saida += "Nome:" + f.getNome() + "\n";
            saida += "Cargo:" + f.getCargo() + "\n";
            saida += "Salario:" + f.getSalario() + "\n";

        }
        jtsaida.setText(saida);
    }

    public void voltar() {
        Principal p = new Principal();
        p.setVetf(vetf);
        p.atualizaContador();
        p.show();
        this.hide();
        this.dispose();
        p.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGerarRelatorio = new javax.swing.JButton();
        jtsaida = new java.awt.TextArea();
        btnVoltar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RELATÓRIO GERAL");

        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        btnGerarRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGerarRelatorioKeyPressed(evt);
            }
        });

        jtsaida.setEditable(false);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVoltarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGerarRelatorio)
                        .addGap(72, 72, 72)
                        .addComponent(btnVoltar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarRelatorio)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(painel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        listartodos();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnGerarRelatorioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGerarRelatorioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            listartodos();
        }
    }//GEN-LAST:event_btnGerarRelatorioKeyPressed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            voltar();
        }
    }//GEN-LAST:event_btnVoltarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea jtsaida;
    private javax.swing.JPanel painel3;
    // End of variables declaration//GEN-END:variables
}
