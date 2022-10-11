import java.util.ArrayList;
import java.lang.Math;

public class Ex9 {
    public static void main(String args[]){
        ArrayList<Integer> abaixoMedia = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int somatotal = 0;
        
        for(int i = 0; i < 50; i++){
            int x = 1 + (int)(Math.random() * 100);
            lista.add(x);
            somatotal += x;
        }
        int media = somatotal/lista.size();
        System.out.println("\nLista: " + lista);
        System.out.printf("Media: %d", media);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < media){
                abaixoMedia.add(lista.get(i));
            }
        }
        System.out.println("\nAbaixo da media: " + abaixoMedia);
    }
}
