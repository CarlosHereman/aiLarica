
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Fornecedor extends Usuario {

	private String categoria;
	private long cnpj;

	// Construtor default
	public Fornecedor() {
		categoria = "";
		cnpj = 0;
	}

	// Construtor sobrecarregado
	public Fornecedor(String nome, long telefone, String endereco, String categoria, long cnpj) {
		super(nome, telefone, endereco);
		this.categoria = categoria;
		this.cnpj = cnpj;
	}

	// Getters e Setters
	public String getCateg() {
		return categoria;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCateg(String categoria) throws LetterException {
		if (!categoria.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.categoria = categoria;
	}

	public void setCnpj(String cnpj){
		this.cnpj = Long.parseLong(cnpj);
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: FORNECEDOR", "Cadastro OK", 1);
	}

}
