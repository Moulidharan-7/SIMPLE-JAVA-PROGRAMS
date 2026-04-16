import java.util.HashMap;

public class Missing_number{

    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int []arr={9,6,4,2,3,5,7,0,1};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],0);
        }
        int num=arr.length;
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(i)){
                continue;
            }
            else{
                num=i;
            }
        }
        System.out.println(num);


    }
}