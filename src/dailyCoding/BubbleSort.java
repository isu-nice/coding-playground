package dailyCoding;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;

                    count++;
                }
            }

            if(count == 0) {
                break;
            }
        }

        return arr;
    }
}
