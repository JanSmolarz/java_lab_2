public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int id = 60727;
        int i = 1000;
        int x = id % 100;

        System.out.println(x);

        while (i > 0){

            if (i % x == 0){
                System.out.println("Liczba " + i + " jest podzielna przez " + x);
            }

            i--;
        }

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        *//*
        int s = 5;
        int[] tablica = new int[5];
        tab[0] = 111;
        tab[1] = 222;
        tab[2] = 333;
        tab[3] = 444;
        tab[4] = 555;

        do (s > 0){
            System.out.println(i);
        }/*/
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


    }
}
