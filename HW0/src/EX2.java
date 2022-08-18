public class EX2 {
    public static  int max(int[] m){
        int temp = 0;
        int i = 0;
        while (i < (m.length-1)) {
            if (m[i]<=m[i+1]){
                temp = m[i+1];
            }
            else if (i==0){
                temp = m[i];
            }
            else {
            }
            i += 1;
        }
        return temp;
    }

    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }
}
