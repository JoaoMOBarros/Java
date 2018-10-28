/*
* @author: Joao Marco Barros - 10315992
* @version: 1.0
* @releaseDate: 10/28/2018
*/

import java.util.ArrayList;

public class Dicionario {

    protected ArrayList<String> palavras = new ArrayList<>();
    protected ArrayList<String> significados = new ArrayList<>();

    protected boolean adicionar(String a, String b){

        if (palavras.contains(a)) {
            return false;
        }
        else{
            palavras.add(a);
            significados.add(b);
            //System.out.println("passou aqui");
            return true;
        }
    }

    protected String buscar(String a){
        if(palavras.contains(a)){
            int num = palavras.indexOf(a);
            return significados.get(num);
        }
        else {
            return "nao encontrado \n";
        }
    }

    protected void mostrarTodo(){
        if (palavras.isEmpty()){
            System.out.println("Nenhum registro foi encontrado");
        }
        else{
            int index = 0 ;
            for(String palavra: palavras){
                System.out.println(palavras.get(index)+":"+significados.get(index));
                index++;
            }
        }
    }
}
