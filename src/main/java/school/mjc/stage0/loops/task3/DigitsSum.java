package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String s = String.valueOf(t);
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '-'){
                sum += s.charAt(i) - '0';
            } else {
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
