import java.util.Arrays;

public class Binarysearch {

    public static int[] binary(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int min = -1;
        int max = -1;

        // First occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                if (mid > 0 && arr[mid - 1] == target) {
                    high = mid - 1;
                } else {
                    min = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;

        // Last occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                if (mid < arr.length - 1 && arr[mid + 1] == target) {
                    low = mid + 1;
                } else {
                    max = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[] ar = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(binary(ar, 8)));
    }
}