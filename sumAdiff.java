public class sumAdiff {
    
    public int solve(int[] A) {
        
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                evenSum += A[i];
            } else {
                oddSum += A[i];
            }
        }
        
        return evenSum - oddSum;
    }
}

    
