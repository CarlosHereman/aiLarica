
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public abstract class Produto {
    private int idProd;
    private String nomeProd;
    private double preco;
    private int quantidade;
    private String descricao;

    //private String infoForn = new Fornecedor();
    private String infoForn;

    // Construtor default
    public Produto() {
        idProd = 0;
        nomeProd = "";
        preco = 0;
        quantidade = 0;
        descricao = "";
        // infoForn = new Fornecedor();
        infoForn = "";
    }

    // Construtor sobrecarregado
    public Produto(int idProd, String nomeProd, double preco, int quantidade, String descricao, String infoForn) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.infoForn = infoForn;
    }

    // Getters e Setters
    public int getIdProd() {
        return idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quantidade;
    }

    public String getDesc() {
        return descricao;
    }

    public void setIdProd(String id) {
        this.idProd = Integer.parseInt(id);
    }

    public void setNomeProd(String nome) {
        this.nomeProd = nome;
    }

    public void setPreco(String preco) throws DecimalNumberException {
        if (!preco.matches("^\\d*\\.?\\d+$")) {
            throw new DecimalNumberException();
        }
        this.preco = Double.parseDouble(preco);
    }

    public void setQuant(String quant) throws NumberException {
        if (!quant.matches("\\d+")) {
            throw new NumberException();
        }
        this.quantidade = Integer.parseInt(quant);
    }

    public void setDesc(String desc) {
        this.descricao = desc;
    }

    public String getFornecedor() {
        return infoForn;
    }

    public void setFornecedor(String infoForn) {
        this.infoForn = infoForn;
    }

    // ===============================================================================================================================

    public void impDados() {
        JOptionPane.showMessageDialog(null, "O produto foi cadastrado com sucesso!", "Cadastro OK", 1);
    }
}
