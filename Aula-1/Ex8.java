import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex8 {
    public static void main(String args[]){
        Scanner receba = new Scanner( System.in );
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int x;
            x = receba.nextInt();
            lista.add(x);
        }
        receba.close();
        System.out.println("\nLista: " + lista);
        Collections.sort(lista);
        System.out.println("Lista Ordenada: " + lista);
    }
}