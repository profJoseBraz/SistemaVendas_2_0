/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visaoFrame;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.outros.ArmazenadorDadosTemporarios;
import com.mycompany.outros.Constantes;
import com.mycompany.outros.Utilizades;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class CadastroComputador extends javax.swing.JFrame {

    /**
     * Creates new form CadastroComputador
     */
    public CadastroComputador() {
        initComponents();
        
        verificarDadosTemporarios(ArmazenadorDadosTemporarios.tempObject);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMemoriaRam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfProcessador = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de computador");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setText("Nome");

        jLabel2.setText("Preço");

        jLabel3.setText("Memória Ram");

        jLabel4.setText("Processador");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addComponent(tfProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMemoriaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMemoriaRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarDadosTemporarios(Object object){
        if(object != null){
            if(object instanceof Computador){
                tfNome.setText(((Computador) object).getNome());
                tfPreco.setText(((Computador) object).getPreco().toString());
                tfMemoriaRam.setText(((Computador) object).getMemoriaRam().toString());
                tfProcessador.setText(((Computador) object).getProcessador());
                setTitle("Alteração de computador");
                btnSalvar.setText(Constantes.BTN_NOME_ALTERAR);
                btnExcluir.setVisible(true);
            }
        }else{
            btnSalvar.setText(Constantes.BTN_NOME_SALVAR);
            setTitle("Cadastro de computador");
            btnExcluir.setVisible(false);
        }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(btnSalvar.getText().equals(Constantes.BTN_NOME_ALTERAR)){
            Computador computador = new Computador();
            
            computador = (Computador) ArmazenadorDadosTemporarios.tempObject;
            computador.setNome(tfNome.getText());
            computador.setPreco(Double.parseDouble(tfPreco.getText()));
            computador.setMemoriaRam(Double.parseDouble(tfMemoriaRam.getText()));
            computador.setProcessador(tfProcessador.getText());
            
            ControleSistema.produtos.set(ArmazenadorDadosTemporarios.indice, computador);
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        
            Listagem.listarComputador();
            
            ArmazenadorDadosTemporarios.tempObject = null;
        }else{
            if(!Utilizades.produtoJaExiste(tfNome.getText(), ControleSistema.produtos) && btnSalvar.getText().equals(Constantes.BTN_NOME_SALVAR)){
                try{
                    Computador computador = new Computador();

                    computador.setNome(tfNome.getText());
                    computador.setPreco(Double.parseDouble(tfPreco.getText()));
                    computador.setMemoriaRam(Double.parseDouble(tfMemoriaRam.getText()));
                    computador.setProcessador(tfProcessador.getText());

                    ControleSistema.produtos.add(computador);

                    JOptionPane.showMessageDialog(null, "Computador " + computador.getNome() + " salvo com sucesso!");

                    tfNome.setText("");
                    tfPreco.setText("");
                    tfMemoriaRam.setText("");
                    tfProcessador.setText("");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao salvar! Motivo: " + e.getMessage());
                }

                for(int i = 0; i < ControleSistema.produtos.size(); i++){
                    System.out.println(ControleSistema.produtos.get(i));
                }
            }else{
                JOptionPane.showMessageDialog(null, "O produto " + tfNome.getText() + " já está cadastrado!");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            ControleSistema.produtos.remove(ArmazenadorDadosTemporarios.tempObject);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
            Listagem.listarTodos();
            Listagem.listarComputador();
            ArmazenadorDadosTemporarios.tempObject = null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField tfMemoriaRam;
    public javax.swing.JTextField tfNome;
    public javax.swing.JTextField tfPreco;
    public javax.swing.JTextField tfProcessador;
    // End of variables declaration//GEN-END:variables
}
