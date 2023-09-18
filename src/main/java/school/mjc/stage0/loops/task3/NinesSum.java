package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long multiple = 9;
        long sum = 0;

        if (lengthOfLastNumber <= 0){
            System.out.println(0);
            return;
        }

        for (int i = 1; i <= lengthOfLastNumber; i++){
            sum += multiple;
            multiple = multiple * 10 + 9;
        }
        System.out.println(sum);
    }
}
