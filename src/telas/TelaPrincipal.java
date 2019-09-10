package telas;

import disciplinas.Apoio;
import disciplinas.Disciplina;
import disciplinas.Populacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.bencke
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfDisciplinas = new javax.swing.JTextField();
        txfProfessores = new javax.swing.JTextField();
        txfTurnos = new javax.swing.JTextField();
        txfGeracoes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txfPopulacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblGene = new javax.swing.JLabel();
        lblFitness = new javax.swing.JLabel();
        lblQtdPopulacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alocador de Disciplinas");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setText("Disciplinas : *");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(34, 34, 80, 24);

        jLabel2.setText("Professores : *");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(33, 69, 100, 24);

        jLabel3.setText("Turnos : *");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(34, 104, 80, 24);

        jLabel4.setText("Quantidade da População : *");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(39, 170, 160, 24);

        txfDisciplinas.setText("9");
        jPanel1.add(txfDisciplinas);
        txfDisciplinas.setBounds(200, 40, 51, 20);

        txfProfessores.setText("6");
        jPanel1.add(txfProfessores);
        txfProfessores.setBounds(200, 70, 51, 20);

        txfTurnos.setText("5");
        jPanel1.add(txfTurnos);
        txfTurnos.setBounds(200, 110, 51, 20);

        txfGeracoes.setText("3");
        txfGeracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfGeracoesActionPerformed(evt);
            }
        });
        jPanel1.add(txfGeracoes);
        txfGeracoes.setBounds(200, 140, 51, 20);

        jLabel5.setText("(1 - 9)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 40, 120, 14);

        jLabel6.setText("(1 - 6)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 70, 160, 14);

        jLabel7.setText("(1 - 5)");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 110, 170, 14);

        jLabel8.setText("(1 - 1000)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 170, 240, 14);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar);
        btnIniciar.setBounds(50, 210, 89, 36);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(170, 210, 89, 36);

        jLabel9.setText("Número de Gerações : *");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(37, 139, 140, 24);

        txfPopulacao.setText("1000");
        txfPopulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPopulacaoActionPerformed(evt);
            }
        });
        jPanel1.add(txfPopulacao);
        txfPopulacao.setBounds(200, 170, 51, 20);

        jLabel10.setText("(1 - 500)");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 140, 240, 14);
        jPanel1.add(lblGene);
        lblGene.setBounds(50, 290, 200, 20);
        jPanel1.add(lblFitness);
        lblFitness.setBounds(50, 320, 200, 20);
        jPanel1.add(lblQtdPopulacao);
        lblQtdPopulacao.setBounds(50, 350, 210, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfGeracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfGeracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfGeracoesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int inicial_geracao = 0;
        int qtd_disciplinas = Integer.parseInt(txfDisciplinas.getText());
        int professores = Integer.parseInt(txfProfessores.getText());
        int turnos = Integer.parseInt(txfTurnos.getText());
        int geracoes = Integer.parseInt(txfGeracoes.getText());
        int populacao = Integer.parseInt(txfPopulacao.getText());

        if ((qtd_disciplinas > 0 && qtd_disciplinas < 10) && (professores > 0 && professores < 7) && (turnos > 0 && turnos < 6) && (geracoes > 0 && geracoes < 501) && (populacao > 0 && populacao < 1001)) {
            Populacao pop = new Populacao();
            ArrayList<Disciplina> array = pop.geraPopulacao(populacao, geracoes, turnos, professores, qtd_disciplinas);
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i).toString());
            }
            
            
            //exibir o melhor resultado entre todas as geracoes/melhor fitness

        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os Campos Entre os Intervalos Solicitados!");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txfPopulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPopulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPopulacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFitness;
    private javax.swing.JLabel lblGene;
    private javax.swing.JLabel lblQtdPopulacao;
    private javax.swing.JTextField txfDisciplinas;
    private javax.swing.JTextField txfGeracoes;
    private javax.swing.JTextField txfPopulacao;
    private javax.swing.JTextField txfProfessores;
    private javax.swing.JTextField txfTurnos;
    // End of variables declaration//GEN-END:variables
}
