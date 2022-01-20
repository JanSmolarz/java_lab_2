public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 1; i <= 10; i++) {
            if (i == 8)
                break;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 100; i >= 0; i--) {
            if (i == 69)
                return;
            System.out.print(i + " ");
        }


    }
}
