
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class LetterException extends Exception {

    public void impLetter() {
        JOptionPane.showMessageDialog(null, "Apenas letras são permitidas!", "ERRO", 0);
    }
    
    private String field;
    
    public String getField() {
        return field;
    }

    public Cliente nomeLetterExc(Cliente cliente) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
            cliente.setNome(nome);
        } catch (LetterException le) {
            le.impLetter();
            cliente = le.nomeLetterExc(cliente);
        }
        return cliente;
    }
    
        public Fornecedor nomeLetterExc(Fornecedor fornecedor) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
            fornecedor.setNome(nome);
        } catch (LetterException le) {
            le.impLetter();
            fornecedor = le.nomeLetterExc(fornecedor);
        }
        return fornecedor;
    }

    public Medicamento principioAtivoExc(Medicamento medicamento) {
        try {
            String prin = JOptionPane.showInputDialog(null, "Informe o NOVO principio ativo", "Atualização", JOptionPane.QUESTION_MESSAGE);
            medicamento.setPrincipio(prin);
        } catch (LetterException le) {
            le.impLetter();
            medicamento = le.principioAtivoExc(medicamento);
        }
        return medicamento;
    }

    public Mercadoria setorExc(Mercadoria mercadoria) {
        try {
            String setor = JOptionPane.showInputDialog(null, "Informe o NOVO setor", "Atualização", JOptionPane.QUESTION_MESSAGE);
            mercadoria.setSetor(setor);
        } catch (LetterException le) {
            le.impLetter();
            mercadoria = le.setorExc(mercadoria);
        }
        return mercadoria;
    }

    public Pedido pagamentoExc(Pedido pedido) {
        try {
            String pag = JOptionPane.showInputDialog(null, "Informe o a forma de pagamento:", "Atualização", JOptionPane.QUESTION_MESSAGE);
            pedido.setPagamento(pag);
        } catch (LetterException le) {
            le.impLetter();
            pedido = le.pagamentoExc(pedido);
        }
        return pedido;
    }


}
