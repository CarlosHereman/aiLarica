import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class InfoProdException extends Exception {
    
    public Pedido infoProdExc(Pedido pedido) {
        try {
            String prod = JOptionPane.showInputDialog(null, "Informe um tipo válido.", "Atualização", JOptionPane.QUESTION_MESSAGE);
            pedido.setProd(prod);
        } catch (InfoProdException ipe) {
            JOptionPane.showMessageDialog(null, "Informe um tipo de produto válido (refeicao, medicamento, bebida ou mercadoria", "ERRO", 0);
            pedido = ipe.infoProdExc(pedido);
        }
        return pedido;
    }
}
