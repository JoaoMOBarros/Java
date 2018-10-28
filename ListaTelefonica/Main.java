/*
Nome: Joao Marco Oliveira Barros
Nusp: 10351992
Laboratorio 1 e 2

*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contato> Contatos = new ArrayList();
        Scanner scanf = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            String verificar = scanf.nextLine();

/*
Para usar o metodo de adição, usamos um loop do tipo for-each para poder varer o
array sem necessidade de consultar o seu valor. Para verificar da existência do contato
ou nao, usamos um contator simples que assume estado zero para "não encontrado" e um para
"encontrado"
 */



            if (verificar.equals("adicionar")) {

                String nome = scanf.nextLine();
                String numero = scanf.nextLine();
                int count = 0;

                for (Contato a : Contatos) {
                    if (a.getNome().equals(nome)) {
                        count++;
                       /// System.out.println("here");
                    }
                }
                if (count == 0) {
                    Contato novo = new Contato(nome, numero);
                    Contatos.add(novo);
                } else {
                    System.out.println("ja_existe");
                }
            }

// Para realizar a busca dentro do ArrayList declarado acima, optei por utilizar um ciclo do tipo for-each e usar como chave de procura o nome passad
// Caso a chave inserido fosse encontradam atraves do metodo equals, sera exibido o numero, caso contrario o usuario sera avisada de sua enexistência

            if (verificar.equals("buscar")) {
                String chave = scanf.nextLine();
                int count = 0;
                for (Contato a : Contatos) {
                    if (a.getNome().equals(chave)) {
                        System.out.println(a.getTel());
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("nao existe");
                }
            }

            if (verificar.equals("ncontatos")) {
                System.out.println(Contatos.size());
            }

            if (verificar.equals("todos")) {
                for (Contato a : Contatos)
                    System.out.println(a.getNome() + " " + a.getTel());
            }

            if (verificar.equals("fim")) {
                i++;
            }
        }

    }

}

