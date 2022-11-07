import java.util.Scanner;

class acampamento{
    String nome;
    int idade;
    char equipe;

    public void Acampamento(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public void definirEquipe(){
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
        getIdade();
        if(idade<=6 && idade>=10){
            equipe = 'A';
        }else if(idade<=11 && idade>=20){
            equipe = 'B';
        }else if(idade<=21){
            equipe = 'C';
        }
        this.equipe = equipe;
    }
    public char getEquipe(){
        return equipe;
    }
    public String toString(){
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Equipe = " + this.equipe;
    }
};
public class Ex4 {
    public static void main (String[] args){
        acampamento[] A = new acampamento[10]; 
        for (int i = 0; i < 10; i++){
            A[i] = new acampamento();
            Scanner receba = new Scanner(System.in);
            A[i].nome = receba.nextLine();
            A[i].idade = receba.nextInt();
            A[i].Acampamento(A[i].nome, A[i].idade);
            A[i].setEquipe(A[i].equipe);
            A[i].toString();
            receba.close();
        }
    }
};