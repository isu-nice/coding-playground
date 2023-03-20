package coplitPractice;

public class GetDirections {
    public boolean getDirections(int[][] matrix, int from, int to) {
        // 경로 존재 유무를 나타내 줄 임시 배열 지정
        int[][] status = new int[matrix.length][];
        // 이중 배열 깊은 복사 해 줌
        for (int i = 0; i < matrix.length; i++) {
            status[i] = matrix[i].clone();
        }

        // 재귀 탈출 조건: 경로를 탐색하여 출발지와 도착지가 겹쳐질 때
        if(from == to) {
            return true;
        }

        for (int i = 0; i < status[from].length; i++) {
            // 경로가 존재하는 경우
            if(status[from][i] == 1){
                // 탐색한 경로는 0으로 표시해 줌
                status[from][i] = 0;

                // 출발 지점을 현재 지점으로 설정하여 다시 탐색
                if(getDirections(status, i, to)){
                    return true;
                }
            }
        }
        return false;
    }
}
