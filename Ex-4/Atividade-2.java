import java.util.Scanner;

class produto{
    String nome;
    float valor;
    int quantidade;

    produto(String nome, float valor, int quantidade){
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
    public void adicionarUnidades(int qtt){
        this.quantidade += qtt;
    }
    public boolean removerUnidades(int qtt){
        if(verificarDisponibilidade(qtt)){
            this.quantidade -= qtt;
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
            sMenu.nextLine();
            if(menu == 1){
                Scanner receba = new Scanner(System.in);
                System.out.println("Nome: ");
                String nome = receba.nextLine();
                System.out.println("Valor: ");
                float valor = receba.nextLong();
                receba.nextLine();
                System.out.println("Quantidade: ");
                int quantidade = receba.nextInt();
                receba.nextLine();
                P[i] = new produto(nome, valor, quantidade);
                System.out.println(P[i]);
                receba.close();
                i++;
            }else if(menu == 2){
                Scanner sConsulta = new Scanner(System.in);
                System.out.println("Indice: ");
                int consulta = sConsulta.nextInt();
                sConsulta.nextLine();
                System.out.println(P[consulta].getQuantidade());
                sConsulta.close();
            }else if(menu == 3){
                Scanner sConsulta = new Scanner(System.in);
                System.out.println("Indice: ");
                int consulta = sConsulta.nextInt();
                sConsulta.nextLine();
                sConsulta.close();
                Scanner sRmv = new Scanner(System.in);
                System.out.println("Quantidade a ser removida: ");
                int rmvUnidades = sRmv.nextInt();
                sRmv.nextLine();
                if(P[consulta].removerUnidades(rmvUnidades)){
                    System.out.println("Ok");
                }else{
                    System.out.println("Quantidade menor que o necessario!");
                }
                sRmv.close();
            }else if(menu == 4){
                Scanner sConsulta = new Scanner(System.in);
                System.out.println("Indice: ");
                int consulta = sConsulta.nextInt();
                sConsulta.nextLine();
                sConsulta.close();
                Scanner sAdd = new Scanner(System.in);
                System.out.println("Quantidade a ser adicionada: ");
                int addUnidades = sAdd.nextInt();
                sAdd.nextLine();
                P[consulta].adicionarUnidades(addUnidades);
                sAdd.close();
            }else if(menu == 9){
                System.out.println("Saindo...");
                break;
            }
            sMenu.close();
        }
    }
};