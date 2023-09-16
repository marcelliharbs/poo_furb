package application;

import entities.Computador;

import java.util.ArrayList;

public class Laboratorio {
    public Laboratorio() {
        ArrayList<Computador> computadores = new ArrayList<>();

        adicionarComputador(computadores, new Computador(1, 10, 50));
        adicionarComputador(computadores, new Computador(2, 20, 60));
        adicionarComputador(computadores, new Computador(3, 30, 70));
        adicionarComputador(computadores, new Computador(4, 40, 80));

        System.out.println("SAÍDA 1: ");
        imprimir(computadores);

        adicionarComputador(computadores, new Computador(5, 50, 90));

        System.out.println("SAÍDA 2: ");
        imprimir(computadores);

    }

    private void adicionarComputador(ArrayList<Computador> lista, Computador computador) {
        lista.add(computador);
    }

    private void imprimir(ArrayList<Computador> lista) {
        int totalMemoria = 0;
        for (Computador c: lista) {
            System.out.println(c.toString());
            totalMemoria += c.getQntdMemoria();
        }
        System.out.println("Total de memória: " + totalMemoria);
    }

    public static void main(String[] args) {
        new Laboratorio();
    }
}
