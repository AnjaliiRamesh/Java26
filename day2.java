import java.util.Scanner;

public class day2{
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        if( n%2 ==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        String ans = n%2 == 0 ? "Even" : "Odd";
        System.out.println(ans);
    }

     */

    public static void main(String[] args) {
        /*
        boolean flag = false;
        if(!flag){
            System.out.println("hii");
        }
        else{
            System.out.println(
                    "oops"
            );
        }


        int a = 10, b = 20;

        int c = a / b;

        System.out. println( (a >= 5) && (b <= 10) && (a/c >= 5));

         */

        boolean male = false;
        int age = 30;
        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");

        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");

    }
}
