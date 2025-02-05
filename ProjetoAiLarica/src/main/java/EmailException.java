
import javax.swing.JOptionPane;

public class EmailException extends Exception {

    public Cliente emailExc(Cliente cliente) {
        try {
            String email = JOptionPane.showInputDialog(null, "Informe o NOVO e-mail", "Autalização", JOptionPane.QUESTION_MESSAGE);
            cliente.setEmail(email);
        } catch (EmailException ee) {
           JOptionPane.showMessageDialog(null, "O E-mail deve ser válido!", "ERRO de E-mail", 0);
            cliente = ee.emailExc(cliente);
        }
        return cliente;
    }
}
