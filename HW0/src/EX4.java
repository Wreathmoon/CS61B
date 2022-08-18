public class EX4 {
    public static void windowPosSum(int[] a, int n) {
        for (int i=0; i<a.length;i+=1){
            if (a[i] < 0){
                continue;
            }
            else{
                if ((i+n)<=(a.length-1)){
                    for (int j=i+1;j<i+n+1;j+=1){
                        a[i] += a[j];
                    }
                }
                else if (i==a.length-1){
                    continue;
                }
                else{
                    for (int k=i+1;k<a.length;k+=1){
                        a[i] += a[k];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //int[] a = {1, 2, -3, 4, 5, 4};
        int[] a = {1, -1, -1, 10, 5, -1};
        //int n = 3;
        int n = 2;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}