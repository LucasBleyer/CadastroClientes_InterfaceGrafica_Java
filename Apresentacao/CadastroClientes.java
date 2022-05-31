
package Apresentacao;

import Dominio.Cliente;
import Dominio.Comum;
import Dominio.Vip;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CadastroClientes extends javax.swing.JPanel {
    
    private ArrayList<Cliente> listClientes;
    
    public CadastroClientes() {
        initComponents();
        listClientes = new ArrayList();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tf_telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        cbx_estadoCivil = new javax.swing.JComboBox<>();
        rb_feminino = new javax.swing.JRadioButton();
        bt_cadastrar = new javax.swing.JButton();
        bt_vizualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb_Comum = new javax.swing.JRadioButton();
        rb_Vip = new javax.swing.JRadioButton();

        jLabel5.setText("Estado Civil:");

        jLabel4.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cadastro de Clientes");

        buttonGroup1.add(rb_masculino);
        rb_masculino.setText("Masculino");

        cbx_estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viúvo", "Corno" }));

        buttonGroup1.add(rb_feminino);
        rb_feminino.setText("Feminino");

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        bt_vizualizar.setText("Visualizar");
        bt_vizualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_vizualizarMouseClicked(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jLabel2.setText("Idade: ");

        jLabel3.setText("Telefone: ");

        jLabel7.setText("Tipo Cliente:");

        buttonGroup2.add(rb_Comum);
        rb_Comum.setText("Comum");

        buttonGroup2.add(rb_Vip);
        rb_Vip.setText("VIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_masculino)
                                .addGap(18, 18, 18)
                                .addComponent(rb_feminino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rb_Comum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_Vip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_cadastrar)
                                .addGap(63, 63, 63)
                                .addComponent(bt_vizualizar)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masculino)
                    .addComponent(rb_feminino)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Comum)
                    .addComponent(rb_Vip))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadastrar)
                    .addComponent(bt_vizualizar))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    public Cliente obterClienteComum(){
      
        String nome = tf_nome.getText();
        
        String str_idade = tf_idade.getText();
        int idade = Integer.parseInt(str_idade);
        
        String telefone = tf_telefone.getText();
        
        String str_sexo = "";
        if(rb_masculino.isSelected())str_sexo = "Masculino";
        if(rb_feminino.isSelected())str_sexo = "Feminino";
        
        String str_estadoCivil = cbx_estadoCivil.getSelectedItem().toString();
        
        Cliente clienteComum = new Comum(nome, idade, telefone, str_sexo, str_estadoCivil) {};
        
        return clienteComum;
    }
    
    public Cliente obterClienteVip(){
      
        String nome = tf_nome.getText();
        
        String str_idade = tf_idade.getText();
        int idade = Integer.parseInt(str_idade);
        
        String telefone = tf_telefone.getText();
        
        String str_sexo = "";
        if(rb_masculino.isSelected())str_sexo = "Masculino";
        if(rb_feminino.isSelected())str_sexo = "Feminino";
        
        String str_estadoCivil = cbx_estadoCivil.getSelectedItem().toString();
        
        Cliente clienteVip = new Vip(nome, idade, telefone, str_sexo, str_estadoCivil) {};
        
        return clienteVip;
    }
    
    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        
        if ((tf_nome.getText().isEmpty() || tf_idade.getText().isEmpty() || tf_telefone.getText().isEmpty()) && 
            (rb_masculino.isSelected() == false || rb_feminino.isSelected() == false) &&
            (rb_Comum.isSelected() == false || rb_Vip.isSelected() == false))
        {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos", "Cadastro de Clientes", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(rb_Comum.isSelected()==true)
            {
                listClientes.add(obterClienteComum());
                JOptionPane.showMessageDialog(null, "Cliente Comum Cadastrado com Sucesso", "Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                if(rb_Vip.isSelected()==true)
                {
                    listClientes.add(obterClienteVip());
                    JOptionPane.showMessageDialog(null, "Cliente VIP Cadastrado com Sucesso", "Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void bt_vizualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_vizualizarMouseClicked

        if(listClientes.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "É preciso ter pelo menos um Cliente cadastrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            TelaPrincipalForm.listagemCLientes = new ListagemClientes(listClientes);
            
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            janela.add(TelaPrincipalForm.listagemCLientes, BorderLayout.CENTER);
            janela.pack();
        }
    }//GEN-LAST:event_bt_vizualizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_vizualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbx_estadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rb_Comum;
    private javax.swing.JRadioButton rb_Vip;
    private javax.swing.JRadioButton rb_feminino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JTextField tf_idade;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}
