//Marcelli Harbs e Alexandro Debastiani Brandt
package application;

import entities.Carro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RevendedoraQueryCar {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        Scanner sc = new Scanner(System.in);

        Carro[] carros = new Carro[5];
        Carro carroMaisCaro = null;
        Carro carroMaisCaroLocal = null;
        Carro carroMaisBaratoLocal = null;

        carros[0] = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25.000, 1);
        carros[1] = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30.000, 2);
        carros[2] = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32.000, 3);
        carros[3] = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29.000, 1);
        carros[4] = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26.000, 1);

        System.out.println("Listar os carros mais caros de determinado ano:");

        System.out.print("Digite o ano desejado: ");
        int anoDesejado = sc.nextInt();
        sc.nextLine();
        for (Carro carro : carros) {
            if (carro.getAno() == anoDesejado) {
                if (carroMaisCaro == null || carro.getPreco() > carroMaisCaro.getPreco()) {
                    carroMaisCaro = carro;
                }
            }
        }
        System.out.printf("Carros mais caros do ano %d:%n", anoDesejado);
        System.out.println(carroMaisCaro.imprimirCarro());

        System.out.println("Listar carros de determinada marca por um determinado preço:");
        System.out.print("Digite a marca desejada: ");
        String marcaDesejada = sc.nextLine();
        System.out.print("Digite o preço mínimo: ");
        double precoMin = sc.nextDouble();
        System.out.print("Digite o preço máximo: ");
        double precoMax = sc.nextDouble();

        System.out.printf("Carros da marca %s com valor entre R$%s e R$%s:%n", marcaDesejada, df.format(precoMin), df.format(precoMax));
        for (Carro carro : carros) {
            if (carro.getMarca().equals(marcaDesejada) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax) {
                System.out.println(carro.imprimirCarro());
            }
        }

        System.out.println("Listar carros mais caros e mais baratos de determinado local da revendedora:");
        System.out.print("Digite o local da revendedora desejado: ");
        int localDesejado = sc.nextInt();
        for (Carro carro : carros) {
            if (carro.getLocalizacao() == localDesejado) {
                if(carroMaisCaroLocal == null || carro.getPreco() > carroMaisCaroLocal.getPreco()) {
                    carroMaisCaroLocal = carro;
                }
                if(carroMaisBaratoLocal == null || carro.getPreco() < carroMaisBaratoLocal.getPreco()) {
                    carroMaisBaratoLocal = carro;
                }
            }
        }
        System.out.printf("Carros mais caros da localização %d:%n", localDesejado);
        System.out.println(carroMaisCaroLocal.imprimirCarro());
        System.out.printf("Carros mais baratos da localização %d:%n", localDesejado);
        System.out.println(carroMaisBaratoLocal.imprimirCarro());

        sc.close();
    }
}
