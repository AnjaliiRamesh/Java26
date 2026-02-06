import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entter value of p: ");
        int p = sc.nextInt();

        System.out.print("Entter value of r: ");
        int r = sc.nextInt();

        System.out.print("Entter value of t: ");
        int t = sc.nextInt();

        int simpleInterest = (p*r*t)/100;
        System.out.print("Your Simple Interest is " + simpleInterest);

//        int a = 10, b = 5;  //1
//
//        int c = (a * 1.0) / b; //2
//
//        System.out. println(c); //3
    }
}
