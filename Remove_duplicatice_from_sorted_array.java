public class Remove_duplicatice_from_sorted_array {
    public static int duplicate(int[] nums){
        int count=0;
        for (int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i]){
                count++;
                nums[count]=nums[i];
            }
        }
    return count+1;}
    public static void main(String[] args) {
        int[]arr={1,1,2,2,2,3,3,4,4};
       
        System.out.println( duplicate(arr));
    }
}
