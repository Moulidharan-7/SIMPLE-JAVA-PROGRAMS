import java.util.Arrays;

public class Array_Reversing {
        static void running(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int val = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = val;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        running(arr);
    }
    
}
