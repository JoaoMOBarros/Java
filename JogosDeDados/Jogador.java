/*
Nome: Joao Marco Oliveira Barros
Nusp: 10351992
Atividade Avaliativa 1

*/

public class Jogador {
    private String nome;
    private int vitorias = 0;
    private Dados dado1 = new Dados();
    private Dados dado2 = new Dados();

    private  int soma = dado1.getValor() + dado2.getValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setSoma(int soma) {
        this.soma = soma;
    }

    public int getSoma() {
        return soma;
    }

    public Dados getDado1() {
        return dado1;
    }

    public Dados getDado2() {
        return dado2;
    }
//Toda vez que uma nova rodada começar, iremos atualizar os valores dos dados
    public void novoJogo(){
        dado1.novoJogada();
        dado2.novoJogada();
        int novaSoma = dado1.getValor()+dado2.getValor();
        setSoma(novaSoma);
    }

    public void vitoria(){
        int placar = getVitorias()+1;
        setVitorias(placar);
    }
}
