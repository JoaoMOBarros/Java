/*
Universidade de Sao Paulo - Engenharia de Computação (ICMC/EESC)
NOME Joao Marco Oliveira Barros
Nups 10351992
Exercicio 3
 */

public class Main{
    public static void main(String[] args)
    {
        Casa doYaya = new Casa();
        doYaya.pinta("Azul Marinho");
        Porta num1 = new Porta(true);
        Porta num2 = new Porta(false);
        Porta num3 = new Porta(true);

        doYaya.adicionarPorta(num1);
        doYaya.adicionarPorta(num2);
        doYaya.adicionarPorta(num3);

        doYaya.totalDePortas();
        doYaya.quantasPortasEstaoAbertas();
    }
}
