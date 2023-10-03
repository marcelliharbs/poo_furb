package exercicio03;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getCpf() throws IllegalArgumentException {
        if (cpf.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpf();
    }
}
