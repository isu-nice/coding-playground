package coplitPractice;

public class BoardGame {
    public Integer boardGame(int[][] board, String operation) {
        final char left = 'L';
        final char right = 'R';
        final char up = 'U';
        final char down = 'D';
        final int size = board.length;

        int score = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < operation.length(); i++) {

            char nextMove = operation.charAt(i);

            switch (nextMove) {
                case left:
                    row--;
                    break;
                case right:
                    row++;
                    break;
                case up:
                    col--;
                    break;
                case down:
                    col++;
                    break;
            }

            // 범위를 벗어나면 null
            if (col < 0 || col >= size || row < 0 || row >= size) {
                return null;
            }

            score += board[col][row];
        }

        return score;
    }
}
