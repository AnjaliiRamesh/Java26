import java.util.Scanner;

public class LinSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();

        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == tar){
                ans = i;
                break;
            }
        
        }
     System.out.println("target found at index: "+ans);

    }
    
    
}
