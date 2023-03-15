package dailyCoding;
// TODO 패키지 밑으로 복사

public class Solution {
    public int computeWhenDouble(double interestRate) {
        double principal = 100;
        double target = principal * 2;
        int year = 0;

        while (principal < target) {
            principal += (principal * interestRate * 0.01);
            year++;
        }

        return year;
    }
}
