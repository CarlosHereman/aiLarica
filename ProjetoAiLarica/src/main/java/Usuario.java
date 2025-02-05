
import javax.swing.JOptionPane;


public abstract class Usuario {

	private String nome = "";
	private long telefone = 0;
	private String endereco;
        private String email = "";
        private String senha = "";

	// Construtor default
	public Usuario() {
		nome = "";
		telefone = 0;
		endereco = "";
                email = "";
                senha = "";
	}

	// Construtor sobrecarregado
	public Usuario(String nome, long telefone, String endereco, String email, String senha) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
                this.email = email;
                this.senha = senha;
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
        
        public String getEmail() {
            return email;
        }
        
        public String getSenha() {
            return senha;
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
        
        public void setEmail(String email) throws EmailException {
		String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if (email == null || !email.matches(emailRegex)) {
			throw new EmailException();
		}
		this.email = email;
	}
        
        public void setSenha (String senha){
            this.senha = senha;
        }

	// ==================================================================
	public void impDados() {
		JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!", "Cadastro OK", 1);
	}
}
