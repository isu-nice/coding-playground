package dailyCoding;

public class InsertDash {
    public String insertDash(String str) {
        if (str.isEmpty()) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        // 맨 앞 숫자 붙여주고 시작
        builder.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            // 뒤 인덱스를 기준으로 앞 인덱스를 확인하여 홀수이면 하이픈 추가
            if (isOdd(str, i) && isOdd(str, i - 1)) {
                builder.append("-");
            }
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }

    private boolean isOdd(String str, int i) {
        return str.charAt(i) % 2 == 1;
    }
}
