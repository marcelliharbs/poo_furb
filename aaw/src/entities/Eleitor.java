package entities;

public class Eleitor {
    private String nome;
    private int idade;

    public Eleitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    private String verificar() {
        if (getIdade() < 16) {
            return "Eleitor " + getNome() + " não pode votar";
        } else if (getIdade() >= 16 && getIdade() <= 65) {
            return "Eleitor " + getNome() + " deve votar";
        } else {
            return "Eleitor " + getNome() + " tem o voto facultativo";
        }
    }

    public String imprimir() {
        return verificar();
    }
}
