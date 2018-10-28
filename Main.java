/*
* @author: Joao Marco Barros - 10315992
* @version: 1.0
* @releaseDate: 10/28/2018
*/
public class Main {
    public static void main(String[] args) {

        DicionarioSimples dicio = new DicionarioSimples();

        dicio.adicionar("bola","algo que roda loucamente" );
        dicio.adicionar("game","forma de entretenimento digital");
        dicio.adicionar("USP", "Forma rapida de entrar em depressao");

        String busca1 = dicio.buscar("bola");
        String busca2 = dicio.buscar("gato");

        System.out.println(busca1);
        System.out.println(busca2);

        dicio.mostrarTodo();

        System.out.println("A partir daqui o dicionario IP atuara! \n\n\n\n\n");

        DicionarioIP dicio2 = new DicionarioIP();

        dicio2.adicionar("bola","algo que roda loucamente" );
        dicio2.adicionar("game","forma de entretenimento digital");
        dicio2.adicionar("USP", "Forma rapida de entrar em depressao");

        String busca3 = dicio2.buscar("bola");
        String busca4 = dicio2.buscar("gato");

        System.out.println(busca3);
        System.out.println(busca4);

        dicio2.mostrarTodo();


    }
}
