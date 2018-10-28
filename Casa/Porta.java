/*
Universidade de Sao Paulo - Engenharia de Computação (ICMC/EESC)
NOME Joao Marco Oliveira Barros
Nups 10351992
Exercicio 3
 */

public class Porta {
    private boolean aberto = false;

    public Porta(boolean type){
        this.aberto = type;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void Abrir (){
        setAberto(true);
    }

    public void Fechar(){
        setAberto(false);
    }
}
