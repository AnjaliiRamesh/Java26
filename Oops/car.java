public class car {

    String model = "abc";
    String color = "blue";
    int price = 100000; 
    void drive(){
        System.out.println("drive");
    }
    void lock(){
        System.out.println("lock");
    }
    void unlock(){
        System.out.println("unlock");
    }



    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println(c2.color);

        c2.color = "gray";
        System.out.println(c2.color);
    }
    
}
