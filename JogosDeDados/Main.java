/*
Nome: Joao Marco Oliveira Barros
Nusp: 10351992
Atividade Avaliativa 1

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador player1 = new Jogador();
        Jogador player2 = new Jogador();
        Scanner scanf = new Scanner(System.in);
        int loopCounter = 0;
        int nRodada = 1;

        System.out.println("Seja bem vindo ao Jogo de Dados 2.0");
        System.out.println("Regras do Jogo:");
        System.out.println("* Encontre 2 jogadores para participar");
        System.out.println("* O vencedor será aquele com maior numero na soma dos dados");
        System.out.println("* O perdedor podera pedir que uma nova rodada se inicie, caso o vencedor aceite");
        System.out.println("* O jogo acaba quando não houver empates e os usuarios nao pedirem uma nova partida");

        System.out.println("Jogador 1, qual seu nome?");
        String nome = scanf.nextLine();
        player1.setNome(nome);

        System.out.println("Jogador 2, qual seu nome?");
        nome = scanf.nextLine();
        player2.setNome(nome);
/*
* Nesse looping ocorrera o jogo em si. Essa laço apenas será quebrado quando
* um jogador posuir mais vitorias que outro, obrigatoriamente.
* */
        while (loopCounter == 0) {
            System.out.println("RODADA " + nRodada + " ESTA COMEÇANDO");
            System.out.println("Os dados de " + player1.getNome() + " foram " + player1.getDado1().getValor()
                    + " e " + player1.getDado2().getValor());
            System.out.println("seu valor total foi: " + player1.getSoma());

            System.out.println();

            System.out.println("Os Dados de " + player2.getNome() + " foram " + player2.getDado1().getValor()
                    + " e " + player2.getDado2().getValor());
            System.out.println("seu valor total foi: " + player2.getSoma());

            player1.novoJogo();
            player2.novoJogo();

            System.out.println();
            System.out.println();

            nRodada++;

            if (player1.getSoma() == player2.getSoma()) {
                System.out.println("A rodada terminou em EMPATE!");
            }

            if (player1.getSoma() > player2.getSoma()) {
                System.out.println("->" + player1.getNome() + " ganhou a rodada");
                player1.vitoria();
            }

            if (player1.getSoma() < player2.getSoma()) {
                System.out.println("->" + player2.getNome() + " ganhou a rodada");
                player2.vitoria();
            }

/*
* Para que seja possível que haja mais partidas, a estrutura condicional a seguir foi implementada para lidar
* com um pedido do jogador com menos vitorias, para continuar jogando. Caso este entre com SIM e o próximo com
* SIM, a proxima rodada ira começar. Caso algum dos dois entre com NAO, o laço será quebrado e teremos o anúncio
* do campeão.
* */
            if (player1.getVitorias() == player2.getVitorias()) {
                System.out.println("Uma nova rodada se iniciará devido ao empate");
            } else {
                if (player1.getVitorias() > player2.getVitorias()) {
                    System.out.println(player2.getNome() + ", voce deseja solicitar uma nova rodada? (entre com SIM ou NAO)");
                    String decisao = scanf.nextLine();
                    if (decisao.equals("SIM")) {
                        System.out.println(player1.getNome() + ", voce aceita o desafio?");
                        String escolha = scanf.nextLine();
                        if (decisao.equals("SIM")) {
                            System.out.println("A Proxima rodada já irá começar!");
                        } else {
                            loopCounter++;
                            break;
                        }
                    } else {
                        loopCounter++;
                        break;
                    }
                } else {
                    System.out.println(player1.getNome() + ", voce deseja solicitar uma nova rodada? (entre com SIM ou NAO)");
                    String decisao = scanf.nextLine();
                    if (decisao.equals("SIM")) {
                        System.out.println(player2.getNome() + ", voce aceita o desafio?");
                        String escolha = scanf.nextLine();
                        if (decisao.equals("SIM")) {
                            System.out.println("A Proxima rodada já irá começar!");
                        } else {
                            loopCounter++;
                            break;
                        }
                    } else {
                        loopCounter++;
                        break;
                    }
                }
                System.out.println(" ");
                System.out.println(" ");
            }

        }

        System.out.println("PLACAR FINAL");
        System.out.println(player1.getNome() + " com " + player1.getVitorias() + "vitorias");
        System.out.println(player2.getNome() + " com " + player2.getVitorias() + "vitorias");

        if (player1.getVitorias() > player2.getVitorias()) {
            System.out.println(player1.getNome() + " Ganhou!");
        }
        else{
            System.out.println(player2.getNome() + " Ganhou!");
        }

    }
}
