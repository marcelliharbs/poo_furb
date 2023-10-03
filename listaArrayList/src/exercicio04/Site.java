package exercicio04;

public class Site {
    private String nomeSite, enderecoIP;
    private boolean status;

    public Site(String nomeSite, String enderecoIP, boolean status) {
        setNomeSite(nomeSite);
        setEnderecoIP(enderecoIP);
        setStatus(status);
    }

    public String getNomeSite() {
        return nomeSite;
    }

    public void setNomeSite(String nomeSite) {
        this.nomeSite = nomeSite;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String impressao = "";
        impressao += "Nome do site: " + getNomeSite() + " IP: " + getEnderecoIP() + " Acesso: ";
        if (isStatus()) {
            impressao += "Permitido";
        } else {
            impressao += "Bloqueado";
        }
        return impressao;
    }

}
