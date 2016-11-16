package Prova;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Joao Antonio
 */
public class tela extends javax.swing.JFrame {
    static ArrayList<Pergunta> perguntas = new ArrayList<>();
    static int contTela=0;
    static int questoesCertas = 0;
    static Aluno aluno;
    static JFileChooser fc;
    static Prova prova;
    ManipulacaoArquivos manipula = new ManipulacaoArquivos();
    
    public tela() {
        initComponents();
        try {
            manipula.pegaPerguntas();
            String nome=JOptionPane.showInputDialog("Digite seu Nome");
            aluno= new Aluno();
            aluno.setNomeAluno(nome);
            prova=new Prova();
            prova.setAluno(aluno);
            Date calendario;
            calendario = new Date();
            String data = calendario.getDay()+"/"+calendario.getMonth()+"/"+
                    calendario.getYear()+" "+calendario.getHours()+":"+
                    calendario.getMinutes()+":"+calendario.getSeconds()+"";
            prova.setHoraInicio(data);
        } catch (IOException ex) {
            Logger.getLogger(tela.class.getName()).log(Level.SEVERE, null, ex);
        }
//        for(Pergunta p: perguntas)
//            System.out.println(p.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        area = new javax.swing.JDesktopPane();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaLayout = new javax.swing.GroupLayout(area);
        area.setLayout(areaLayout);
        areaLayout.setHorizontalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        areaLayout.setVerticalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(area)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 946, Short.MAX_VALUE)
                .addComponent(btnIniciar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnSair))
                .addGap(0, 0, 0)
                .addComponent(area))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        gerarTela();
        btnIniciar.setVisible(false);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed
    public static void gerarTela(){
        telaPergunta telaPergunta1 = new telaPergunta();
        area.add(telaPergunta1);
        telaPergunta1.setVisible(true);
        contTela+=1;
    }
    public void sair(){
        Date calendario1;
        calendario1 = new Date();
        String data1 = calendario1.getDay()+"/"+calendario1.getMonth()+"/"+
                calendario1.getYear()+" "+calendario1.getHours()+":"+
                calendario1.getMinutes()+":"+calendario1.getSeconds()+"";
        prova.setHoraFim(data1);
        manipula.gravaRelatorio(prova);
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane area;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSair;
    // End of variables declaration//GEN-END:variables
}
