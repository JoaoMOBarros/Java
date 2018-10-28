import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Fatorial numero = new Fatorial();
        int i = 0;
        System.out.println("Quando quiser finalizar a aplicação, use FIM");
        while (i == 0){
            System.out.println("Entre com um numero qualquer: ");

            String nParaOperacao = scanf.nextLine();

            if(nParaOperacao == "FIM"){break;}
            else{
                Integer entrada = Integer.valueOf(nParaOperacao);
                Integer resultado = numero.iterador(entrada);
                System.out.println("Fatorial de " + entrada + " é "+ resultado);
                System.out.println();
                System.out.println();
            }
        }
    }
}
