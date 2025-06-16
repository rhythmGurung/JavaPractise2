import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num > 0 ){
        System.out.println("The number is positive ");
        }
        else if (num == 0 ){
            System.out.println("The number is null");
        }
        else{
            System.out.println("The number is negative");
        }


        if (num % 5 ==0){
            System.out.println("it is divisible by 5");
        }
        else{
            System.out.println("It is not divisible by 5");
        }

        if (num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("It is odd");
        }

        if (num % 2 == 0 && num % 3 == 0){
            System.out.println("It is divisible by 2 and 3 ");
        }

        if (num % 2 == 0 && num >50){
            System.out.println("The number is odd and greater than 50");
        }
        else{
            System.out.println("It is not a odd number greater than 50");
        }
    }

    for(int i = 10; i <= 100; i++){
       System.out.println("num : " +i) ;

    }


}
