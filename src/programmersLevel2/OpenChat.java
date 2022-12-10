package programmersLevel2;

class OpenChat {
    public String[] solution(String[] record) {
        String[] answer = {};
        String[] result = {};
        String[] id = {};
        int cnt = 0;

        for (int i = 0; i < record.length; i++) {

            String[] splitArr = record[i].split(" ");

            switch (splitArr[0]) {
                case "Enter":
                    id[cnt] = splitArr[1];
                    result[i] += splitArr[2] + "님이 들어왔습니다.";

                case "Leave":
                    result[i] += splitArr[2] + "님이 나갔습니다.";

                case "Change":
                    result[i] += splitArr[2] + "님이 나갔습니다.";
            }

        }


        return answer;
    }
}