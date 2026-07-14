public class lineat_list_adding_atlast {
    public static int linear(int[]arr,int add){
        if(arr[0]== -1) return 0 ;
        int loop=0;
        while(loop<arr.length && arr[loop]!=-1){
            loop++;
        }
        
        if(arr.length==loop) return 0;
        arr[loop]=add;
        loop++;
        
        return loop;
    }
    public static void main(String[] args) {
        int[] ar={1,2,2,3,4,5,6,-1,-1};
        System.out.println(linear(ar, 5));
    }
}