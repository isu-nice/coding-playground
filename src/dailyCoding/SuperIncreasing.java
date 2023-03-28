package dailyCoding;

public class SuperIncreasing {
    public boolean superIncreasing(int[] arr) {
        // 첫번째 요소로 선언해줌
        int sum = arr[0];

        // 두번째 인덱스부터 검사
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] <= sum) {
                return false;
            }
            sum += arr[i];
        }
        return true;
    }
}
