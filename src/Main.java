import br.com.monojpe.modelos.Pessoa;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("João Pedro", 25);
        Pessoa pessoa2 = new Pessoa("João", 30);
        Pessoa pessoa3 = new Pessoa("Pedro", 28);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Nome da primeira pessoa: " + listaDePessoas.get(0));

        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
        }
    }
}