package Day1;
import java.util.Arrays;
public class Day1 {
    public static void main(String[] args){
        int num1 = 12345;
//Creating a string array and typecasting into string
        String str = String.valueOf(num1);
//Splitting array for further typecasting into integer
        String[] str2 = str.split("");
//Variable for integer array
        int[] arrayInt = new int[str.length()];

//Typecasting String array into Integer array
        for (int i = 0;i<str.length();i++){
        arrayInt[i] = Integer.parseInt(str2[i]);
      }
        System.out.println(Arrays.toString(arrayInt));
        int j = 0;
        int temp = 0;
        while(j< str.length()){
            temp = temp + arrayInt[j];
            j++;
        }
        System.out.println(temp);


    }
}
