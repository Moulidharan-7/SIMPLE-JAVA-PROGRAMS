import java.util.Arrays;
public class Prefix_sum {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []prefix_arr=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefix_arr));
    }
