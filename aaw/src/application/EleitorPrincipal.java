package application;

import entities.Eleitor;

import java.util.Scanner;

public class EleitorPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do eleitor: ");
        String nomeEleitor = sc.nextLine();
        System.out.print("Idade do eleitor: ");
        int idadeEleitor = sc.nextInt();

        Eleitor umEleitor = new Eleitor(nomeEleitor, idadeEleitor);

        System.out.println(umEleitor.imprimir());

        sc.close();
    }
}
