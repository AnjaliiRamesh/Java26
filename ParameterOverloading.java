public class ParameterOverloading {

    static int add(int a, int b){
        System.out.print("Integer block executed: ");
        return a+b;
    }
    static String add(String a, String b){
        System.out.print("String block executed: ");
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(5,4));
        System.out.println(add("Hello ","Anjali"));
    }
    
}
