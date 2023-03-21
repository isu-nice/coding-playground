package dailyCoding;

public class AB_Check {
    public boolean ABCheck(String str) {
        for (int i = 0; i < str.length() - 4; i++) {
            // 대소문자 구분 없애기 위해 모두 소문자로 바꿔줌
            str = str.toLowerCase();

            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b') {
                return true;
            }
            if (str.charAt(i) == 'b' && str.charAt(i + 4) == 'a') {
                return true;
            }
        }

        return false;
    }
}
