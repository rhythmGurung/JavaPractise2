package Day1;
import java.util.ArrayList;
import java.util.Arrays;
public class Day1 {
    public static void main(String[] args){
        int num = 6 ;
        ArrayList<Integer> arrayInt = new ArrayList<>();



       for(int i = 1 ; i < num;i++){
           if(num % i == 0){
               arrayInt.add(i);
           }

       }
       System.out.println(arrayInt);

    }
}
