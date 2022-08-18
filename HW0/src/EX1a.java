public class EX1a {
    public static void main(String[] args){
        int i = 1;
        while (i<6){
            int num = 0;
            while (num < i){
                System.out.print("*");
                num += 1;
            }
            System.out.println("");
            i += 1;
        }
    }
}