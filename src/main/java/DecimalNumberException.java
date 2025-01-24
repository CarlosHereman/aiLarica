
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class DecimalNumberException extends Exception {

    // Produto - Refeicao
    public Refeicao refeicaoPriceExc(Refeicao refeicao) {
        try {
            String price = JOptionPane.showInputDialog(null, "Informe o novo preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
            refeicao.setPreco(price);
        } catch (DecimalNumberException dne) {
            JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
            refeicao = dne.refeicaoPriceExc(refeicao);
        }
        return refeicao;
    }

    // Produto - Medicamento
    public Medicamento medicamentoPriceExc(Medicamento medicamento) {
        try {
            String price = JOptionPane.showInputDialog(null, "Informe o novo preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
            medicamento.setPreco(price);
        } catch (DecimalNumberException dne) {
            System.out.println("Apenas numeros positivos sao permitidos.");
            medicamento = dne.medicamentoPriceExc(medicamento);
        }
        return medicamento;
    }

    // Produto - Bebida

    public Bebida bebidaPriceExc(Bebida bebida) {
        try {
            String price = JOptionPane.showInputDialog(null, "Informe o novo preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
            bebida.setPreco(price);
        } catch (DecimalNumberException dne) {
            System.out.println("Apenas numeros positivos sao permitidos.");
            bebida = dne.bebidaPriceExc(bebida);
        }
        return bebida;
    }

    public Bebida bebidaVolExc(Bebida bebida) {
        try {
            String vol = JOptionPane.showInputDialog(null, "Informe o novo volume", "Atualização", JOptionPane.QUESTION_MESSAGE);
            bebida.setVolume(vol);
        } catch (DecimalNumberException dne) {
            System.out.println("Apenas numeros positivos sao permitidos.");
            bebida = dne.bebidaVolExc(bebida);
        }
        return bebida;
    }

    // Produto - Mercadoria
    public Mercadoria mercadoriaPriceExce(Mercadoria mercadoria) {
        try {
            String price = JOptionPane.showInputDialog(null, "Informe o novo preço", "Atualização", JOptionPane.QUESTION_MESSAGE);
            mercadoria.setPreco(price);
        } catch (DecimalNumberException dne) {
            JOptionPane.showMessageDialog(null, "O preço deve ser um valor valido!", "ERRO de Preço", 0);
            mercadoria = dne.mercadoriaPriceExce(mercadoria);
        }
        return mercadoria;
    }

}
