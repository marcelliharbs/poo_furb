package exercicio09;

public class Proprietario {
    private String nome, endereco, cpf;

    public Proprietario(String nome, String endereco, String cpf) {
        setNome(nome);
        setEndereco(endereco);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (getNome().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (getNome().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (getNome().trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEndereço: " + getEndereco() + "\nCPF: " + getCpf();
    }

}
