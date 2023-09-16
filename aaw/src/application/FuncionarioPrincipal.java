//Marcelli Rita Harbs
package application;

import entities.Funcionario;

import java.util.Scanner;

public class FuncionarioPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "° funcionário: ");
            String nome = sc.nextLine();

            System.out.print("Digite o salário do " + (i + 1)+ "° funcionário: R$");
            double salario = sc.nextDouble();
            sc.nextLine();

            funcionarios[i] = new Funcionario(nome, salario);
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.imprimir());
        }

        double maiorIrpf = -1;
        for (Funcionario funcionario : funcionarios) {
            double irpf = funcionario.calcularIrpf();
            if (irpf > maiorIrpf) {
                maiorIrpf = irpf;
            }
        }

        System.out.println("Funcionário(s) com maior IRPF:");

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.calcularIrpf() == maiorIrpf) {
                System.out.println(funcionario.imprimir());
            }
        }

    }
}
