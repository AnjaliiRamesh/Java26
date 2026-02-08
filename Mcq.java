public class Mcq {
    public static void main(String[] args) {
        /* 
        int i = 0;

        while (i < 4) {

            if (i % 2 == 0) {

                System.out.print("YES");

            } else {

                System.out.print("NO");

            }

            i += 2;

        }
            */

        for(int i = 0; i <= 10; i++) {

            if(i % 2 == 0) {

                continue;

            }

            System.out.println(i);

        }
    }

}
