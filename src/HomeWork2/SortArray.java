package HomeWork2;

public class SortArray {

    public static int[] sortArrayBubbles(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArraysShaker(int[] arr) {
        int leftEdge = 0;
        int rightEdge = arr.length - 1;
        do {
            for (int i = leftEdge; i < rightEdge; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            rightEdge--;
            for (int i = rightEdge; i > leftEdge; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftEdge++;
        } while (leftEdge <= rightEdge);
        return arr;
    }
}
