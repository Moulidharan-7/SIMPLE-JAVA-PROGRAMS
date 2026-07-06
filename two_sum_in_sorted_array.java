import java.util.ArrayList;
public class two_sum_in_sorted_array 
{
    public  static ArrayList<Integer> two_sum(int[]arr,int target){
        int i=0;
        int j=arr.length-1;
        ArrayList <Integer> result=new ArrayList<>();
        result.add(-1);
        result.add(0);
        while(j>i){
            int sum=arr[i]+arr[j];
            if(sum==target){
                result.clear();
                result.add(i+1);
                result.add(j+1);
                return result;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int []ar={2,7,11,15};
        System.out.println(two_sum(ar, 9).toString());
    }
}