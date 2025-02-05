
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class FormCadFornecedor extends javax.swing.JFrame {

    private Fornecedor fornecedor;
    
    private static FormCadFornecedor instanciaUnica;
    
    private FormCadFornecedor() {
        initComponents();
    }

    // MÉTODO SINGLETON
    public static FormCadFornecedor getCadFornecedor() {
        if (instanciaUnica == null || !instanciaUnica.isVisible()) {
            instanciaUnica = new FormCadFornecedor();
        }
        return instanciaUnica;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        cxTel = new javax.swing.JTextField();
        btCadClient = new javax.swing.JButton();
        rtEnd = new javax.swing.JLabel();
        cxEnd = new javax.swing.JTextField();
        rtCateg = new javax.swing.JLabel();
        cxCateg = new javax.swing.JTextField();
        btAltClientCnpj = new javax.swing.JButton();
        rtCnpj = new javax.swing.JLabel();
        btExcluirClientCnpj = new javax.swing.JButton();
        cxCnpj = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        rtTel = new javax.swing.JLabel();
        rtEmail = new javax.swing.JLabel();
        cxEmail = new javax.swing.JTextField();
        rtSenha = new javax.swing.JLabel();
        cxSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        cxTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelActionPerformed(evt);
            }
        });

        btCadClient.setText("Cadastrar");
        btCadClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClientActionPerformed(evt);
            }
        });

        rtEnd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtEnd.setText("Endereço:");

        rtCateg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCateg.setText("Categoria:");

        btAltClientCnpj.setText("Alterar pelo CNPJ");
        btAltClientCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltClientCnpjActionPerformed(evt);
            }
        });

        rtCnpj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCnpj.setText("CNPJ:");

        btExcluirClientCnpj.setText("Excluir por CNPJ");
        btExcluirClientCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClientCnpjActionPerformed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtNome.setText("Nome: ");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rtTel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtTel.setText("Telefone:");

        rtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtEmail.setText("Email:");

        rtSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtSenha.setText("Senha:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preencha os campos abaixo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtEnd)
                            .addComponent(rtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtCnpj)
                            .addComponent(rtNome)
                            .addComponent(rtCateg)
                            .addComponent(rtEmail)
                            .addComponent(rtSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxSenha)
                            .addComponent(cxEmail)
                            .addComponent(cxCateg)
                            .addComponent(cxEnd)
                            .addComponent(cxNome)
                            .addComponent(cxCnpj)
                            .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadClient)
                        .addGap(72, 72, 72)
                        .addComponent(btAltClientCnpj)
                        .addGap(66, 66, 66)
                        .addComponent(btExcluirClientCnpj)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCnpj)
                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEnd)
                    .addComponent(cxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCateg)
                    .addComponent(cxCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEmail)
                    .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtSenha)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadClient)
                    .addComponent(btAltClientCnpj)
                    .addComponent(btExcluirClientCnpj))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelActionPerformed

    private void btCadClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClientActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadClientActionPerformed

    private void btAltClientCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltClientCnpjActionPerformed
        alterar();
    }//GEN-LAST:event_btAltClientCnpjActionPerformed

    private void btExcluirClientCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClientCnpjActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirClientCnpjActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    public void limpar() {
        cxNome.setText("");
        cxCnpj.setText("");
        cxTel.setText("");
        cxEnd.setText("");
        cxCateg.setText("");
        cxEmail.setText("");
        cxSenha.setText("");
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void cadastrar() {
        fornecedor = new Fornecedor();

        try {
            fornecedor.setNome(cxNome.getText());
            fornecedor.setCnpj(cxCnpj.getText());
            fornecedor.setTel(cxTel.getText());
            fornecedor.setEnd(cxEnd.getText());
            fornecedor.setCateg(cxCateg.getText());
            fornecedor.setEmail(cxEmail.getText());
            fornecedor.setSenha(cxSenha.getText());
            
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            
            if (fornecedorDAO.consultarFornecedorPorCpf(fornecedor.getCnpj()) == null) {
                boolean sucesso = fornecedorDAO.cadastrarFornecedor(fornecedor);
                
                if(sucesso){
                    fornecedor.impDados();
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor já existe com este CNPJ!", "Erro de Cadastro", 0);
                cxCnpj.setText("");
                cxCnpj.requestFocus();
            }
        }
         catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O CNPJ deve ser um inteiro!", "ERRO de CNPJ", 0);
            cxCnpj.setText("");
            cxCnpj.requestFocus();
        }      
        catch (LetterException le) {
            StackTraceElement[] stackTrace = le.getStackTrace();
            if (stackTrace[0].getMethodName().equals("setNome")) {
                JOptionPane.showMessageDialog(null, "O Nome deve ser apenas letras!", "ERRO de Nome", 0);
                cxNome.setText("");
                cxNome.requestFocus();
            } else if (stackTrace[0].getMethodName().equals("setCateg")) {
                JOptionPane.showMessageDialog(null, "A Categoria deve ser apenas letras!", "ERRO de Categoria", 0);
                cxCateg.setText("");
                cxCateg.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", 0);
            }        
        } 
        catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "O Telefone deve ser inteiro!", "ERRO de Telefone", 0);
            cxTel.setText("");
            cxTel.requestFocus();
        }
        catch (EmailException ee) {
            JOptionPane.showMessageDialog(null, "O E-mail deve ser valido!", "ERRO de E-mail", 0);
            cxEmail.setText("");
            cxEmail.requestFocus();
        }
    }

    public void consultar() {
        fornecedor = new Fornecedor();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        try {
            fornecedor.setCnpj(cxCnpj.getText());
            fornecedor = fornecedorDAO.consultarFornecedorPorCpf(fornecedor.getCnpj());
                    
            if (fornecedor != null) {
                cxCnpj.setText(fornecedor.getCnpj());
                cxNome.setText(fornecedor.getNome());
                cxTel.setText(Long.toString(fornecedor.getTel()));
                cxEnd.setText(fornecedor.getEnd());
                cxCateg.setText(fornecedor.getCateg());
                JOptionPane.showMessageDialog(null, "Confira os Dados do Fornecedor!", "Fornecedor encontrado", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe fornecedor com este CNPJ!", "Fornecedor inexistente", 0);
                cxCnpj.setText("");
                cxCnpj.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CNPJ deve ser um inteiro!", "ERRO de CNPJ", 0);
            cxCnpj.setText("");
            cxCnpj.requestFocus();
        }
    }

    public void alterar() {
        fornecedor = new Fornecedor();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        try {
            fornecedor.setCnpj(cxCnpj.getText());
            boolean sucesso = fornecedorDAO.atualizarFornecedor(fornecedor);
            
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Fornecedor atualizado!", "Fornecedor Atualizado", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe fornecedor com este CNPJ!", "Fornecedor inexistente", 0);
                cxCnpj.setText("");
                cxCnpj.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CNPJ deve ser um inteiro!", "ERRO de CNPJ", 0);
            cxCnpj.setText("");
            cxCnpj.requestFocus();
        }
    }

    public void excluir() {
        fornecedor = new Fornecedor();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        try {
            fornecedor.setCnpj(cxCnpj.getText());

            fornecedor = fornecedorDAO.consultarFornecedorPorCpf(fornecedor.getCnpj());

            if (fornecedor != null) {
                cxCnpj.setText(fornecedor.getCnpj());
                cxNome.setText(fornecedor.getNome());

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cadastro?", "Exclusão de Fornecedor", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == 0) {
                    boolean sucesso = fornecedorDAO.removerFornecedor(fornecedor.getCnpj());
                    if (sucesso){
                        JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!", "Remoção de Fornecedor", 1);
                        limpar();
                    } else {
                         JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro", "Erro", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe fornecedor com este CNPJ!", "Fornecedor inexistente", 0);
                cxCnpj.setText("");
                cxCnpj.requestFocus();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O CNPJ deve ser um inteiro!", "ERRO de CNPJ", 0);
            cxCnpj.setText("");
            cxCnpj.requestFocus();
        }
    }

    
    /* Método para listar os fornecedores na tabela
    public void listarTab() {
        DefaultTableModel modelo = (DefaultTableModel) tabFornecedor.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for (Fornecedor fornecedor : gerFornecedor.getBdFornecedor()) {
            modelo.insertRow(posLin, new Object[]{fornecedor.getCnpj(), fornecedor.getNome(), fornecedor.getTel(), fornecedor.getEnd(), fornecedor.getCateg()});
            posLin++;
        }
    }*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltClientCnpj;
    private javax.swing.JButton btCadClient;
    private javax.swing.JButton btExcluirClientCnpj;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCateg;
    private javax.swing.JTextField cxCnpj;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxEnd;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JTextField cxTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel rtCateg;
    private javax.swing.JLabel rtCnpj;
    private javax.swing.JLabel rtEmail;
    private javax.swing.JLabel rtEnd;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JLabel rtTel;
    // End of variables declaration//GEN-END:variables
}
