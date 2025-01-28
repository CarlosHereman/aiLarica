
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class OptionException extends Exception {

    public Medicamento receitaExc(Medicamento medicamento) {
        try {
            String receita = JOptionPane.showInputDialog(null, "Informe um valor valido", "Autalização", JOptionPane.QUESTION_MESSAGE);
            medicamento.setReceita(Integer.parseInt(receita));
        } catch (OptionException oe) {
            System.out.println("Escolha uma opção válida (1 ou 2).");
            medicamento = oe.receitaExc(medicamento);
        }
        return medicamento;
    }

    public Bebida bebidaExc(Bebida bebida) {
        try {
            String alcool = JOptionPane.showInputDialog(null, "Informe um valor valido", "Autalização", JOptionPane.QUESTION_MESSAGE);
            bebida.setAlcoolica(Integer.parseInt(alcool));
        } catch (OptionException oe) {
            System.out.println("Escolha uma opção válida (1 ou 2).");
            bebida = oe.bebidaExc(bebida);
        }
        return bebida;
    }
}
