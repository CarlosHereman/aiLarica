
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class StatusException extends Exception {

    public Pedido statusExc(Pedido pedido) {
        try {
            String status = JOptionPane.showInputDialog(null, "Informe um status válido.", "Atualização", JOptionPane.QUESTION_MESSAGE);
            pedido.setStatus(status);
        } catch (StatusException se) {
            JOptionPane.showMessageDialog(null, "Digite em um formato válido (preparando, a caminho, entregue ou cancelado).", "ERRO", 0);
            pedido = se.statusExc(pedido);
        }
        return pedido;
    }
}
