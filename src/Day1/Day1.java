package Day1;
import java.util.ArrayList;
import java.util.Scanner;
public class Day1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        String str2 = String.valueOf(num);
        String[]  str = new String[num];

        str = str2.split("");
        String str3;
        ArrayList<String> arrayString = new ArrayList<>();
        for(int i = str.length-1 ; i >= 0;i--){
            arrayString.add(str[i]);

        }

            str3 = String.join("",arrayString);
            int result = Integer.parseInt(str3);

        System.out.println(result);

    }
}
