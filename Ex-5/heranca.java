class conta{
    int numero;
    double saldo;
    String nome;

    conta(int numero, double saldo, String nome){
        setNome(nome);
    }
    public void depositar(float deposito){
        this.saldo += deposito;
    }
    public boolean sacar(float saque){
        if(this.saldo >= saque){
            this.saldo -= saque;
            return true;
        }else{
            return false;
        }
    }
    public void resumoExtrato(int numero){
        System.out.println("Nome: "+ this.nome + "Saldo: " + this.saldo);
    }
    public void fazManutencao(){
        
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return "Número: " + getNumero() + "Saldo: " + getSaldo() + "Nome: " + getNome();
    }
};
public class heranca{
    public static void main (String[] args){

    }
};