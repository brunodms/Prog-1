import java.util.ArrayList;

public class Ex10 {
    public static void main(String args[]){
        int [][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < matriz.length; ++i) {
            ArrayList<Integer> linha = new ArrayList<Integer>();
            for(int j = 0; j < matriz[i].length; ++j){
                linha.add(matriz[i][j]);
            }
            System.out.println(linha);
          }
    }
}
