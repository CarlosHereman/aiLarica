// Nome: Abner do Nascimento Santos - RA: 2504154 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadMedicamento extends javax.swing.JFrame {

    private Medicamento medicamento;
    private BDClasses gerMedicamento = BDClasses.getInstance();
    
    private static FormCadMedicamento cadProdUnico;
    
    private FormCadMedicamento() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadMedicamento getCadProd(){
        if(cadProdUnico == null){
            cadProdUnico = new FormCadMedicamento();
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

        rtPrincipio = new javax.swing.JLabel();
        rtRegistro = new javax.swing.JLabel();
        rtReceita = new javax.swing.JLabel();
        cxForn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cxPrincipio = new javax.swing.JTextField();
        cxReceita = new javax.swing.JTextField();
        cxRegistro = new javax.swing.JTextField();
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
        cxPreco = new javax.swing.JTextField();
        rtQuant = new javax.swing.JLabel();
        cxQuant = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        rtForn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtPrincipio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtPrincipio.setText("Principio Ativo: ");

        rtRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtRegistro.setText("RegistroMS:");

        rtReceita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtReceita.setText("Receita médica? 1- SIM ou 2- NÃO:");

        cxPrincipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrincipioActionPerformed(evt);
            }
        });

        cxReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxReceitaActionPerformed(evt);
            }
        });

        cxRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRegistroActionPerformed(evt);
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "PREÇO", "FORNECEDOR", "QUANT", "DESCRICAO", "PRINCIPIO", "REGISTRO", "RECEITA"
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

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        rtQuant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtQuant.setText("Quantidade:");

        rtNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtForn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtForn.setText("Fornecedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxReceita))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtId)
                                    .addGap(12, 12, 12)
                                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(37, 37, 37)
                                    .addComponent(btSair))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtPrincipio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtRegistro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtQuant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btCadProd)
                .addGap(43, 43, 43)
                .addComponent(btConsProdId)
                .addGap(52, 52, 52)
                .addComponent(btAltProdId)
                .addGap(49, 49, 49)
                .addComponent(btExcluirProdId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(rtPrincipio)
                    .addComponent(cxPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtRegistro)
                    .addComponent(cxRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtReceita)
                    .addComponent(cxReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cxPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrincipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrincipioActionPerformed

    private void cxRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRegistroActionPerformed

    private void cxReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxReceitaActionPerformed

        public void excluir(){
        medicamento = new Medicamento();
      
         try{
            medicamento.setIdProd(cxId.getText());
            
            medicamento = gerMedicamento.consProdId(medicamento);
         
            if(medicamento != null){
                
                cxId.setText(Integer.toString(medicamento.getIdProd()));
                cxNome.setText(medicamento.getNomeProd());
                
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o medicamento?", "Exclusão de rmedicamento", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    gerMedicamento.removeProdId(medicamento);
                    JOptionPane.showMessageDialog(null, "Medicamento removida com sucesso!", "Remoção de rmedicamento", 1);
                    limpar();
                }
            }
            else{
              JOptionPane.showMessageDialog(null, "Não existe medicamento com este ID!", "Rmedicamento inexistente", 0);
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
        medicamento = new Medicamento();
      
         try{
            medicamento.setIdProd(cxId.getText());
                
            medicamento = gerMedicamento.atualizaProdId(medicamento);
         
            if(medicamento != null){
                JOptionPane.showMessageDialog(null, "Rmedicamento atualizado!", "rmedicamento Atualizado", 1);
                limpar();
             }
            else{
              JOptionPane.showMessageDialog(null, "Não existe rmedicamento com este codigo!", "Rmedicamento inexistente", 0);
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
        
        for(Medicamento medicamento : gerMedicamento.getBdMed()){
            modelo.insertRow(posLin, new Object[]{medicamento.getIdProd(), medicamento.getNomeProd(), medicamento.getPreco(), medicamento.getFornecedor(), medicamento.getQuant(), medicamento.getDesc(), medicamento.getPrincipio(), medicamento.getRegistro(), medicamento.getReceita()});
            posLin++;
        }
    }
    
        public void consultar(){
        medicamento = new Medicamento();
      
         try{
            medicamento.setIdProd(cxId.getText());
                
            medicamento = gerMedicamento.consProdId(medicamento);
         
         if(medicamento != null){
            cxId.setText(Integer.toString(medicamento.getIdProd()));
            cxNome.setText(medicamento.getNomeProd());
            cxPreco.setText(Double.toString(medicamento.getPreco()));
            cxQuant.setText(Integer.toString(medicamento.getQuant()));
            cxDesc.setText(medicamento.getDesc());
            cxForn.setText(medicamento.getFornecedor());
            cxPrincipio.setText(medicamento.getPrincipio());
            cxRegistro.setText(Long.toString(medicamento.getRegistro()));
            cxReceita.setText(Boolean.toString(medicamento.getReceita()));
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
        medicamento = new Medicamento();
        try{
            medicamento.setIdProd(cxId.getText());
            medicamento.setNomeProd(cxNome.getText());
            medicamento.setPreco(cxPreco.getText());
            medicamento.setQuant(cxQuant.getText());
            medicamento.setDesc(cxDesc.getText());
            medicamento.setFornecedor(cxForn.getText()); //Não há como verificar se Fornecedor já foi cadastrado
            medicamento.setRegistro(cxRegistro.getText());
            medicamento.setPrincipio(cxPrincipio.getText());
            medicamento.setReceita(Integer.parseInt((cxReceita.getText())));
           

                 
         medicamento = gerMedicamento.cadProd(medicamento);
         
         if(medicamento != null){
            medicamento.impDados();
            limpar();
         }
         else{
            JOptionPane.showMessageDialog(null, "Já existe uma medicamento com este codigo!", "ERRO de ID", 0);
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
            } else if (stackTrace[0].getMethodName().equals("setRegistro")) {
                JOptionPane.showMessageDialog(null, "O registro deve ser um inteiro!", "ERRO de inserção", 0);
                cxRegistro.setText("");
                cxRegistro.requestFocus();
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
            JOptionPane.showInputDialog(null, "O principio ativo deve ser apenas letras", "Erro", 0);
            cxPrincipio.setText("");
            cxPrincipio.requestFocus();
        }
        catch (OptionException oe) {
            JOptionPane.showMessageDialog(null, "A receita deve ser 1 ou 2(SIM ou NÃO)!", "ERRO", 0);
            cxReceita.setText("");
            cxReceita.requestFocus();
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
        cxReceita.setText("");
        cxRegistro.setText("");
        cxReceita.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltProdId;
    private javax.swing.JButton btCadProd;
    private javax.swing.JButton btConsProdId;
    private javax.swing.JButton btExcluirProdId;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxDesc;
    private javax.swing.JTextField cxForn;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxPrincipio;
    private javax.swing.JTextField cxQuant;
    private javax.swing.JTextField cxReceita;
    private javax.swing.JTextField cxRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel rtDesc;
    private javax.swing.JLabel rtForn;
    private javax.swing.JLabel rtId;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtPrincipio;
    private javax.swing.JLabel rtQuant;
    private javax.swing.JLabel rtReceita;
    private javax.swing.JLabel rtRegistro;
    private javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
}
