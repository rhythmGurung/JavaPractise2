package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = inputObj.nextInt();

        ArrayList<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(0,0);
        arrayInt.add(1,1);
        System.out.println(arrayInt);
        for(int i = 0;i < num-2;i++){
            int num2 ;
            num2 = arrayInt.get(i) + arrayInt.get(i+1) ;
            arrayInt.add(num2);
        }
        System.out.println(arrayInt);
    }
}
