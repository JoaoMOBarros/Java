
/*
* @author: Joao Marco Barros - 10315992
* @version: 1.0
* @releaseDate: 10/28/2018
*/

import java.util.ArrayList;

public class BancoDicionario {
    public ArrayList<Dicionario> dicionarios = new ArrayList<>();

    public boolean adicionarDicionario(Dicionario dic){
     if (dicionarios.contains(dic)){
         return false;
     }
     else{
         dicionarios.add(dic);
         return true;
     }
    }

    public void mostrarConteudoDicionarios(){
        int index = 1;
        for (Dicionario dicio: dicionarios){
            System.out.println("Dicionário número " + index);
            dicio.mostrarTodo();
            index++;
            System.out.println();
        }
    }

}
