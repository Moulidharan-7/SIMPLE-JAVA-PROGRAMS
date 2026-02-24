import java.util.ArrayList;
public class two_number_subtract {
    static void two_number(ArrayList<Integer>arr1,int target){
        for(int i=0;i<arr1.size();i++){
            for(int j=i+1;j<arr1.size();j++){
                if(arr1.get(i)>arr1.get(j)){
                    if(arr1.get(i)-arr1.get(j)==target){                       
                    System.out.println(i+" "+j);                 
                }
                }
                else{
                    if(arr1.get(j)-arr1.get(i)==target){                       
                    System.out.println(i+" "+j);

                }
                
            }
        }
    }
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr1=new ArrayList<>(4);
        arr1.add(1);
        arr1.add(5);
        arr1.add(3);
        arr1.add(4);
        arr1.add(2);
        two_number(arr1, 2);
        
        
    }
}
