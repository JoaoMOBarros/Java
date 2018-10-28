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

        DicionarioIP dicio2 = new DicionarioIP();

        dicio2.adicionar("balao","algo que voa por ai" );
        dicio2.adicionar("caderno","local para fazer anotacoes");
        dicio2.adicionar("MIT", "Forma rapida de virar o Tony Stark");

        BancoDicionario colecao = new BancoDicionario();

        colecao.adicionarDicionario(dicio);
        colecao.adicionarDicionario(dicio2);

        colecao.mostrarConteudoDicionarios();


    }
}
