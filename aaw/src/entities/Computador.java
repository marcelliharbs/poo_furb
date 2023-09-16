package entities;

public class Computador {
    private int numSerial;
    private int capacidadeHD;
    private int qntdMemoria;

    public Computador(int numSerial, int capacidadeHD, int qntdMemoria) {
        setNumSerial(numSerial);
        setCapacidadeHD(capacidadeHD);
        setQntdMemoria(qntdMemoria);
    }

    public int getNumSerial() {
        return numSerial;
    }

    public void setNumSerial(int numSerial) throws IllegalArgumentException {
        if (numSerial < 0) {
            throw new IllegalArgumentException();
        }
        this.numSerial = numSerial;
    }

    public int getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(int capacidadeHD) throws IllegalArgumentException {
        if (capacidadeHD < 0) {
            throw new IllegalArgumentException();
        }
        this.capacidadeHD = capacidadeHD;
    }

    public int getQntdMemoria() {
        return qntdMemoria;
    }

    public void setQntdMemoria(int qntdMemoria) throws IllegalArgumentException {
        if (qntdMemoria < 0) {
            throw new IllegalArgumentException();
        }
        this.qntdMemoria = qntdMemoria;
    }

    public String toString() {
        return "Dados: " + getCapacidadeHD() + " - " + getQntdMemoria() + "(SERIAL " + getNumSerial() + ")";
    }
}
