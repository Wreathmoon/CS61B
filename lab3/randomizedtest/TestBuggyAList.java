package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
  @Test
  public void test_findbug() {
      AListNoResizing a = new AListNoResizing<Integer>();
      BuggyAList<Integer> b = new BuggyAList<>();
      a.addLast(4);        a.addLast(5);        a.addLast(6);
      b.addLast(4);        b.addLast(5);        b.addLast(6);

      assertEquals(a.removeLast(), b.removeLast());
      assertEquals(a.removeLast(), b.removeLast());
      assertEquals(a.removeLast(), b.removeLast());
  }

  @Test
  public void randomizedTest(){
      AListNoResizing<Integer> L = new AListNoResizing<>();
      BuggyAList B = new BuggyAList<>();

      int N = 500;
      for (int i = 0; i < N; i += 1) {
          int operationNumber = StdRandom.uniform(0, 4);
          if (operationNumber == 0) {
              // addLast
              int randVal = StdRandom.uniform(0, 100);
              L.addLast(randVal);
              B.addLast(randVal);
              System.out.println("addLast(" + randVal + ")");
          } else if (operationNumber == 1) {
              // size
              int size = L.size();
              assertEquals(L.size(),B.size());
              System.out.println("size: " + size);
          }
          else if (operationNumber == 2){
              // getLast
              if (L.size() > 0){
                  System.out.println("last: " + L.getLast());
                  assertEquals(L.getLast(),B.getLast());
              }
          }
          else if (operationNumber == 3){
              // removeLast
              if (L.size() > 0){
                  System.out.println("removeLast: " + L.removeLast());
                  assertEquals(L.removeLast(),B.removeLast());
              }
          }
      }
  }
}
