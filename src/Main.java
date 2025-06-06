import br.com.monojpe.modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

        System.out.println("Vou commitar agora este, para ver se gera um conflito");
        System.out.println("Vou tentar dar git push");
    }
}
