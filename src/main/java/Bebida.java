
import javax.swing.JOptionPane;

// Nome: Abner do Nascimento Santos - RA: 2504154

public class Bebida extends Produto {

    private float volume;
    private boolean alcoolica;

    // Construtor default
    public Bebida() {
        volume = 0;
        alcoolica = false;
    }

    // Construtor sobrecarregado
    public Bebida(int idProd, String nomeProd, double preco, int quantidade, String descricao, String infoForn,
            float volume, boolean alcoolica) {
        super(idProd, nomeProd, preco, quantidade, descricao, infoForn);
        this.volume = volume;
        this.alcoolica = alcoolica;
    }

    // Getters e Setters
    public float getVolume() {
        return volume;
    }

    public boolean getAlcoolica() {
        return alcoolica;
    }

    public void setVolume(String volume) throws DecimalNumberException {
        if (!volume.matches("^\\d*\\.?\\d+$")) {
            throw new DecimalNumberException();
        }
        this.volume = Float.parseFloat(volume);
    }

    public void setAlcoolica(int valor) throws OptionException {
        if (valor == 1) {
            this.alcoolica = true;
        } else if (valor == 2) {
            this.alcoolica = false;
        } else {
            throw new OptionException();
        }
    }

    // Sobrescrita
    public void impDados() {
        super.impDados();
        JOptionPane.showMessageDialog(null, "Tipo: BEBIDA", "Cadastro OK", 1);
    }

}
