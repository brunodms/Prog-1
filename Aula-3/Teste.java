import java.util.Scanner;

class Apolice{
    int numApolice;
    String nomeSegurado;
    int idade;
    float valorPremio; 
    static int ultimoNumApolice;
    String cidade;     

    /*public void apolice(){
        numApolice++;
        ultimoNumApolice = numApolice;  
    }*/

    void apolice(String nomesegurado, int idade, float valorpremio){
        ultimoNumApolice++;
        numApolice = ultimoNumApolice;
        nomeSegurado = nomesegurado; 
        valorPremio = valorpremio;  
    }   

    void imprimir(){
        for(numApolice=0; numApolice<ultimoNumApolice; numApolice++){
            System.out.println(numApolice);
            System.out.println(nomeSegurado);
            System.out.println(idade);
            System.out.println(valorPremio);
        }
    }

    void calcularPremio(){
        if(idade >= 18 && idade <= 25){
            valorPremio*= 0.2;
        } else if (idade > 25 && idade <= 36){
            valorPremio*= 0.15; 
        } else if (idade > 36) { 
            valorPremio*=0.1; 
        }
    }

    void oferecerDesconto(String cidade){
        if(cidade.equals("Florianópolis") == true){
            valorPremio*= 0.95;
        } else if ((cidade.equals("Chapecó") == true)){
            valorPremio*= 0.94;
        } else if ((cidade.equals("Joaçaba") == true)){
            valorPremio*= 0.93;
        } else if ((cidade.equals("Joinvile") == true)){
            valorPremio*= 0.92;
        }
    }

    void exibeUltimoNum(){
        System.out.println(""+ultimoNumApolice);
    }
};

public class Teste {
    public static void main (String[] args){ 
        Scanner receba = new Scanner(System.in); 
        float valorOriginal; 
        Apolice participante = new Apolice();
        participante.nomeSegurado = receba.nextLine();
        participante.idade =  receba.nextInt();
        participante.valorPremio = receba.nextFloat();

        valorOriginal = participante.valorPremio;
        participante.apolice(participante.nomeSegurado, participante.idade, participante.valorPremio);
        participante.calcularPremio();
        participante.imprimir();
        participante.cidade = receba.nextLine();
        participante.oferecerDesconto(participante.cidade);

        System.out.println("O valor do desconto foi de: " +(valorOriginal - participante.valorPremio)); 

        receba.close();
        }
}
