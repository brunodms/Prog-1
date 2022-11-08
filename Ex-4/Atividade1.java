import java.util.Scanner;

class acampamento{
    String nome;
    int idade;
    char equipe;

    acampamento(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public void definirEquipe(){
        if(idade>=6 && idade<=10){
            equipe = 'A';
        }else if(idade>=11 && idade<=20){
            equipe = 'B';
        }else if(idade>=21){
            equipe = 'C';
        }
        setEquipe(equipe);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setEquipe(char equipe){
        this.equipe = equipe;
    }
    public char getEquipe(){
        return equipe;
    }
    public String toString(){
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Equipe: " + getEquipe();
    }
};
public class Atividade1{
    public static void main (String[] args){
        acampamento[] A = new acampamento[10]; 
        Scanner receba = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            String nome = receba.nextLine();
            int idade = receba.nextInt();
            receba.nextLine();
            A[i] = new acampamento(nome, idade);
            A[i].definirEquipe();
            System.out.println(A[i]);
        }
        receba.close();
    }
};