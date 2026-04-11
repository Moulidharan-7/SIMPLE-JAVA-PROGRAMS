import java.util.HashMap;
public class Valid_Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String r="naagram";
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map1.put(c,map1.getOrDefault(c, 0)+1);
        }
        for (int i=0;i<r.length();i++){
            char c=r.charAt(i);
            map2.put(c,map2.getOrDefault(c, 0)+1);
        }
        boolean check=true;
        for(char x: map1.keySet()){
            if(!map1.get(x).equals(map2.getOrDefault(x,0))){
                check=false;
                break;
            }
   
        }
        System.out.println(check);
        
    }
}
