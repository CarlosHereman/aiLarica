
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Pedido implements Frete {

	private int idPed;
	private String hora;
	private double preco;
	private String status;
	private String formaPagamento;

	//private Cliente infoClient = new Cliente();
	//private Refeicao infoRef = new Refeicao();
	//private Medicamento infoMed = new Medicamento();
    //private Bebida infoBeb = new Bebida();
	//private Mercadoria infoMerc = new Mercadoria();
        private String nomeClient;
        private String endClient;
        private String infoProd;

	// Construtor default
	public Pedido() {
		idPed = 0;
		hora = "";
		preco = 0;
		status = "";
		formaPagamento = "";
		nomeClient = "";
                endClient = "";
		infoProd = "";
	}

	// Construtor sobrecarregado
	public Pedido(int idPed, String hora, double preco, String status, String formaPagamento, String nomeClient,
			String endClient, String infoProd) {
		this.idPed = idPed;
		this.hora = hora;
		this.preco = preco;
		this.status = status;
		this.formaPagamento = formaPagamento;
		this.nomeClient = nomeClient;
		this.endClient = endClient;
		this.infoProd = infoProd;
	}

	// Getters e Setters
	public int getIdPed() {
		return idPed;
	}

	public String getHora() {
		return hora;
	}

	public String getProd() {
            return infoProd;
        }

	public String getStatus() {
		return status;
	}

	public String getPagamento() {
		return formaPagamento;
	}
        
        public double getPreco() {
		return preco;
	}

	public void setIdPed(String id) {
            this.idPed = Integer.parseInt(id);
	}

	public void setHora(String hora) throws TimeException {
		if (hora.matches("\\d{2}:\\d{2}")) {
			this.hora = hora;
		} else {
			throw new TimeException();
		}
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setStatus(String status) throws StatusException {
		if (status.equals("preparando") || status.equals("a caminho") ||
				status.equals("entregue") || status.equals("cancelado")) {
			this.status = status;
		} else {
			throw new StatusException();
		}
	}

	public void setPagamento(String pagamento) throws LetterException {
		if (!status.matches("[a-zA-Z\\s]+")) {
			throw new LetterException();
		}
		this.formaPagamento = pagamento;
	}

	public String getNomeClient() {
		return nomeClient;
	}

	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}
        
        public String getEndClient() {
		return endClient;
	}

	public void setEndClient(String endClient) {
		this.endClient = endClient;
	}

	public void setProd(String infoProd) throws InfoProdException {
		if (infoProd.equals("refeicao") || infoProd.equals("bebida") ||
				infoProd.equals("mercadoria") || infoProd.equals("medicamento")) {
			this.infoProd = infoProd;
		} else {
			throw new InfoProdException();
		}
	}


	// ==================================================================

	public void impDados() {
		System.out.println("\nPEDIDO REGISTRADO!!!");
	}

	// ==================================================================
        
        public void calcularFrete() {
        double valorFrete = 0;
        if (infoProd.equalsIgnoreCase("refeicao")) {
            valorFrete = valorFrete(new Refeicao());
        } else if (infoProd.equalsIgnoreCase("medicamento")) {
            valorFrete = valorFrete(new Medicamento());
        } else if (infoProd.equalsIgnoreCase("bebida")) {
            valorFrete = valorFrete(new Bebida());
        } else if (infoProd.equalsIgnoreCase("mercadoria")) {
            valorFrete = valorFrete(new Mercadoria());
        } else {
            valorFrete = valorFrete(this.preco);
        }
        this.preco += valorFrete; 
    }

        // Sobrecarga
        public double valorFrete(Refeicao refeicao) {
            return 3.00;
        }

        // Sobrecarga
        public double valorFrete(Medicamento medicamento) {
            return 4.00;
        }

        // Sobrecarga
        public double valorFrete(Bebida bebida) {
            return 2.50;
        }

        // Sobrecarga
        public double valorFrete(Mercadoria mercadoria) {
            return 5.00;
        }

        // Sobrecarga para frete base
        public double valorFrete(double preco) {
            return 2.00;
        }

	public void impFrete() {
             JOptionPane.showMessageDialog(null, "Frete adicionado ao preço total.", "FRETE", 1);
        }
}