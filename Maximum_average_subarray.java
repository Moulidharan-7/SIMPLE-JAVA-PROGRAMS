public class Maximum_average_subarray {
    public static double sliding_window(int []arr,int target){
        int window_num=0;
        for(int i=0;i<target;i++){
            window_num+=arr[i];
        }
        double average_sum=window_num;
        for(int i=target;i<arr.length;i++){
            window_num+=arr[i];
            window_num-=arr[i-target];
            average_sum=Math.max(average_sum,window_num);
        }
        return average_sum/target;
    }
    public static void main(String[] args) {
        int []ar={1,12,-5,-6,50,3};
        int selection=4;
        System.out.println(sliding_window(ar, selection));
    }
}
