package Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        int num = 1221;
        String org = String.valueOf(num);
        String rev = "";
        for(int i = 0; i < org.length(); i++)
        {
            rev = org.charAt(i) + rev;
        }
        System.out.println("Reversed: "+rev);
        if (rev.equals(org)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

}
