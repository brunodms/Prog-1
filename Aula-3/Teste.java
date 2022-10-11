import java.util.Scanner;

class Apolice{
    int numApolice;
    String nomeSegurado;
    int Idade;
    float valorPremio; 
    static int ultimoNumApolice;

    Apolice(){
        ultimoNumApolice++;
        numApolice = ultimoNumApolice;
    }
    Apolice(String ns, int idade, float vp){
        ultimoNumApolice++;
        numApolice = ultimoNumApolice;
        nomeSegurado = ns;
        Idade = idade;
        valorPremio = vp;
    }
    void Imprimir(){
        System.out.println("Número: " + numApolice);
        System.out.println("Nome: " +nomeSegurado);
        System.out.println("Idade: " +Idade);
        System.out.println("Premio: " +valorPremio);
    }
    void calcularPremio(){
        if(Idade >= 18 && Idade <= 25){
            valorPremio += (valorPremio * 0.2);
        } else if(Idade > 25 && Idade <= 36){
            valorPremio += (valorPremio * 0.15);
        } else if(Idade > 36){
            valorPremio += (valorPremio * 0.1);
        }
    }
    double oferecerDesconto(String cidade){
        double desconto = 0;
        if(cidade.equals("Florianopolis") == true){
            desconto = valorPremio * 0.05;
        } else if ((cidade.equals("Chapeco") == true)){
            desconto = valorPremio * 0.06;
        } else if ((cidade.equals("Joacaba") == true)){
            desconto = valorPremio * 0.07;
        } else if ((cidade.equals("Joinvile") == true)){
            desconto = valorPremio * 0.08;
        }
        return desconto;
    }
    void exibeUltimoNum(){
        System.out.println(ultimoNumApolice);
    }
};
public class Teste {
    public static void main (String[] args){
        Apolice p1 = new Apolice();
        Scanner receba = new Scanner(System.in);
        p1.nomeSegurado = receba.next();
        p1.Idade =  receba.nextInt();
        p1.valorPremio = receba.nextFloat();
        p1.calcularPremio();
        p1.Imprimir();
        String Cidade1 = receba.next();
        double desconto1 = p1.oferecerDesconto(Cidade1);
        System.out.println(desconto1);
        Apolice p2 = new Apolice(receba.next(), receba.nextInt(), receba.nextFloat());
        p2.calcularPremio();
        p2.Imprimir();
        String Cidade2 = receba.next();
        double desconto2 = p2.oferecerDesconto(Cidade2);
        System.out.println(desconto2);
        p2.exibeUltimoNum();
        receba.close();
        }
};