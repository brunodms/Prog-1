public class Ex5 {
    public static void main(String args[]){

        String s = "atrapalham ";
        for(int i = 1; i < 101; i++){
            if(i == 1){
                System.out.printf("\n%s", "1 Java atrapalha muita gente");
            }else{
                System.out.printf("\n%d %s %s%s", i, "Java", s, "muita gente");
            }
            s += "atrapalham ";
        }
    }
}
