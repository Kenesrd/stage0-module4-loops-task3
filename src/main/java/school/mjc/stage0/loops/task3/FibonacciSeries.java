package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num0 = 0;
        int num1 = 1;
        int sum = 0;
        if (lastFibonacci == 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= lastFibonacci; i++){
                System.out.println(sum);
                num0 = sum + num1;
                sum = num1;
                num1 = num0;
            }
        }
    }
}
