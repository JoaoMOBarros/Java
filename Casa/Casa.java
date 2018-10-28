/*
Universidade de Sao Paulo - Engenharia de Computação (ICMC/EESC)
NOME Joao Marco Oliveira Barros
Nups 10351992
Exercicio 3
 */

public class Casa {
    private String cor = "branca";
    private int totalDePortas = 0;
    Porta[] portas = new Porta[15];

    public int getTotalDePortas() {
        return totalDePortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public void totalDePortas() {
        System.out.println(totalDePortas);;
    }

    public void adicionarPorta(Porta p) {
        portas[totalDePortas] = p;
        totalDePortas++;
    }

    public void quantasPortasEstaoAbertas() {
        int count = 0;
        for (int i = 0; i < totalDePortas; i++) {
            if (portas[i].getAberto() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
