public class Ex4 {
    /**
     * @param args
     */
    public static void main(String args[]){
        int n1 = 6;
        int n2 = 2;
        for(int i = 1; i < 11; i++){
            int x1 = i * n1;
            int x2 = i * n2;
            System.out.printf("\n%d x %d = %d   %d x %d = %d", i, n1, x1, i, n2, x2);
        }
    }
}
