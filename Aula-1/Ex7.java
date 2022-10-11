
import java.util.ArrayList; 

public class Ex7 {
    public static void main(String args[]){
        ArrayList<Integer> primos = new ArrayList<Integer>();
        for(int i = 101; i < 200; i++){
            boolean primo = true;
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo){
                primos.add(i);
            }
        }
        System.out.println("\nPrimos: " + primos);
    }
}
