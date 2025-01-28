// Nome: Abner do Nascimento Santos - RA: 2504154 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadPedido extends javax.swing.JFrame {

    private Pedido pedido;
    private BDClasses gerPedido = BDClasses.getInstance();
    
    private static FormCadPedido cadProdUnico;
    
    private FormCadPedido() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadPedido getCadPed(){
        if(cadProdUnico == null){
            cadProdUnico = new FormCadPedido();
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

        btExcluirPedID = new javax.swing.JButton();
        cxHora = new javax.swing.JTextField();
        cxIdPed = new javax.swing.JTextField();
        rtIdPed = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        rtPreco = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        cxPreco = new javax.swing.JTextField();
        btCadClient = new javax.swing.JButton();
        rtStatus = new javax.swing.JLabel();
        btConsPedID = new javax.swing.JButton();
        cxStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPed = new javax.swing.JTable();
        rtPagamento = new javax.swing.JLabel();
        cxPagamento = new javax.swing.JTextField();
        btAltPedID = new javax.swing.JButton();
        rtHora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rtNomeClient = new javax.swing.JLabel();
        rtEndClient = new javax.swing.JLabel();
        cxNomeClient = new javax.swing.JTextField();
        cxEndClient = new javax.swing.JTextField();
        rtProd = new javax.swing.JLabel();
        cxProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btExcluirPedID.setText("Excluir por ID");
        btExcluirPedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirPedIDActionPerformed(evt);
            }
        });

        rtIdPed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtIdPed.setText("ID:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rtPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtPreco.setText("Preço:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        btCadClient.setText("Cadastrar");
        btCadClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClientActionPerformed(evt);
            }
        });

        rtStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtStatus.setText("Status:");

        btConsPedID.setText("Consultar ID");
        btConsPedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsPedIDActionPerformed(evt);
            }
        });

        tblPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "HORA", "PREÇO", "STATUS", "PAGAMENTO", "CLIENTE", "ENDEREÇO", "PRODUTO"
            }
        ));
        jScrollPane1.setViewportView(tblPed);

        rtPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtPagamento.setText("Forma de Pagamento:");

        btAltPedID.setText("Alterar pelo ID");
        btAltPedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltPedIDActionPerformed(evt);
            }
        });

        rtHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtHora.setText("Hora:");

        rtNomeClient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtNomeClient.setText("Nome do Cliente:");

        rtEndClient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtEndClient.setText("Endereço do Cliente:");

        rtProd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtProd.setText("Tipo do Produto:");

        cxProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtStatus)
                                    .addComponent(rtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rtHora)
                                    .addComponent(rtIdPed))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cxPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(cxHora, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxIdPed, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addGap(36, 36, 36)
                                .addComponent(btSair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtNomeClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rtProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxProd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEndClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxEndClient))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCadClient)
                                .addGap(57, 57, 57)
                                .addComponent(btConsPedID)
                                .addGap(54, 54, 54)
                                .addComponent(btAltPedID)
                                .addGap(61, 61, 61)
                                .addComponent(btExcluirPedID)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtIdPed)
                    .addComponent(cxIdPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtHora)
                    .addComponent(cxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtStatus)
                    .addComponent(cxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPagamento)
                    .addComponent(cxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNomeClient)
                    .addComponent(cxNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtProd)
                    .addComponent(cxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEndClient)
                    .addComponent(cxEndClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadClient)
                    .addComponent(btConsPedID)
                    .addComponent(btAltPedID)
                    .addComponent(btExcluirPedID))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirPedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirPedIDActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirPedIDActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void btCadClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClientActionPerformed
        cadastrar();
        listarTab();
    }//GEN-LAST:event_btCadClientActionPerformed

    private void btConsPedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsPedIDActionPerformed
        consultar();
    }//GEN-LAST:event_btConsPedIDActionPerformed

    private void btAltPedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltPedIDActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAltPedIDActionPerformed

    private void cxProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxProdActionPerformed

        public void excluir(){
        pedido = new Pedido();
      
         try{
            pedido.setIdPed(cxIdPed.getText());
            
            pedido = gerPedido.consPedId(pedido);
         
            if(pedido != null){
                
                cxIdPed.setText(Integer.toString(pedido.getIdPed()));
                
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o pedido?", "Exclusão de rpedido", JOptionPane.YES_NO_CANCEL_OPTION);
                if(x == 0){
                    gerPedido.removePedId(pedido);
                    JOptionPane.showMessageDialog(null, "Pedido removido com sucesso!", "Remoção de pedido", 1);
                    limpar();
                }
            }
            else{
              JOptionPane.showMessageDialog(null, "Não existe pedido com este ID!", "Pedido inexistente", 0);
              cxIdPed.setText("");
              cxIdPed.requestFocus();
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
        } //fim catch

    
    }
    
    public void alterar(){
        pedido = new Pedido();
      
         try{
            pedido.setIdPed(cxIdPed.getText());
                
            pedido = gerPedido.atualizaPedId(pedido);
         
            if(pedido != null){
                JOptionPane.showMessageDialog(null, "Pedido atualizado!", "Pedido Atualizado", 1);
                limpar();
             }
            else{
              JOptionPane.showMessageDialog(null, "Não existe Pedido com este codigo!", "Pedido inexistente", 0);
              cxIdPed.setText("");
              cxIdPed.requestFocus();
            }
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
        } //fim catch
    }
    
    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tblPed.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Pedido pedido : gerPedido.getBdPed()){
            modelo.insertRow(posLin, new Object[]{pedido.getIdPed(), pedido.getHora(), pedido.getPreco(), pedido.getStatus(), pedido.getPagamento(), pedido.getNomeClient(), pedido.getEndClient(), pedido.getProd()});
            posLin++;
        }
    }
    
        public void consultar(){
        pedido = new Pedido();
      
         try{
            pedido.setIdPed(cxIdPed.getText());
                
            pedido = gerPedido.consPedId(pedido);
         
         if(pedido != null){
            cxIdPed.setText(Integer.toString(pedido.getIdPed()));
            cxHora.setText(pedido.getHora());
            cxPreco.setText(Double.toString(pedido.getPreco()));
            cxStatus.setText(pedido.getStatus());
            cxPagamento.setText(pedido.getPagamento());
            cxNomeClient.setText(pedido.getNomeClient());
            cxEndClient.setText(pedido.getEndClient());
            cxProd.setText(pedido.getProd());
            JOptionPane.showMessageDialog(null, "Confira os dados do pedido!", "Pedido encontrado", 1);
            limpar();
         }
         else{
            JOptionPane.showMessageDialog(null, "Não existe pedido com este codigo!", "Pedido inexistente", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
         }
        } //fim try
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O codigo deve ser um inteiro!", "ERRO de codigo", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
        } //fim catch
    }
    
    public void cadastrar(){
        pedido = new Pedido();
        try{
            pedido.setIdPed(cxIdPed.getText());
            pedido.setHora(cxHora.getText());
            pedido.setPreco(Double.parseDouble(cxPreco.getText()));
            pedido.setStatus(cxStatus.getText());
            pedido.setPagamento(cxPagamento.getText());
            pedido.setNomeClient(cxNomeClient.getText()); //Não há como verificar se Cliente já foi cadastrado
            pedido.setEndClient(cxEndClient.getText()); //Não há como verificar se Cliente já foi cadastrado
            pedido.setProd(cxProd.getText()); //Não há como verificar se Produto já foi cadastrado
            pedido.calcularFrete();  
                 
         pedido = gerPedido.cadPed(pedido);
         
         if(pedido != null){
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!", "Cadastro OK", 1);
            pedido.impFrete();
            limpar();
         }
         else{
            JOptionPane.showMessageDialog(null, "Já existe um pedido com este codigo!", "ERRO de ID", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
         }
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O ID deve ser um inteiro!", "ERRO de ID", 0);
            cxIdPed.setText("");
            cxIdPed.requestFocus();
        }
        catch(TimeException te){
            JOptionPane.showMessageDialog(null, "Digite no formato (HH:mm)!", "ERRO", 0);
            cxHora.setText("");
            cxHora.requestFocus();
        }
        catch (StatusException se) {
            JOptionPane.showMessageDialog(null, "Digite em um formato válido (preparando, a caminho, entregue ou cancelado).", "ERRO", 0);
            cxStatus.setText("");
            cxStatus.requestFocus();
        }
        catch (LetterException e) {
            JOptionPane.showMessageDialog(null, "A forma de pagamento deve ser apenas letras!", "ERRO", 0);
            cxPagamento.setText("");
            cxPagamento.requestFocus();
        }
        catch (InfoProdException ipe) {
            JOptionPane.showMessageDialog(null, "Informe um tipo de produto válido (refeicao, medicamento, bebida ou mercadoria", "ERRO", 0);
            cxProd.setText("");
            cxProd.requestFocus();
        }
        
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Confirmar Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        cxIdPed.setText("");
        cxHora.setText("");
        cxPreco.setText("");
        cxStatus.setText("");
        cxPagamento.setText("");
        cxNomeClient.setText("");
        cxEndClient.setText("");
        cxProd.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltPedID;
    private javax.swing.JButton btCadClient;
    private javax.swing.JButton btConsPedID;
    private javax.swing.JButton btExcluirPedID;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxEndClient;
    private javax.swing.JTextField cxHora;
    private javax.swing.JTextField cxIdPed;
    private javax.swing.JTextField cxNomeClient;
    private javax.swing.JTextField cxPagamento;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxProd;
    private javax.swing.JTextField cxStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel rtEndClient;
    private javax.swing.JLabel rtHora;
    private javax.swing.JLabel rtIdPed;
    private javax.swing.JLabel rtNomeClient;
    private javax.swing.JLabel rtPagamento;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtProd;
    private javax.swing.JLabel rtStatus;
    private javax.swing.JTable tblPed;
    // End of variables declaration//GEN-END:variables
}
