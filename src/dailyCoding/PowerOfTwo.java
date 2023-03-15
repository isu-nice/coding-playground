package dailyCoding;

public class PowerOfTwo {
    public static boolean powerOfTwo(long num) {

        while(num > 1) {
            if(num % 2 != 0) {
                return false;
            }
            num /= 2;
        }

        return true;
    }
}
