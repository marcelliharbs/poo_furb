package exercicio03;

public class Lutador extends Atleta {
    public Lutador(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    public String definirCategoria() {
        String str = "";
        if (super.peso <= 54) {
            str += "Categoria Pluma";
        } else if (super.peso > 54 && super.peso <= 60) {
            str += "Categoria Leve";
        } else if (super.peso > 60 && super.peso <= 75) {
            str += "Categoria Meio-leve";
        } else if (super.peso > 75) {
            str += "Categoria pesado";
        }
        return str;
    }
}
