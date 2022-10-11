import java.util.ArrayList; 

public class Ex6 {
    public static void main(String args[]){
        int nprimos = 0;
        int i = 1;
        ArrayList<Integer> primos = new ArrayList<Integer>();
        while(nprimos != 15){
            boolean primo = true;
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo){
                primos.add(i);
                nprimos++;
            }
            i++;
        }
        System.out.println("\nPrimos: " + primos);
    }
}
