package programmersLevel2;

class StringCompression {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int zip = 1;
            String zipS = s.substring(0, i);
            StringBuilder temp = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String zipNext = s.substring(j, j + i > s.length() ? s.length() : i + j);

                if (zipS.equals(zipNext)) zip++;
                else {
                    temp.append((zip != 1 ? zip : "") + zipS);
                    zipS = zipNext;
                    zip = 1;
                }
            }
            temp.append(zipS);
            answer = Math.min(answer, temp.length());
        }

        return answer;
    }
}