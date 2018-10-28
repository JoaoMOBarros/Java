/*
Nome: Joao Marco Oliveira Barros
Nusp: 10351992
Atividade Avaliativa 1

*/

import java.util.Random;

public class Dados {
    private Random gerador = new Random();
    private int valor = gerador.nextInt(6)+1;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

// Toda vez que uma nova rodada for iniaciada, iremos reiniciar os valores dos dados

    public void novoJogada(){
        int num = gerador.nextInt(6)+1;
        setValor(num);
    }
}
