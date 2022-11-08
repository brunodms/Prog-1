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

public class Atividade2 {
    public static void main (String[] args){
        int i = 0;
        produto[] P = new produto[10]; 
        while(true){
            System.out.println("1 - Cadastrar Produto\n2 - Consultar Estoque\n3 - Remover Unicades\n4 - Adicionar Unidade\n9 - Sair");
            Scanner sMenu = new Scanner(System.in);
            int menu = lerInt("", sMenu);
            if(menu == 1){
                Scanner receba = new Scanner(System.in);
                String nome = lerString("Nome: ", receba);
                float valor = lerFloat("Valor: ", receba);
                int quantidade = lerInt("Quantidade: ", receba);
                P[i] = new produto(nome, valor, quantidade);
                System.out.println(P[i]);
                receba.close();
                i++;
            }else if(menu == 2){
                Scanner sConsulta = new Scanner(System.in);
                int consulta = lerInt("Indice: ", sMenu);
                System.out.println(P[consulta].getQuantidade());
                sConsulta.close();
            }else if(menu == 3){
                Scanner sConsulta = new Scanner(System.in);
                int consulta = lerInt("Indice: ", sMenu);
                sConsulta.close();
                Scanner sRmv = new Scanner(System.in);
                int rmvUnidades = lerInt("Quantidade a ser removida: ", sRmv);
                if(P[consulta].removerUnidades(rmvUnidades)){
                    System.out.println("Ok");
                }else{
                    System.out.println("Quantidade menor que o necessario!");
                }
                sRmv.close();
            }else if(menu == 4){
                Scanner sConsulta = new Scanner(System.in);
                int consulta = lerInt("Indice: ", sMenu);
                sConsulta.close();
                Scanner sAdd = new Scanner(System.in);
                int addUnidades = lerInt("Quantidade a ser adicionada: ", sAdd);
                P[consulta].adicionarUnidades(addUnidades);
                sAdd.close();
            }else if(menu == 9){
                System.out.println("Saindo...");
                break;
            }
            sMenu.close();
        }
    }
    private static int lerInt(String mensagem, Scanner scanner) {
        while (true) {
            System.out.println(mensagem);
            String receba = scanner.nextLine().trim();
            try {
                return Integer.parseInt(receba);
            } catch (NumberFormatException e) {
                System.out.println(receba + " não é um número inteiro. Tente novamente.");
            }
        }
    };
    private static float lerFloat(String mensagem, Scanner scanner) {
        while (true) {
            System.out.println(mensagem);
            String receba = scanner.nextLine().trim();
            try {
                return Float.parseFloat(receba);
            } catch (NumberFormatException e) {
                System.out.println(receba + " não é um número real. Tente novamente.");
            }
        }
    };
    
    private static String lerString(String mensagem, Scanner scanner) {
        while (true) {
            System.out.println(mensagem);
            String receba = scanner.nextLine().trim();
            if (!receba.isEmpty()) return receba;
            System.out.println("Tente novamente.");
        }
    };
};