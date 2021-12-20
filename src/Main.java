import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int index = 60727;
        int x = index % 100;
        int i = 1000;
        do {
            System.out.println(i);
            if (i % x == 0){
                System.out.println("Liczba " + i + " jest podzielna przez " + x);
            }
        } while (--i > 0);
        System.out.println("\n");

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        // a)

        int [] table = new int [5];
        table[0] = 87;
        table[1] = 65;
        table[2] = 91;
        table[3] = 43;
        table[4] = 28;
        int y = 0;
        while(y <= 5){
            System.out.println("table [" + y +"] = " + table[y]);
            ++y;
            if(y >= 5){
                System.out.println("\n");
                break;
            }
        }

        // b)
        double [] table_double = new double[5];
        table_double[0] = 3.45;
        table_double[1] = 8.67;
        table_double[2] = 9.151;
        table_double[3] = 6.458;
        table_double[4] = 47.45;

        int z = 0;
        while(z <= 5){
            System.out.println("table_double [" + z +"] = " + table_double[z]);
            ++z;
            if(z >= 5){
                System.out.println("\n");
                break;
            }
        }

        // c)
        String [] table_String = new String[5];
        table_String[0] = "Jaś";
        table_String[1] = "Małgosia";
        table_String[2] = "Dominik";
        table_String[3] = "Justyna";
        table_String[4] = "Kacper";

        int s = 0;
        while(s <= 5){
            System.out.println("table_String [" + s +"] = " + table_String[s]);
            ++s;
            if(s >= 5){
                System.out.println("\n");
                break;

            }
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        //a)

        System.out.println(10>8);
        while(true){
            System.out.println("Prawdą jest, że 10 jest większe od 8");
            break;
        }

        //b)

        /*System.out.println(1>8);
        while(false){
            System.out.println("Nieprawdą jest, że 1 jest większe od 8");
            break;
        }*/
        //compilation error 'unreachable code'
    }
}