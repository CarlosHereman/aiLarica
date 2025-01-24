
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Mercadoria extends Produto {

	private String setor;
	private String agenda;

	// Construtor default
	public Mercadoria() {
		setor = "";
		agenda = "";
	}

	// Construtor sobrecarregado
	public Mercadoria(int idProd, String nomeProd, double preco, int quantidade, String descricao, String infoForn,
			String setor, String agenda) {
		super(idProd, nomeProd, preco, quantidade, descricao, infoForn);
		this.setor = setor;
		this.agenda = agenda;
	}

	// Getters e Setters
	public String getSetor() {
		return setor;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setSetor(String setor) throws LetterException {
		if (!setor.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.setor = setor;
	}

	public void setAgenda(String agenda) throws TimeException {
		if (agenda.matches("\\d{2}:\\d{2}")) {
			this.agenda = agenda;
		} else {
			throw new TimeException();
		}
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: MERCADORIA", "Cadastro OK", 1);
	}
}
