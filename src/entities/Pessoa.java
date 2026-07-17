package entities;

public class Pessoa {

    private String nome;
    private int idade;
    private double renda;


    public Pessoa(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;

    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public boolean podeAlugar(double valorAluguel) {
       return renda >= valorAluguel * 3;

    }

    public String toString(){
        return "Nome = " + nome  + " \n"
        +" Idade = " + idade +  "\n"
         + "Renda = " + String.format("%.2f",renda);

    }
}




