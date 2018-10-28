/*
* @author: Joao Marco Barros - 10315992
* @version: 1.0
* @releaseDate: 10/28/2018
*/
import java.util.ArrayList;
import java.util.Iterator;

public class DicionarioIP extends Dicionario {

    public void mostrarTodo(){
        if (palavras.isEmpty()){ //Aqui testamos para ver se nosso array list de palavras se encontra com conteúdo
            System.out.println("Nenhum registro foi encontrado");
        }
        else{
            int index = 0 ;
            for(String palavra: palavras){ //utilizando o for each, passaremos por todos os elementos do ArrayList Palavras
                String[] sinonimos = significados.get(index).split(" "); // foi criado uma lista simples para guardar os sinonimos separadamente

                ArrayList<String> sinonimoArray = new ArrayList<>();

                for (String sinonimo: sinonimos){ // nesse for each criamos um ArrayList com base nos itens de nossa lista
                    sinonimoArray.add(sinonimo);
                }
                System.out.print(palavras.get(index)+":");

                for (Iterator<String> it = sinonimoArray.iterator(); it.hasNext();) { //como optamos por continuar trabalhando com array list, é possível usar o laço do método ,iterator()
                    System.out.print (it.next());
                    if (it.hasNext()){
                        System.out.print(", "); // caso haja um próximo, usa-se a vírgula
                    }
                    else{
                        System.out.print("."); // caso nao haja, se usa o ponto final
                    }
                }

                System.out.println();
                index++;
            }
        }
    }
}
