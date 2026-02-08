import java.util.Scanner;

public class largestofNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int arr[] = {10, -3, 2, 12, 7};

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
System.out.println(max); 
    }
    
}
