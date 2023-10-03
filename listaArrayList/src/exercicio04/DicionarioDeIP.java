package exercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class DicionarioDeIP {

    public DicionarioDeIP() {

        HashMap<String, Site> listaDeSites = new HashMap<String, Site>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o endereço do site: ");
        String endereco = sc.next();
        while(!endereco.equalsIgnoreCase("fim")) {
            System.out.print("Digite o IP do site: ");
            String ip = sc.next();

            System.out.print("Digite o status (true/false): ");
            boolean status = sc.nextBoolean();

            Site s = new Site(endereco, ip, status);
            if (inserirSite(s, listaDeSites)) {
                System.out.println("Site inserido");
            } else {
                System.out.println("Já existe site com esse nome");
            }

            System.out.print("Digite o endereço do site: ");
            endereco = sc.next();
            sc.nextLine();
        }

        System.out.println("SITES: ");
        System.out.println(imprimirSite(listaDeSites));

    }

    private String imprimirSite(HashMap<String, Site> sites) {
        String impressao = "";

        for (Site s : sites.values()) {
            impressao += s.toString() + "\n";
        }
        return impressao;
    }

    private boolean inserirSite(Site site, HashMap lista) {
        if (lista.containsKey(site.getNomeSite())) {
            return false;
        }
        lista.put(site.getNomeSite(), site);
        return true;
    }

    private String acessarSite(String nomeSite, HashMap<String, Site> lista) {
        if (lista.get(nomeSite).isStatus()) {
            return "Site: " + nomeSite + " IP: " + lista.get(nomeSite).getEnderecoIP();
        }
        return "Site bloqueado";
    }

    public static void main(String[] args) {
        new DicionarioDeIP();
    }
}
