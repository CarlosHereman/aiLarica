// Nome: Abner do Nascimento Santos - RA: 2504154 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadBebida extends javax.swing.JFrame {

    private Bebida bebida;
    private BDClasses gerBebida = BDClasses.getInstance();
    
    private static FormCadBebida cadProdUnico;
    
    private FormCadBebida() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadBebida getCadProd(){
        if(cadProdUnico == null){
            cadProdUnico = new FormCadBebida();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        rtForn = new javax.swing.JLabel();
        cxAlcool = new javax.swing.JTextField();
        rtDesc = new javax.swing.JLabel();
        cxDesc = new javax.swing.JTextField();
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
        rtVolume = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        rtQuant = new javax.swing.JLabel();
        rtAlcool = new javax.swing.JLabel();
        cxQuant = new javax.swing.JTextField();
        cxForn = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cxVolume = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtForn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtForn.setText("Fornecedor:");

        cxAlcool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAlcoolActionPerformed(evt);
            }
        });

        rtDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtDesc.setText("Descrição:");

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

        rtVolume.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtVolume.setText("Volume:");

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        rtQuant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtQuant.setText("Quantidade:");

        rtAlcool.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtAlcool.setText("É alcoólica? 1- SIM ou 2- NÃO:");

        rtNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtNome.setText("Nome:");

        cxVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVolumeActionPerformed(evt);
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
                                .addComponent(rtVolume)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(btConsProdId))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rtAlcool)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btAltProdId)
                                .addGap(49, 49, 49)
                                .addComponent(btExcluirProdId))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(rtVolume)
                    .addComponent(cxVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtAlcool))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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

    private void cxAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAlcoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAlcoolActionPerformed

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

    private void cxVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVolumeActionPerformed

     public void excluir(){
        bebida = new Bebida();
      
         try{
            bebida.setIdProd(cxId.getText());
            
            bebida = gerBebida.consProdId(bebida);
         
            if(bebida != null){
                
                cxId.setText(Integer.toString(bebida.getIdProd()));
                cxNome.setText(bebida.getNomeProd());
                
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o bebida?", "Exclusão de rbebida", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    gerBebida.removeProdId(bebida);
                    JOptionPane.showMessageDialog(null, "bebida removida com sucesso!", "Remoção de rbebida", 1);
                    limpar();
                }
            }
            else{
              JOptionPane.showMessageDialog(null, "Não existe bebida com este ID!", "Rbebida inexistente", 0);
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
        bebida = new Bebida();
      
         try{
            bebida.setIdProd(cxId.getText());
                
            bebida = gerBebida.atualizaProdId(bebida);
         
            if(bebida != null){
                JOptionPane.showMessageDialog(null, "Rbebida atualizado!", "rbebida Atualizado", 1);
                limpar();
             }
            else{
              JOptionPane.showMessageDialog(null, "Não existe rbebida com este codigo!", "Rbebida inexistente", 0);
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
        
        for(Bebida bebida : gerBebida.getBdBeb()){
            modelo.insertRow(posLin, new Object[]{bebida.getIdProd(), bebida.getNomeProd(), bebida.getPreco(), bebida.getFornecedor(), bebida.getQuant(), bebida.getDesc(), bebida.getVolume(), bebida.getAlcoolica()});
            posLin++;
        }
    }
    
        public void consultar(){
        bebida = new Bebida();
      
         try{
            bebida.setIdProd(cxId.getText());
                
            bebida = gerBebida.consProdId(bebida);
         
         if(bebida != null){
            cxId.setText(Integer.toString(bebida.getIdProd()));
            cxNome.setText(bebida.getNomeProd());
            cxPreco.setText(Double.toString(bebida.getPreco()));
            cxQuant.setText(Integer.toString(bebida.getQuant()));
            cxDesc.setText(bebida.getDesc());
            cxForn.setText(bebida.getFornecedor());
            cxVolume.setText(Float.toString(bebida.getVolume()));
            cxAlcool.setText(Boolean.toString(bebida.getAlcoolica()));
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
        bebida = new Bebida();
        try{
            bebida.setIdProd(cxId.getText());
            bebida.setNomeProd(cxNome.getText());
            bebida.setPreco(cxPreco.getText());
            bebida.setQuant(cxQuant.getText());
            bebida.setDesc(cxDesc.getText());
            bebida.setFornecedor(cxForn.getText()); //Não há como verificar se Fornecedor já foi cadastrado
            bebida.setVolume(cxVolume.getText());
            bebida.setAlcoolica(Integer.parseInt((cxAlcool.getText())));
           

                 
         bebida = gerBebida.cadProd(bebida);
         
         if(bebida != null){
            bebida.impDados();
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
            StackTraceElement[] stackTrace = dne.getStackTrace();
            if (stackTrace[0].getMethodName().equals("setQuant")) {
                JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
                cxPreco.setText("");
                cxPreco.requestFocus();
            } else if (stackTrace[0].getMethodName().equals("setVolume")){
                JOptionPane.showMessageDialog(null, "O volume deve ser um valor valido!", "ERRO de Preço", 0);
                cxVolume.setText("");
                cxVolume.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro desconhecido!", "ERRO", 0);
            }
        }
        catch (OptionException oe) {
            JOptionPane.showMessageDialog(null, "A resposta deve ser 1 ou 2(SIM ou NÃO)!", "ERRO", 0);
            cxAlcool.setText("");
            cxAlcool.requestFocus();
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
        cxVolume.setText("");
        cxAlcool.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltProdId;
    private javax.swing.JButton btCadProd;
    private javax.swing.JButton btConsProdId;
    private javax.swing.JButton btExcluirProdId;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAlcool;
    private javax.swing.JTextField cxDesc;
    private javax.swing.JTextField cxForn;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQuant;
    private javax.swing.JTextField cxVolume;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel rtAlcool;
    private javax.swing.JLabel rtDesc;
    private javax.swing.JLabel rtForn;
    private javax.swing.JLabel rtId;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtQuant;
    private javax.swing.JLabel rtVolume;
    private javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
}
