import java.util.Scanner;

class produto{
    String nome;
    float valor;
    int quantidade;

    public void Produto(String nome, float valor, int quantidade){
        setNome(nome);
        setValor(valor);
        setQuantidade(quantidade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public float getValor(){
        return valor;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public boolean verificarDisponibilidade(int qtt){
        if(this.quantidade >= qtt){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Nome: " + getNome() + ", Valor: " + getValor() + ", Quantidade: " + getQuantidade();
    }
};
public class Ex5 {
    public static void main (String[] args){
        int i = 0;
        produto[] P = new produto[10]; 
        while(true){
            System.out.println("1 - Cadastrar Produto\n2 - Consultar Estoque\n3 - Remover Unicades\n4 - Adicionar Unidade\n9 - Sair");
            Scanner sMenu = new Scanner(System.in);
            int menu = sMenu.nextInt();
            if(menu == 1){
                P[i] = new produto();
                Scanner receba = new Scanner(System.in);
                String nome = receba.nextLine();
                float valor = receba.nextInt();
                int quantidade = receba.nextInt();
                P[i].Produto(nome, valor, quantidade);
                System.out.println(P[i]);
                receba.close();
                i++;
            }else if(menu == 2){
                Scanner sConsulta = new Scanner(System.in);
                int consulta = sConsulta.nextInt();
                if(P[consulta].verificarDisponibilidade(P[consulta].quantidade)){
                    sout
                }
                sConsulta.close();
            }else if(menu == 3){
                
            }else if(menu == 4){
                
            }else if(menu == 9){
                System.out.println("Saindo...");
                break;
            }
            sMenu.close();
        }
    }
};