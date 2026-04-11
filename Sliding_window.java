public class Sliding_window {
    public static int sliding(int []ar,int select){
        int windowsum=0;
        
        for(int i=0;i<select;i++){
            windowsum+=ar[i];
        }
        int maxsum=windowsum;
        for(int i=select;i<ar.length;i++){
            windowsum+=ar[i];
            windowsum-=ar[i-select];
           maxsum= Math.max( maxsum,windowsum);
        }
        return maxsum;
    }
 public static void main(String[] args) {
    int []arr={1,2,3,45,4,3,5,6};
    int selection=3;
    System.out.println(sliding(arr,selection));
    
 }   
}
