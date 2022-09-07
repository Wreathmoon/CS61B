package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList test = new AList();
        AList<Integer> N = new AList<Integer>();/**1000,2000,4000,8000,16000,32000,640000,128000*/
        N.addLast(1000);N.addLast(2000);N.addLast(4000);N.addLast(8000);N.addLast(16000);
        N.addLast(32000);N.addLast(64000);N.addLast(128000);
        AList<Integer> opCounts = new AList<Integer>();
        for (int i=0;i<8;i++){opCounts.addLast(10000);}
        AList<Double> times = new AList<Double>();

        for (int i=0;i<N.size();i++) {
            SLList lst_getlasttest = new SLList();
            for (int j = 0; j < N.get(i); j++) {
                lst_getlasttest.addLast(0);
            }
            Stopwatch sw = new Stopwatch();
            for (int k=0;k<opCounts.get(i);k++) {
                lst_getlasttest.getLast();
            }
            double timeInSeconds = sw.elapsedTime();
            times.addLast(timeInSeconds);
        }
        printTimingTable(N, times, opCounts);
    }

}
