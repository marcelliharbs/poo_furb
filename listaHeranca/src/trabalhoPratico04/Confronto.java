package trabalhoPratico04;

public class Confronto {
    public int executar(Superheroi superheroi, Vilao vilao) {
        double poderHeroi = (superheroi.getPoderTotal() * 0.1) + superheroi.getPoderTotal();
        double poderVilao = vilao.getPoderTotal();
        int resultado = 0;

        if (poderHeroi > poderVilao) {
            resultado = 0;
        } else if (poderVilao > poderHeroi) {
            resultado = 1;
        } else if (poderHeroi == poderVilao) {
            resultado = 2;
        }
        return resultado;
    }
}
