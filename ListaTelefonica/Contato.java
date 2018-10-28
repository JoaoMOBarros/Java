/*
Nome: Joao Marco Oliveira Barros
Nusp: 10351992
Laboratorio 1 e 2

*/

public class Contato {
    private String nome;
    private String tel;

    public Contato(String nom, String te){
        setNome(nom);
        setTel(te);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
