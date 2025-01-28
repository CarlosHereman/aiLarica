
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Refeicao extends Produto {

	private int tempoPreparo;
	private String ingredientes;
	private String acompanhamento;

	// Construtor default
	public Refeicao() {
		tempoPreparo = 0;
		ingredientes = "";
		acompanhamento = "";
	}

	// Construtor sobrecarregado
	public Refeicao(int idProd, String nomeProd, double preco, int quantidade, String descricao, String infoForn,
			int tempoPreparo, String ingredientes, String acompanhamento) {
		super(idProd, nomeProd, preco, quantidade, descricao, infoForn);
		this.tempoPreparo = tempoPreparo;
		this.ingredientes = ingredientes;
		this.acompanhamento = acompanhamento;
	}

	// Getters e Setters
	public int getTempo() {
		return tempoPreparo;
	}

	public String getIngred() {
		return ingredientes;
	}

	public String getAcomp() {
		return acompanhamento;
	}

	public void setTempo(String tempo) throws NumberException {
		if (!tempo.matches("\\d+")) {
			throw new NumberException();
		}
		this.tempoPreparo = Integer.parseInt(tempo);
	}

	public void setIngred(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void setAcomp(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: REFEICAO", "Cadastro OK", 1);
	}

}
