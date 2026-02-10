public class scopeVariable {
    public static void main(String[] args) {
        int a = 10;
        if(true){
            int b = 10;
            System.out.println("inside b ->" +b);

        }
        System.out.println("outside a->"+a);

    }
    
}
