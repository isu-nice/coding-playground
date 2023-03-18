package study;

/*
* 재귀를 사용해서 구구단 구현
* */
public class GuGudan {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            gugudan(i, 1);
            System.out.println();
        }
    }

    private static void gugudan(int level, int number) {

        if(number > 9) {
            return;
        }

        System.out.printf("%d x %d = %d\n", level, number, level * number);

        gugudan(level, ++number);
    }
}
