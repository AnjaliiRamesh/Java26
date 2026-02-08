public class sumOfposNums {
    public static void main(String[] args) {
        int arr[] = {5,3,2,-4,2,0,9};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                sum += arr[i];
            }
            break;
        }
        System.out.println(sum);
    }
    
}
