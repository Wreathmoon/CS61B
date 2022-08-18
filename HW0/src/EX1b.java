public class EX1b {
    public static void drawTriangle(int n) {
        int i = 1;
        while (i < n + 1) {
            int num = 0;
            while (num < i) {
                System.out.print("*");
                num += 1;
            }
            System.out.println("");
            i += 1;
        }
    }
        public static void main(String[] args) {
            drawTriangle(10);
    }
}
