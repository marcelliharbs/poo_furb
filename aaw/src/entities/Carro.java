package entities;

import java.util.Scanner;

public class Carro {

    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private int localizacao;

    public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public String imprimirCarro() {
        return "Modelo: " + modelo + "; Marca: " + marca + "; Placa: " + placa + "; Cor: " + cor + "; Ano: " + ano + "; Preço: " + String.format("%.4f", preco) + "; Localização: " + localizacao;
    }

}
