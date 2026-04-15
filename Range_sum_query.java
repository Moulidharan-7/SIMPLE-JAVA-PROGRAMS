public class Range_sum_query {
    public static void main(String[] args) {
        int []given={3,1,4,1,5,9,2,6};
        int []arr=new int [given.length];
        arr[0]=given[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+given[i];
        }
        System.out.println(arr[3]);
        System.out.println(arr[5]-arr[1]);
        System.out.println(arr[6]-arr[0]);
    }
}
