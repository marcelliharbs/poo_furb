package exercicio09;

public class Veiculo {
    private String placa;
    private Proprietario umProprietario;

    public Veiculo(String placa, Proprietario umProprietario) {
        setPlaca(placa);
        setUmProprietario(umProprietario);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Proprietario getUmProprietario() {
        return umProprietario;
    }

    public void setUmProprietario(Proprietario umProprietario) {
        this.umProprietario = umProprietario;
    }

    public String toString() {

    }
}
