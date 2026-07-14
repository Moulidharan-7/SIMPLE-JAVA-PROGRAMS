public class linear_list_addmiddle {
        public static int linear(int[]arr,int add,int position){
        if(arr[0]== -1) return 0 ;
        int loop=0;
        while(loop<arr.length && arr[loop]!=-1){
            loop++;
        }
        
        if(arr.length==loop) return 0;
        
        for(int j=loop;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=add;
        loop++;
        
        return loop;
    }
    public static void main(String[] args) {
        int[] ar={1,2,2,3,4,5,6,-1,-1};
        System.out.println(linear(ar, 5,3));
    }
}
