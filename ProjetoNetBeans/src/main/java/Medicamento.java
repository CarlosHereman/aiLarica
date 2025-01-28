
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Medicamento extends Produto {

	private String principioAtivo;
	private long registroMS;
	private boolean receita;

	// Construtor default
	public Medicamento() {
		principioAtivo = "";
		registroMS = 0;
		receita = false;
	}

	// Construtor sobrecarregado
	public Medicamento(int idProd, String nomeProd, double preco, int quantidade, String descricao, String infoForn,
			String principioAtivo, long registroMS, boolean receita) {
		super(idProd, nomeProd, preco, quantidade, descricao, infoForn);
		this.principioAtivo = principioAtivo;
		this.registroMS = registroMS;
		this.receita = receita;
	}

	// Getters e Setters
	public String getPrincipio() {
		return principioAtivo;
	}

	public long getRegistro() {
		return registroMS;
	}

	public boolean getReceita() {
		return receita;
	}

	public void setPrincipio(String principioAtivo) throws LetterException {
		if (!principioAtivo.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.principioAtivo = principioAtivo;
	}

	public void setRegistro(String registro) throws NumberException {
		if (!registro.matches("\\d+")) {
			throw new NumberException();
		}
		this.registroMS = Long.parseLong(registro);
	}

	public void setReceita(int valor) throws OptionException {
		if (valor == 1) {
			this.receita = true;
		} else if (valor == 2) {
			this.receita = false;
		} else {
			throw new OptionException();
		}
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: MEDICAMENTO", "Cadastro OK", 1);;
	}

}
