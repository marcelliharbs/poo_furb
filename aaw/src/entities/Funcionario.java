package entities;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double imposto = 0;
        if (getSalario() <= 1903.98) {
            return imposto;
        } else if (getSalario() > 1903.98 && getSalario() <= 2826.65) {
            return imposto = (getSalario() - 1903.98) * 0.075;
        } else if (getSalario() > 2826.65 && getSalario() < 3751.05) {
            return imposto = 69.20 + ((getSalario() - 2826.65) * 0.15);
        } else if (getSalario() > 3751.05 && getSalario() <= 4664.68) {
            return imposto = 69.20 + 138.66 + ((getSalario() - 3752.05) * 0.225);
        } else {
            return imposto = 69.20 + 138.66 + 205.57 + ((getSalario() - 4664.68) * 0.275);
        }
    }

    public String imprimir() {
        if (calcularIrpf() == 0) {
            return "O funcionário " + getNome() + " que recebe R$" + String.format("%.2f", getSalario()) + " está isento de pagar impostos.";
        } else {
            return "O funcionário " + getNome() + " que recebe R$" + String.format("%.2f", getSalario()) + " deve pagar R$" + String.format("%.2f", calcularIrpf()) + " de impostos.";
        }
    }
}
