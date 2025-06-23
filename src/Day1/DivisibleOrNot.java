package Day1;

public class DivisibleOrNot {
    public static void main(String[] args){
        int count=0;

        for(int i = 1;i <=100;i++ ) {
            if(i%3 == 0 && i%5 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
