
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Cliente extends Usuario {

	private long cpf;
	private String email;

	// Construtor default
	public Cliente() {
		cpf = 0;
		email = "";
	}

	// Construtor sobrecarregado
	public Cliente(String nome, long telefone, String endereco, long cpf, String email) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
		this.email = email;
	}

	// Getters e Setters
	public long getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setCpf(String cpf){
		this.cpf = Long.parseLong(cpf);
	}

	public void setEmail(String email) throws EmailException {
		String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if (email == null || !email.matches(emailRegex)) {
			throw new EmailException();
		}
		this.email = email;
	}

	// Sobrescrita
	public void impDados() {
		super.impDados();
		JOptionPane.showMessageDialog(null, "Tipo: CLIENTE", "Cadastro OK", 1);
	}

}
