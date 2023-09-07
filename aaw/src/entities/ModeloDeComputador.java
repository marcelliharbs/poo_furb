package entities;

public class ModeloDeComputador {
    private double processador;
    private int memoria, discoRigido, monitor;

    public ModeloDeComputador(double processador, int memoria, int discoRigido, int monitor) {
        this.processador = processador;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
        this.monitor = monitor;
    }

    public double getProcessador() {
        return processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getDiscoRigido() {
        return discoRigido;
    }

    public int getMonitor() {
        return monitor;
    }

    public double calculaPreco() {
        double valor = 800;

        //processador
        if (getProcessador() == 1.67) {
            valor = valor + 700;
        } else if (getProcessador() == 2.23) {
            valor = valor + 830;
        } else if (getProcessador() == 2.56){
            valor = valor + 910;
        } else {
            throw new IllegalArgumentException("Entrada incorreta");
        }

        //memoria
        if (getMemoria() > 1 && getMemoria() <= 8) {
            for (int i = 0; i < getMemoria(); i++) {
            valor = valor + 175;
            }
        } else {
            throw new IllegalArgumentException("Entrada incorreta");
        }

        //disco rigido
        if (getDiscoRigido() == 320) {
            valor = valor + 300;
        } else if (getDiscoRigido() == 500) {
            valor = valor + 420;
        } else if (getDiscoRigido() == 750){
            valor = valor + 500;
        } else {
            throw new IllegalArgumentException("Entrada incorreta");
        }

        //monitor
        if (getMonitor() == 19) {
            valor = valor + 320;
        } else if (getMonitor() == 21) {
            valor = valor + 520;
        } else {
            throw new IllegalArgumentException("Entrada incorreta");
        }

        return valor;
    }
}
