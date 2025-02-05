// Nome: Abner do Nascimento Santos - RA: 2504154
import javax.swing.JOptionPane;

public class NumberException extends Exception {

    // Usuario
    public Cliente clienteTelefoneExc(Cliente cliente) {
        try {
            String tel = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
            cliente.setTel(tel);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "O Telefone deve ser inteiro!", "ERRO de Telefone", 0);
            cliente = ne.clienteTelefoneExc(cliente);
        }
        return cliente;
    }

    public Fornecedor fornecedorTelefoneExc(Fornecedor fornecedor) {
        try {
            String tel = JOptionPane.showInputDialog(null, "Informe o NOVO telefone", "Atualização", JOptionPane.QUESTION_MESSAGE);
            fornecedor.setTel(tel);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "O Telefone deve ser inteiro!", "ERRO de Telefone", 0);
            fornecedor = ne.fornecedorTelefoneExc(fornecedor);
        }
        return fornecedor;
    }
   

    /* Produto - Refeicao
    public Refeicao refeicaoQuantNumberExc(Refeicao refeicao) {
        try {
            String quant = JOptionPane.showInputDialog(null, "Informe a nova quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
            refeicao.setQuant(quant);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "A quantidade deve ser um numero inteiro!", "ERRO de Quantidade", 0);
            refeicao = ne.refeicaoQuantNumberExc(refeicao);
        }
        return refeicao;
    }

    public Refeicao refeicaoTempoNumberExc(Refeicao refeicao) {
        try {
            String tempo = JOptionPane.showInputDialog(null, "Informe o tempo", "Atualização", JOptionPane.QUESTION_MESSAGE);
            refeicao.setTempo(tempo);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "O tempo deve ser um inteiro!", "ERRO de inserção", 0);
            refeicao = ne.refeicaoTempoNumberExc(refeicao);
        }
        return refeicao;
    }

    // Produto - Medicamento
    public Medicamento medicamentoQuantNumberExc(Medicamento medicamento) {
        try {
             String quant = JOptionPane.showInputDialog(null, "Informe a nova quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
            medicamento.setQuant(quant);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "Apenas numeros positivos sao permitidos", "ERRO", 0);
            medicamento = ne.medicamentoQuantNumberExc(medicamento);
        }
        return medicamento;
    }

    public Medicamento medicamentoRegistroNumberExc(Medicamento medicamento) {
        try {
            String reg = JOptionPane.showInputDialog(null, "Informe o novo registro", "Atualização", JOptionPane.QUESTION_MESSAGE);
            medicamento.setRegistro(reg);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "Apenas numeros positivos sao permitidos", "ERRO", 0);
            medicamento = ne.medicamentoRegistroNumberExc(medicamento);
        }
        return medicamento;
    }


    // Produto - Mercadoria
    public Mercadoria mercadoriaQuantNumberExc(Mercadoria mercadoria) {
        try {
            String quant = JOptionPane.showInputDialog(null, "Informe a nova quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE);
            mercadoria.setQuant(quant);
        } catch (NumberException ne) {
            JOptionPane.showMessageDialog(null, "Apenas numeros positivos sao permitidos", "ERRO", 0);
            mercadoria = ne.mercadoriaQuantNumberExc(mercadoria);
        }
        return mercadoria;
    }*/

}
