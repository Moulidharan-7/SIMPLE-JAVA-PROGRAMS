import java.util.HashMap;
public class Ransom_note {
    public static void main(String[] args) {
    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();
    String ransonme="a";
    String magazine="b";
    for(int i=0;i<ransonme.length();i++){
        map1.put(ransonme.charAt(i),map1.getOrDefault(ransonme.charAt(i), 0)+1);
    }
    for(int i=0;i<magazine.length();i++){
        map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i), 0)+1);
    } boolean check = true;
    for(char x: map1.keySet()){
        if(map2.getOrDefault(x,0)>=map1.get(x)){
            continue;
        }
        else{
            check=false;
            break;
        }
    }System.out.println(check);

}    
}
