
import javax.swing.JOptionPane;

public class Cliente extends Usuario {

	private String cpf;

	// Construtor default
	public Cliente() {
		cpf = "";
	}

	// Construtor sobrecarregado
	public Cliente(String nome, long telefone, String endereco, String cpf, String email, String senha) {
		super(nome, telefone, endereco, email, senha);
		this.cpf = cpf;
	}

	// Getters e Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}



	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: CLIENTE", "Cadastro OK", 1);
	}

}
