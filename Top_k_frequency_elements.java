import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class Top_k_frequency_elements {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:map.values()){
                lst.add(x);
        }
        Collections.sort(lst);
        int []arr =new int[k];
        for(int i=0;i<2;i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}
