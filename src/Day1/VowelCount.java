package Day1;

import java.util.Locale;

public class VowelCount {
    public static void main(String[] args){
        String str = "AlbinA" ;
        str = str.toLowerCase();
        System.out.println(str);
        String[] vowels = {"a","e","i","o","u"};
        int count = 0;
        for (String vowel : vowels) {
            for (int indexNum2 = 0; indexNum2 < str.length(); indexNum2++) {
                if (vowel.equals(String.valueOf(str.charAt(indexNum2)))) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Total number of vowels in the string is :" + count);

    }
}
