// Nome: Abner do Nascimento Santos - RA: 2504154 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadMercadoria extends javax.swing.JFrame {

    private Mercadoria mercadoria;
    private BDClasses gerMercadoria = BDClasses.getInstance();
    
    private static FormCadMercadoria cadProdUnico;
    
    private FormCadMercadoria() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadMercadoria getCadProd(){
        if(cadProdUnico == null){
            cadProdUnico = new FormCadMercadoria();
            System.out.println("\nCADProd NOVO");
        }
        else{
            System.out.println("\nCADProd VELHO");
        }
        return cadProdUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtQuant = new javax.swing.JLabel();
        rtAgenda = new javax.swing.JLabel();
        rtForn = new javax.swing.JLabel();
        cxQuant = new javax.swing.JTextField();
        cxAgenda = new javax.swing.JTextField();
        cxForn = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        rtDesc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cxDesc = new javax.swing.JTextField();
        cxSetor = new javax.swing.JTextField();
        cxId = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadProd = new javax.swing.JButton();
        btConsProdId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        btAltProdId = new javax.swing.JButton();
        btExcluirProdId = new javax.swing.JButton();
        cxNome = new javax.swing.JTextField();
        rtId = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtSetor = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtQuant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtQuant.setText("Quantidade:");

        rtAgenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtAgenda.setText("Agendamento (HH:mm):");

        rtForn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtForn.setText("Fornecedor:");

        cxAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAgendaActionPerformed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtDesc.setText("Descrição:");

        cxSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSetorActionPerformed(evt);
            }
        });

        cxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadProd.setText("Cadastrar");
        btCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadProdActionPerformed(evt);
            }
        });

        btConsProdId.setText("Consultar ID");
        btConsProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsProdIdActionPerformed(evt);
            }
        });

        tblProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "PREÇO", "FORNECEDOR", "QUANT", "DESCRICAO", "VOLUME", "ALCOOLICA"
            }
        ));
        jScrollPane1.setViewportView(tblProd);

        btAltProdId.setText("Alterar pelo ID");
        btAltProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltProdIdActionPerformed(evt);
            }
        });

        btExcluirProdId.setText("Excluir por ID");
        btExcluirProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProdIdActionPerformed(evt);
            }
        });

        rtId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtId.setText("ID: ");

        rtPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtPreco.setText("Preço:");

        rtSetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtSetor.setText("Setor:");

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtSetor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(rtNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cxNome))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rtForn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cxForn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtId)
                                        .addGap(12, 12, 12)
                                        .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btLimpar)
                                        .addGap(37, 37, 37)
                                        .addComponent(btSair))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtQuant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(rtDesc)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btCadProd)
                                .addGap(43, 43, 43)
                                .addComponent(btConsProdId)
                                .addGap(50, 50, 50)
                                .addComponent(btAltProdId)
                                .addGap(49, 49, 49)
                                .addComponent(btExcluirProdId))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rtAgenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtId)
                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtForn)
                    .addComponent(cxForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQuant)
                    .addComponent(cxQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtDesc)
                    .addComponent(cxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtSetor)
                    .addComponent(cxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAgenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadProd)
                    .addComponent(btConsProdId)
                    .addComponent(btAltProdId)
                    .addComponent(btExcluirProdId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAgendaActionPerformed

    private void cxSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSetorActionPerformed

    private void cxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIdActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadProdActionPerformed
        cadastrar();
        listarTab();
    }//GEN-LAST:event_btCadProdActionPerformed

    private void btConsProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsProdIdActionPerformed
        consultar();
    }//GEN-LAST:event_btConsProdIdActionPerformed

    private void btAltProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltProdIdActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAltProdIdActionPerformed

    private void btExcluirProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProdIdActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirProdIdActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    public void excluir(){
        mercadoria = new Mercadoria();
      
         try{
            mercadoria.setIdProd(cxId.getText());
            
            mercadoria = gerMercadoria.consProdId(mercadoria);
         
            if(mercadoria != null){
                
                cxId.setText(Integer.toString(mercadoria.getIdProd()));
                cxNome.setText(mercadoria.getNomeProd());
                
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o mercadoria?", "Exclusão de rmercadoria", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    gerMercadoria.removeProdId(mercadoria);
                    JOptionPane.showMessageDialog(null, "mercadoria removida com sucesso!", "Remoção de rmercadoria", 1);
                    limpar();
                }
            }
            else{
              JOptionPane.showMessageDialog(null, "Não existe mercadoria com este ID!", "Rmercadoria inexistente", 0);
              cxId.setText("");
              cxId.requestFocus();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxId.setText("");
            cxId.requestFocus();
        } //fim catch

    
    }
    
    public void alterar(){
        mercadoria = new Mercadoria();
      
         try{
            mercadoria.setIdProd(cxId.getText());
                
            mercadoria = gerMercadoria.atualizaProdId(mercadoria);
         
            if(mercadoria != null){
                JOptionPane.showMessageDialog(null, "Produto atualizado!", "rmercadoria Atualizado", 1);
                limpar();
             }
            else{
              JOptionPane.showMessageDialog(null, "Não existe produto com este codigo!", "Rmercadoria inexistente", 0);
              cxId.setText("");
              cxId.requestFocus();
            }
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxId.setText("");
            cxId.requestFocus();
        } //fim catch
    }
    
    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tblProd.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Mercadoria mercadoria : gerMercadoria.getBdMerc()){
            modelo.insertRow(posLin, new Object[]{mercadoria.getIdProd(), mercadoria.getNomeProd(), mercadoria.getPreco(), mercadoria.getFornecedor(), mercadoria.getQuant(), mercadoria.getDesc(), mercadoria.getSetor(), mercadoria.getAgenda()});
            posLin++;
        }
    }
    
        public void consultar(){
        mercadoria = new Mercadoria();
      
         try{
            mercadoria.setIdProd(cxId.getText());
                
            mercadoria = gerMercadoria.consProdId(mercadoria);
         
         if(mercadoria != null){
            cxId.setText(Integer.toString(mercadoria.getIdProd()));
            cxNome.setText(mercadoria.getNomeProd());
            cxPreco.setText(Double.toString(mercadoria.getPreco()));
            cxQuant.setText(Integer.toString(mercadoria.getQuant()));
            cxDesc.setText(mercadoria.getDesc());
            cxForn.setText(mercadoria.getFornecedor());
            cxSetor.setText(mercadoria.getSetor());
            cxAgenda.setText(mercadoria.getAgenda());
            JOptionPane.showMessageDialog(null, "Confira os dados do produto!", "Produto encontrado", 1);
            limpar();
         }
         else{
            JOptionPane.showMessageDialog(null, "Não existe produto com este codigo!", "Produto inexistente", 0);
            cxId.setText("");
            cxId.requestFocus();
         }
        } //fim try
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O codigo deve ser um inteiro!", "ERRO de codigo", 0);
            cxId.setText("");
            cxId.requestFocus();
        } //fim catch
    }
    
    public void cadastrar(){
        mercadoria = new Mercadoria();
        try{
            mercadoria.setIdProd(cxId.getText());
            mercadoria.setNomeProd(cxNome.getText());
            mercadoria.setPreco(cxPreco.getText());
            mercadoria.setQuant(cxQuant.getText());
            mercadoria.setDesc(cxDesc.getText());
            mercadoria.setFornecedor(cxForn.getText()); //Não há como verificar se Fornecedor já foi cadastrado
            mercadoria.setSetor(cxSetor.getText());
            mercadoria.setAgenda(cxAgenda.getText());
           

                 
         mercadoria = gerMercadoria.cadProd(mercadoria);
         
         if(mercadoria != null){
            mercadoria.impDados();
            limpar();
         }
         else{
            JOptionPane.showMessageDialog(null, "Já existe um produto com este codigo!", "ERRO de ID", 0);
            cxId.setText("");
            cxId.requestFocus();
         }
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxId.setText("");
            cxId.requestFocus();
        }
        catch (NumberException ne) {
            StackTraceElement[] stackTrace = ne.getStackTrace();
            if (stackTrace[0].getMethodName().equals("setQuant")) {
                JOptionPane.showMessageDialog(null, "A quantidade deve ser um inteiro!", "ERRO de Quantidade", 0);
                cxQuant.setText("");
                cxQuant.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", 0);
            }        
        } 
        catch (DecimalNumberException dne) {
            JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
            cxPreco.setText("");
            cxPreco.requestFocus();
        }
        catch (LetterException le) {
            JOptionPane.showMessageDialog(null, "A resposta deve ser apenas letras!", "ERRO", 0);
            cxSetor.setText("");
            cxSetor.requestFocus();
        }
        catch(TimeException te){
            JOptionPane.showMessageDialog(null, "Digite no formato (HH:mm)!", "ERRO", 0);
            cxAgenda.setText("");
            cxAgenda.requestFocus();
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Confirmar Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxId.setText("");
        cxNome.setText("");
        cxPreco.setText("");
        cxQuant.setText("");
        cxDesc.setText("");
        cxForn.setText("");
        cxSetor.setText("");
        cxAgenda.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltProdId;
    private javax.swing.JButton btCadProd;
    private javax.swing.JButton btConsProdId;
    private javax.swing.JButton btExcluirProdId;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAgenda;
    private javax.swing.JTextField cxDesc;
    private javax.swing.JTextField cxForn;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQuant;
    private javax.swing.JTextField cxSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel rtAgenda;
    private javax.swing.JLabel rtDesc;
    private javax.swing.JLabel rtForn;
    private javax.swing.JLabel rtId;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtQuant;
    private javax.swing.JLabel rtSetor;
    private javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
}
