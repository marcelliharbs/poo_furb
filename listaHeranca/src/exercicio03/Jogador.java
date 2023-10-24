package exercicio03;

public class Jogador extends Atleta {
    public Jogador(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    public String definirCategoria() {
        String str = "";
        if (super.idade <= 16) {
            str += "Categoria Infantil";
        } else if (super.idade > 16 && super.idade <= 18) {
            str += "Categoria Juvenil";
        } else {
            str += "Categoria Adulto";
        }
        return str;
    }
}
