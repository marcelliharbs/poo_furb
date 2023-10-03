package exercicio03;

import java.util.HashMap;
import java.util.Scanner;

public class TestePessoa {

    public TestePessoa() {

        HashMap<String, Pessoa> listaDePessoas = new HashMap<String, Pessoa>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.next();
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Digite o CPF da pessoa: ");
            String cpf = sc.next();

            Pessoa p = new Pessoa(nome, cpf);
            if (inserir(cpf, p, listaDePessoas)) {
                System.out.println("Pessoa inserida");
            } else {
                System.out.println("Já existe alguém com esse CPF");
            }

            System.out.print("Digite o nome da pessoa: ");
            nome = sc.next();
            sc.nextLine();
        }

        System.out.println("PESSOAS: ");
        System.out.println(imprimir(listaDePessoas));

        sc.close();

    }

    private boolean inserir(String cpf, Pessoa pessoa, HashMap<String, Pessoa> lista) {
        if (lista.containsKey(pessoa.getCpf())) {
            return false;
        }
        lista.put(pessoa.getCpf(), pessoa);
        return true;
    }

    private String imprimir(HashMap<String, Pessoa> pessoas) {
        String impressao = "";

        for (Pessoa p : pessoas.values()) {
            impressao += p.toString() + "\n";
        }

        return impressao;
    }

    public static void main(String[] args) {
        new TestePessoa();
    }
}
