// Nome: Abner do Nascimento Santos - RA: 2504154 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadFornecedor extends javax.swing.JFrame {

    private Fornecedor fornecedor;
    private BDClasses gerFornecedor = BDClasses.getInstance();

    private static FormCadFornecedor cadFornecedorUnico;
    
    private FormCadFornecedor() {
        initComponents();
    }

    // MÉTODO SINGLETON
    public static FormCadFornecedor getCadFornecedor() {
        if (cadFornecedorUnico == null) {
            cadFornecedorUnico = new FormCadFornecedor();
            System.out.println("\nCADFORNECEDOR NOVO");
        } else {
            System.out.println("\nCADFORNECEDOR VELHO");
        }
        return cadFornecedorUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        cxTel = new javax.swing.JTextField();
        btCadClient = new javax.swing.JButton();
        rtEnd = new javax.swing.JLabel();
        btConsClientCnpj = new javax.swing.JButton();
        cxEnd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFornecedor = new javax.swing.JTable();
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

        btConsClientCnpj.setText("Consultar CNPJ");
        btConsClientCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsClientCnpjActionPerformed(evt);
            }
        });

        tabFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CNPJ", "NOME", "TELEFONE", "ENDEREÇO", "CATEGORIA"
            }
        ));
        jScrollPane1.setViewportView(tabFornecedor);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtCateg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtEnd)
                                    .addComponent(rtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rtCnpj)
                                    .addComponent(rtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxCateg, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(cxNome)
                                    .addComponent(cxCnpj)
                                    .addComponent(cxTel)
                                    .addComponent(cxEnd)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addGap(36, 36, 36)
                                .addComponent(btSair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadClient)
                        .addGap(57, 57, 57)
                        .addComponent(btConsClientCnpj)
                        .addGap(54, 54, 54)
                        .addComponent(btAltClientCnpj)
                        .addGap(61, 61, 61)
                        .addComponent(btExcluirClientCnpj)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadClient)
                    .addComponent(btConsClientCnpj)
                    .addComponent(btAltClientCnpj)
                    .addComponent(btExcluirClientCnpj))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        listarTab();
    }//GEN-LAST:event_btCadClientActionPerformed

    private void btConsClientCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsClientCnpjActionPerformed
        consultar();
    }//GEN-LAST:event_btConsClientCnpjActionPerformed

    private void btAltClientCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltClientCnpjActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAltClientCnpjActionPerformed

    private void btExcluirClientCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClientCnpjActionPerformed
        excluir();
        listarTab();
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
            
            fornecedor = gerFornecedor.cadFornecedor(fornecedor);
            
            if (fornecedor != null) {
                fornecedor.impDados();
                limpar();
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
    }

    public void consultar() {
        fornecedor = new Fornecedor();

        try {
            fornecedor.setCnpj(cxCnpj.getText());

            fornecedor = gerFornecedor.consFornecedorCnpj(fornecedor);
            if (fornecedor != null) {
                cxCnpj.setText(Long.toString(fornecedor.getCnpj()));
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

        try {
            fornecedor.setCnpj(cxCnpj.getText());

            fornecedor = gerFornecedor.atualizaFornecedorCnpj(fornecedor);

            if (fornecedor != null) {
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

        try {
            fornecedor.setCnpj(cxCnpj.getText());

            fornecedor = gerFornecedor.consFornecedorCnpj(fornecedor);

            if (fornecedor != null) {
                cxCnpj.setText(Long.toString(fornecedor.getCnpj()));
                cxNome.setText(fornecedor.getNome());

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Fornecedor?", "Exclusão de Fornecedor", JOptionPane.YES_NO_CANCEL_OPTION);
                if (x == 0) {
                    gerFornecedor.removeFornecedorCnpj(fornecedor);
                    JOptionPane.showMessageDialog(null, "Fornecedor removido com sucesso!", "Remoção de Fornecedor", 1);
                    limpar();
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

    // Método para listar os fornecedores na tabela
    public void listarTab() {
        DefaultTableModel modelo = (DefaultTableModel) tabFornecedor.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for (Fornecedor fornecedor : gerFornecedor.getBdFornecedor()) {
            modelo.insertRow(posLin, new Object[]{fornecedor.getCnpj(), fornecedor.getNome(), fornecedor.getTel(), fornecedor.getEnd(), fornecedor.getCateg()});
            posLin++;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltClientCnpj;
    private javax.swing.JButton btCadClient;
    private javax.swing.JButton btConsClientCnpj;
    private javax.swing.JButton btExcluirClientCnpj;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCateg;
    private javax.swing.JTextField cxCnpj;
    private javax.swing.JTextField cxEnd;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtCateg;
    private javax.swing.JLabel rtCnpj;
    private javax.swing.JLabel rtEnd;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtTel;
    private javax.swing.JTable tabFornecedor;
    // End of variables declaration//GEN-END:variables
}
