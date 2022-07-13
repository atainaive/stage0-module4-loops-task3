package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int t1 = 0, t2 = 1;

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(t1);
            int nextT = t1 + t2;
            t1 = t2;
            t2 = nextT;
        }
    }
}
