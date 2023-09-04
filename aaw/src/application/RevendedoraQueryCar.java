package application;

import entities.Carro;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RevendedoraQueryCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25.000, 1));
        carros.add(new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30.000, 2));
        carros.add(new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32.000, 3));
        carros.add(new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29.000, 1));
        carros.add(new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26.000, 1));

        //encontra carros mais caros de determinado ano
        System.out.print("Digite o ano desejado: ");
        int anoDesejado = sc.nextInt();
        sc.nextLine();
        double maxPreco = Double.MIN_VALUE;
        for (Carro carro : carros) {
            if (carro.getAno() == anoDesejado && carro.getPreco() > maxPreco) {
                maxPreco = carro.getPreco();
            }
        }
        System.out.println("Carros mais caros do ano " + anoDesejado + ":");
        for (Carro carro : carros) {
            if(carro.getAno() == anoDesejado && carro.getPreco() == maxPreco) {
                System.out.println(carro.imprimirCarro());
            }
        }

        //encontra carros de determinada marca por um determinado preço
        System.out.print("Digite a marca desejada: ");
        String marcaDesejada = sc.nextLine();
        System.out.print("Digite o preço mínimo: ");
        double precoMin = sc.nextDouble();
        System.out.print("Digite o preço máximo: ");
        double precoMax = sc.nextDouble();
        System.out.println("Carros da marca " + marcaDesejada + " com preço entre " + precoMin + " e " + precoMax + ":");
        for (Carro carro : carros) {
            if (carro.getMarca().equalsIgnoreCase(marcaDesejada) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax ) {
                System.out.println(carro.imprimirCarro());
            }
        }

        //encontra o carro mais barato e o carro mais caro de determinado local
        System.out.print("Digite o local da revendedora desejado: ");
        int localDesejado = sc.nextInt();
        double precoMinLocal = Double.MAX_VALUE;
        double precoMaxLocal = Double.MIN_VALUE;
        for (Carro carro : carros) {
            if(carro.getLocalizacao() == localDesejado) {
                if(carro.getPreco() < precoMinLocal) {
                    precoMinLocal = carro.getPreco();
                }
                if(carro.getPreco() > precoMaxLocal) {
                    precoMaxLocal = carro.getPreco();
                }
            }
        }
        System.out.println("Carro mais barato no local " + localDesejado + ":");
        for (Carro carro : carros) {
            if (carro.getLocalizacao() == localDesejado && carro.getPreco() == precoMinLocal) {
                System.out.println(carro.imprimirCarro());
            }
        }
        System.out.println("Carro mais caro no local " + localDesejado + ":");
        for (Carro carro : carros) {
            if (carro.getLocalizacao() == localDesejado && carro.getPreco() == precoMaxLocal) {
                System.out.println(carro.imprimirCarro());
            }
        }
        sc.close();
    }
}
