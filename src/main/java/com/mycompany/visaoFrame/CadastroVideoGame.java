/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visaoFrame;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.ArmazenadorDadosTemporarios;
import com.mycompany.outros.Constantes;
import com.mycompany.outros.Utilizades;
import javax.swing.JOptionPane;

/**
 *
 * @author 10156
 */
public class CadastroVideoGame extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVideoGame
     */
    public CadastroVideoGame() {
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
        tfPlataforma = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de video game");

        jLabel1.setText("Nome");

        jLabel2.setText("Preço");

        jLabel3.setText("Plataforma");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addComponent(tfPlataforma)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(jButton2)))
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
                .addComponent(tfPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarDadosTemporarios(Object object){
        if(object != null){
            if(object instanceof VideoGame){
                tfNome.setText(((VideoGame) object).getNome());
                tfPreco.setText(((VideoGame) object).getPreco().toString());
                tfPlataforma.setText(((VideoGame) object).getPlataforma());
                setTitle("Alteração de video game");
                btnSalvar.setText(Constantes.BTN_NOME_ALTERAR);
            }
        }else{
            setTitle("Cadastro de video game");
        }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(btnSalvar.getText().equals(Constantes.BTN_NOME_ALTERAR)){
            VideoGame videoGame = new VideoGame();
            
            videoGame = (VideoGame) ArmazenadorDadosTemporarios.tempObject;
            videoGame.setNome(tfNome.getText());
            videoGame.setPreco(Double.parseDouble(tfPreco.getText()));
            videoGame.setPlataforma(tfPlataforma.getText());
            
            ControleSistema.produtos.set(ArmazenadorDadosTemporarios.indice, videoGame);
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        
            Listagem.listarVideoGame();
            
            ArmazenadorDadosTemporarios.tempObject = null;
        }else{
            if(!Utilizades.produtoJaExiste(tfNome.getText(), ControleSistema.produtos)){
                try{
                    VideoGame videoGame = new VideoGame();

                    videoGame.setNome(tfNome.getText());
                    videoGame.setPreco(Double.parseDouble(tfPreco.getText()));
                    videoGame.setPlataforma(tfPlataforma.getText());

                    ControleSistema.produtos.add(videoGame);

                    JOptionPane.showMessageDialog(null, "Video game " + videoGame.getNome() + " salvo com sucesso!");

                    tfNome.setText("");
                    tfPreco.setText("");
                    tfPlataforma.setText("");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            ControleSistema.produtos.remove(ArmazenadorDadosTemporarios.tempObject);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
            Listagem.listarTodos();
            Listagem.listarVideoGame();
            ArmazenadorDadosTemporarios.tempObject = null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVideoGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPlataforma;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
