package dailyCoding;

public class FirstReverse {
    public String firstReverse(String str) {
        StringBuilder result = new StringBuilder(str);

        return result.reverse().toString();
    }
}
