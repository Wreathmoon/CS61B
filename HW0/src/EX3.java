public class EX3 {
    public static  int forMax(int[] m){
        int temp = 0;
        for (int i=0;i<(m.length-1);i+=1){
            if (m[i]<=m[i+1]){
                temp = m[i+1];
            }
            else if (i==0){
                temp = m[i];
            }
            else {
                continue;
            }
        }
        return temp;
    }

    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(forMax(numbers));
    }
}
