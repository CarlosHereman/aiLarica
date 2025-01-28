
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public abstract class Usuario {

	private String nome = "";
	private long telefone = 0;
	private String endereco;

	// Construtor default
	public Usuario() {
		nome = "";
		telefone = 0;
		endereco = "";
	}

	// Construtor sobrecarregado
	public Usuario(String nome, long telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public long getTel() {
		return telefone;
	}

	public String getEnd() {
		return endereco;
	}

	public void setNome(String nome) throws LetterException {
		if (!nome.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.nome = nome;
	}

	public void setTel(String telefone) throws NumberException {
		if (!telefone.matches("\\d+")) {
			throw new NumberException();
		}
		this.telefone = Long.parseLong(telefone);
	}

	public void setEnd(String endereco) {
		this.endereco = endereco;
	}

	// ==================================================================
	public void impDados() {
		JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!", "Cadastro OK", 1);
	}
}
