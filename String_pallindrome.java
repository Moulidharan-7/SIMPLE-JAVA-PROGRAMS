public class String_pallindrome {
    static boolean pallindrome_check(String s){
        s=s.replaceAll("[^a-zA-Z]", "").toLowerCase().replace(" ", "");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(pallindrome_check("Madam, I'm Adam"));
    }
    
}