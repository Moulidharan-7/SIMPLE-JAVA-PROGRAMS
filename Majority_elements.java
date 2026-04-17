import java.util.HashMap;
public class Majority_elements {
    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x :map.keySet()){
            if(map.get(x)>(nums.length/2)){
                System.out.println(x);
            }
        
        }
        
    }
}

