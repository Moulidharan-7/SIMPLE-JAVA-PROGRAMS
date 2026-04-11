import java.util.HashMap;
public class Two_sum {
    public static void main(String[] args) {
    int arr[]={2,7,11,4};
    int target=9;
    HashMap<Integer,Integer>map=new HashMap<>(); 
    for (int i=0;i<arr.length;i++){
        int need=target-arr[i];
        if(map.containsKey(need)){
        System.out.println("pair : "+need +" and "+arr[i]);
        return;
    }
    map.put(arr[i], i);  
    }
          
    
    }
}
  