
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class TimeException extends Exception {

    public Mercadoria agendaExc(Mercadoria mercadoria) {
        try {
            String agenda = JOptionPane.showInputDialog(null, "Informe o NOVO horario de agendamento", "Atualização", JOptionPane.QUESTION_MESSAGE);
            mercadoria.setAgenda(agenda);
        } catch (TimeException te) {
            JOptionPane.showMessageDialog(null, "Horario invalido, insira no formato HH:mm", "ERRO", 0);
            mercadoria = te.agendaExc(mercadoria);
        }
        return mercadoria;
    }

    public Pedido pedidoHoraExc(Pedido pedido) {
        try {
            String hora = JOptionPane.showInputDialog(null, "Informe o NOVO horario de expedição", "Atualização", JOptionPane.QUESTION_MESSAGE);
            pedido.setHora(hora);
        } catch (TimeException te) {
            JOptionPane.showMessageDialog(null, "Horario invalido, insira no formato HH:mm", "ERRO", 0);
            pedido = te.pedidoHoraExc(pedido);
        }
        return pedido;
    }
}
