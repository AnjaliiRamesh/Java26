public class callStack {
    public static void main(String[] args) {
        int x=0;
        System.out.println("inside main class: x = "+x);
        first();
        System.out.println("main class exected now pop");

    }
    static void first(){
        int x = 10;
        System.out.println("inside first class: x -> "+x);
        second();
        System.out.println("second class exected now pop");

    }
    static void second(){
        int x = 20;
        System.out.println("inside second class: x -> "+x);
        third();
        System.out.println("third class exected now pop");
    }
    static void third(){
        int x = 30;
        System.out.println("inside third class: x -> "+x);
        
    }
    
}
