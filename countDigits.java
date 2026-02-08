public class countDigits {

    public static void main(String[] args) {
    int digit = 35493;
    int count = 0;

    while(digit > 0){
        digit = digit / 10;
        count++; 
    }

    System.out.println(count);
}

}
