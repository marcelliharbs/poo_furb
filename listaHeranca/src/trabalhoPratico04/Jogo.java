package trabalhoPratico04;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Superheroi> listaSuperheroi = new ArrayList<>();
        ArrayList<Vilao> listaViloes = new ArrayList<>();

        SuperPoder anteninhasDeVinil = new SuperPoder("Anteninhas de Vinil", 4);
        SuperPoder marretaBionica = new SuperPoder("Marreta Bionica", 5);
        SuperPoder cornetaParalisadora = new SuperPoder("Corneta Paralisadora", 5);
        SuperPoder pastilhasEncolhedoras = new SuperPoder("Pastilhas Encolhedoras", 4);
        SuperPoder soltarTeia = new SuperPoder("Teias", 3);
        SuperPoder andarEmParedes = new SuperPoder("Andar em paredes", 2);
        SuperPoder voar = new SuperPoder("Voo", 3);
        SuperPoder superForca = new SuperPoder("Super-Força", 5);
        SuperPoder visaoRaioX = new SuperPoder("Visão raio X", 4);
        SuperPoder soproCongelante = new SuperPoder("Sopro Congelante", 4);
        SuperPoder superSoldado = new SuperPoder("Super soldado", 3);
        SuperPoder escudo = new SuperPoder("Escudo", 3);
        SuperPoder velocidade = new SuperPoder("Velocidade", 5);
        SuperPoder anelMagico = new SuperPoder("Anel Mágico", 5);
        SuperPoder armadura = new SuperPoder("armadura", 4);
        SuperPoder dispositivosEletronicos = new SuperPoder("Dispositivos Eletronicos", 2);
        SuperPoder menteAgucada = new SuperPoder("Mente Aguçada", 5);
        SuperPoder tentaculosIndestrutiveis = new SuperPoder("Tentáculos Indestrutiveis", 5);

        Superheroi homemAranha = new Superheroi("Homem-Aranha", "Peter Parker");
        homemAranha.adicionaSuperpoder(soltarTeia);
        homemAranha.adicionaSuperpoder(andarEmParedes);
        listaSuperheroi.add(homemAranha);

        Superheroi superHomem = new Superheroi("Super-Homem", "Clark Kent");
        superHomem.adicionaSuperpoder(voar);
        superHomem.adicionaSuperpoder(superForca);
        superHomem.adicionaSuperpoder(visaoRaioX);
        superHomem.adicionaSuperpoder(soproCongelante);
        listaSuperheroi.add(superHomem);

        Superheroi capitaoAmerica = new Superheroi("Capitão America", "Steve Rogers");
        capitaoAmerica.adicionaSuperpoder(superSoldado);
        capitaoAmerica.adicionaSuperpoder(escudo);
        listaSuperheroi.add(capitaoAmerica);

        Superheroi lanternaVerde = new Superheroi("Lanterna Verde", "Hal Jordan");
        lanternaVerde.adicionaSuperpoder(anelMagico);
        listaSuperheroi.add(lanternaVerde);

        Superheroi flash = new Superheroi("Flash", "Barry Allen");
        flash.adicionaSuperpoder(velocidade);
        listaSuperheroi.add(flash);

        Superheroi chapolinColorado = new Superheroi("Chapolin Colorado", "Chapolin");
        chapolinColorado.adicionaSuperpoder(marretaBionica);
        chapolinColorado.adicionaSuperpoder(anteninhasDeVinil);
        chapolinColorado.adicionaSuperpoder(cornetaParalisadora);
        chapolinColorado.adicionaSuperpoder(pastilhasEncolhedoras);
        listaSuperheroi.add(chapolinColorado);

        Vilao drOctopus = new Vilao("Dr. Octopus", "Otto Octavius", 6);
        drOctopus.adicionaSuperpoder(tentaculosIndestrutiveis);
        drOctopus.adicionaSuperpoder(velocidade);
        listaViloes.add(drOctopus);

        Vilao duendeVerde = new Vilao("Duende Verde", "Norman Osbourne", 3);
        duendeVerde.adicionaSuperpoder(superForca);
        drOctopus.adicionaSuperpoder(dispositivosEletronicos);
        listaViloes.add(duendeVerde);

        Vilao lex = new Vilao("Lex Luthor", "Lex Luthor", 15);
        lex.adicionaSuperpoder(menteAgucada);
        listaViloes.add(lex);

        Vilao bizarro = new Vilao("Bizarro", "Bizarro", 0);
        bizarro.adicionaSuperpoder(voar);
        bizarro.adicionaSuperpoder(superForca);
        bizarro.adicionaSuperpoder(visaoRaioX);
        bizarro.adicionaSuperpoder(soproCongelante);
        listaViloes.add(bizarro);

        System.out.println("Escolha o herói: ");
        for (int i = 0; i < listaSuperheroi.size(); i++) {
            System.out.println((i + 1) + " - " + listaSuperheroi.get(i).getNome());
        }
        int escolhaHeroi = sc.nextInt();
        Superheroi heroiEscolhido = listaSuperheroi.get(escolhaHeroi - 1);

        System.out.println("Escolha o vilão: ");
        for (int i = 0; i < listaViloes.size(); i++) {
            System.out.println((i + 1) + " - " + listaViloes.get(i).getNome());
        }
        int escolhaVilao = sc.nextInt();
        Vilao vilaoEscolhido = listaViloes.get(escolhaVilao - 1);

        int resultadoConfronto = new Confronto().executar(heroiEscolhido, vilaoEscolhido);

        if (resultadoConfronto == 0) {
            System.out.println(heroiEscolhido.getNome() + " venceu!");
        } else if (resultadoConfronto == 1) {
            System.out.println(vilaoEscolhido.getNome() + " venceu!");
        } else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}
