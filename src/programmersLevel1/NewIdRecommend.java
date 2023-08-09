package programmersLevel1;

class NewIdRecommend {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder temp = new StringBuilder(new_id);

        //1단계: 모든 대문자를 소문자로 치환
        temp = new StringBuilder(temp.toString().toLowerCase());

        //2단계: 소문자, 숫자, - _ . 를 제외한 모든 문자 제거
        temp = new StringBuilder(temp.toString().replaceAll("[^-_.a-z0-9]", ""));

        //3단계: 마침표 두번이상 연속된 부분을 하나의 마침표로 치환
        temp = new StringBuilder(temp.toString().replaceAll("[.]{2,}", ".")); // 특수문자는 []로 감싸줘야 함

        //4단계: 마침표가 처음이나 끝에 위치하면 제거
        temp = new StringBuilder(temp.toString().replaceAll("^[.]|[.]$", ""));

        //5단계: 문자열이 비었다면 a 대입
        if (temp.toString().equals(""))
            temp.append("a");

        //6단계: 길이가 16자 이상이면 15자 초과된 문자 제거
        if (temp.length() >= 16) {
            temp = new StringBuilder(temp.substring(0, 15));
            temp = new StringBuilder(temp.toString().replaceAll("^[.]|[.]$", "")); //4단계 한번 더 돌려줌
        }

        //7단계: 길이가 2자 이하이면 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        if (temp.length() <= 2) {
            int k = temp.length();
            char last = temp.charAt(k - 1);

            while (k < 3) {
                temp.append(last);
                k++;
            }
        }
        answer = temp.toString();
        return answer;
    }
}