package trabalhoPratico04;

import java.util.ArrayList;

public class Personagem {
    String nome, nomeVidaReal;
    SuperPoder[] superpoderes;
    int numSuperpoder;

    public Personagem(String nome, String nomeVidaReal) {
        setNome(nome);
        setNomeVidaReal(nomeVidaReal);
        this.superpoderes = new SuperPoder[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public SuperPoder[] getSuperpoder() {
        return superpoderes;
    }

    public void setSuperpoder(SuperPoder[] superpoder) {
        this.superpoderes = superpoder;
    }

    public int getNumSuperpoder() {
        return numSuperpoder;
    }

    public void setNumSuperpoder(int numSuperpoder) {
        this.numSuperpoder = numSuperpoder;
    }

    public void adicionaSuperpoder(SuperPoder sp) {
        if (numSuperpoder < 5) {
            superpoderes[numSuperpoder] = sp;
            numSuperpoder++;
        }
    }

    public int getPoderTotal() {
        int poderTotal = 0;
        for (int i = 0; i < numSuperpoder; i++) {
            poderTotal += superpoderes[i].categoria;
        }
        return poderTotal;
    }

}
