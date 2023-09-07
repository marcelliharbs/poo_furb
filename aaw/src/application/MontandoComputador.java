package application;

import entities.ModeloDeComputador;

import java.util.Scanner;

public class MontandoComputador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção de processador desejado(1.67, 2.23 ou 2.56): ");
        double processador = sc.nextDouble();
        System.out.println("Digite a opção de memória desejada(2, 4, 6 ou 8): ");
        int memoria = sc.nextInt();
        System.out.println("Digite a opção de disco rígido desejado(320, 500 ou 750): ");
        int discoRigido = sc.nextInt();
        System.out.println("Digite a opção de monitor desejado(19 ou 21): ");
        int monitor = sc.nextInt();

        ModeloDeComputador pc = new ModeloDeComputador(processador, memoria, discoRigido, monitor);
        System.out.printf("O valor total do computador: R$%.2f%n", pc.calculaPreco());
    }
}
