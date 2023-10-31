package trabalhoPratico04;

public class Vilao extends Personagem {
    int tempoDePrisao;

    public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        setTempoDePrisao(tempoDePrisao);
    }

    public int getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(int tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}
