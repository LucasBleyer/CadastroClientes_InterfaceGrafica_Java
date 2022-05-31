
package Apresentacao;

import Dominio.Cliente;
import Dominio.Vip;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class ListagemClientes extends javax.swing.JPanel {

    private CadastroClientes cadastroClientes;
    
    private ArrayList<Cliente> listClientes;//lista do tipo cliente
    
    public JRadioButton rb_Vip;
    
    public ListagemClientes(ArrayList listClientes) {
        initComponents();
        
        this.listClientes = listClientes; 
        
        for (int i = 0; i < this.listClientes.size(); i++)//percorre toda a lista
        {
            String nome = this.listClientes.get(i).getNome();//apenas o nome do cliente
            cbx_lista_clientes_cadastrados.addItem(nome);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        bt_imprimir = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        cbx_lista_clientes_cadastrados = new javax.swing.JComboBox<>();
        bt_EnviarMsg = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Clientes Cadastrados");

        bt_imprimir.setText("Imprimir");
        bt_imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirMouseClicked(evt);
            }
        });

        bt_remover.setText("Remover");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });

        bt_EnviarMsg.setText("Enviar Mensagem");
        bt_EnviarMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EnviarMsgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbx_lista_clientes_cadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_imprimir)
                                .addGap(50, 50, 50)
                                .addComponent(bt_remover)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_EnviarMsg)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cbx_lista_clientes_cadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_imprimir)
                    .addComponent(bt_remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(bt_EnviarMsg)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimirMouseClicked

        System.out.println(listClientes.toString());
    }//GEN-LAST:event_bt_imprimirMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked

        
       switch(JOptionPane.showConfirmDialog(this, "Você têm certeza disso?")){
           case 0 ://botão sim
                    String nome = this.cbx_lista_clientes_cadastrados.getSelectedItem().toString();
                    for (int i = 0; i < this.listClientes.size(); i++)
                    {
                        if(nome.equals(listClientes.get(i).getNome()))
                        {       
                            this.cbx_lista_clientes_cadastrados.removeItemAt(i);
                            this.listClientes.remove(i);
                            JOptionPane.showMessageDialog(null, "Cliente Removido com Sucesso", "Remoção de Clientes", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
               break;
               
           case 1 ://botão não
               break;
               
           case 2://botão cancel
                    TelaPrincipalForm.cadastroClientes = new CadastroClientes();
                
                    JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                    janela.getContentPane().removeAll();
                    janela.add(TelaPrincipalForm.cadastroClientes, BorderLayout.CENTER);
                    janela.pack();
               break;
       }
            
        if(this.listClientes.isEmpty())
        {
            TelaPrincipalForm.cadastroClientes = new CadastroClientes();
                
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            janela.add(TelaPrincipalForm.cadastroClientes, BorderLayout.CENTER);
            janela.pack();
        }
    }//GEN-LAST:event_bt_removerMouseClicked

    private void bt_EnviarMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EnviarMsgMouseClicked
        
        for (int i = 0; i < listClientes.size(); i++)
        {
            if(listClientes.get(i) instanceof Vip)
            {
                Vip vip = (Vip)listClientes.get(i);
                vip.enviarMensagem();
            }
        }
    }//GEN-LAST:event_bt_EnviarMsgMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_EnviarMsg;
    private javax.swing.JButton bt_imprimir;
    private javax.swing.JButton bt_remover;
    private javax.swing.JComboBox<String> cbx_lista_clientes_cadastrados;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}