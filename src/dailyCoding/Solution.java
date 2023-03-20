package dailyCoding;
// TODO 패키지 밑으로 복사

public class Solution {
    public String convertDoubleSpaceToSingle(String str) {
        return str.replaceAll(" {2}", " ");
    }

    // 공부용
    public String convertDoubleSpaceToSingle2(String str) {
        String[] words = str.split(" {2}");
        return String.join(" ", words);
    }
}