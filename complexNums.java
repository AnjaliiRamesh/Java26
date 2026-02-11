public class complexNums {
    int real ;
    int imaginary;

    //constructor
    complexNums(int r, int i){
        real = r;
        imaginary=i;

    }

    void print(){
        System.out.println(real + "+" +imaginary + "i");
    }

    public static void main(String[] args) {
        complexNums x = new complexNums(2,3);
        // x.real = 2;
        // x.imaginary = 3;

        x.print();
        complexNums y = new complexNums(-4,3);
        // y.real = 4;
        // y.imaginary = 3;

        y.print();
    }
}
