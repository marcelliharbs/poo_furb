package exercicio03;

public abstract class Atleta {
    protected String nome;
    protected double peso;
    protected int idade;

    public Atleta(String nome, double peso, int idade) {
        setNome(nome);
        setPeso(peso);
        setIdade(idade);
    }

    public String getNome() throws IllegalArgumentException {
        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws IllegalArgumentException {
        if (peso <= 0) {
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade <= 0) {
            throw new IllegalArgumentException();
        }
        this.idade = idade;
    }

    public abstract String definirCategoria();
}
