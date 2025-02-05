
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Fornecedor extends Usuario {

	private String categoria;
	private String cnpj;

	// Construtor default
	public Fornecedor() {
		categoria = "";
		cnpj = "";
	}

	// Construtor sobrecarregado
	public Fornecedor(String nome, long telefone, String endereco, String categoria, String cnpj, String email, String senha) {
		super(nome, telefone, endereco, email, senha);
		this.categoria = categoria;
		this.cnpj = cnpj;
	}

	// Getters e Setters
	public String getCateg() {
		return categoria;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCateg(String categoria) throws LetterException {
		if (!categoria.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.categoria = categoria;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: FORNECEDOR", "Cadastro OK", 1);
	}

}
