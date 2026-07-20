

public class bubble_sorting {
    public static int[] bubble_sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) break;

        }
        return arr;
    }
    public static void main(String[] args) {
        int []ar={3,5,2,6,3,5,2};
        bubble_sort(ar);
    }
}
