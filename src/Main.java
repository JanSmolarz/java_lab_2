import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int index = 7;
                for(int i = 100; i >= 0; i--){
                    if (i % index == 0 && i != 0)
                    System.out.println(i + " jest podzielna przez " + index);
                }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        Scanner scan = new Scanner(System.in);
        
        int[] Table = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Podaj wartość Table["+i+"]: ");
            Table[i] = scan.nextInt();
        }

        System.out.println("Tablica: ");

        for (int i : Table) {
            System.out.println(i);
        }
        
    }
}
