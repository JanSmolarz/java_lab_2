import java.util.Scanner;

public class Main {

    private static int[] Tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        System.out.print("Podaj jedną liczbę: ");
        Scanner scan = new Scanner(System.in);
        int intUser = scan.nextInt();

        switch (intUser % 2) {
            case 0:
                System.out.println("Liczba parzysta");
                break;
            default:
                System.out.println("Liczba nieparzysta");
                break;
        }

        switch (intUser % 7){
            case 0:
                System.out.println("podzielna przez 7");
                break;
            default:
                System.out.println("NIE jest podzielna przez 7");
                break;
        }



        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String str = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";

        int[] Tablica = {0,0,0,0,0,0,0,0,0,0,0};
        for (char zmiennaChar : str.toCharArray()){
            switch (zmiennaChar){
                case 'o':
                    ++Tablica[0];
                    break;
                case 'z':
                    ++Tablica[1];
                    break;
                case 'j':
                    ++Tablica[2];
                    break;
                case 'n':
                    ++Tablica[3];
                    break;
                case 'x':
                    ++Tablica[4];
                    break;
                case 'p':
                    ++Tablica[5];
                    break;
                case 'i':
                    ++Tablica[6];
                    break;
                case 'm':
                    ++Tablica[7];
                    break;
                case 'q':
                    ++Tablica[8];
                    break;
                case 't':
                    ++Tablica[9];
                    break;
                case 'y':
                    ++Tablica[10];
                    break;

            }
        }
        int i = Tablica[2] + Tablica[3] +  Tablica[6] + Tablica[7] + Tablica[9] + Tablica[10];
        System.out.println("o: " + Tablica[0] + " razy,\n " + "p: " + Tablica[5] + " razy,\n " + "x: " + Tablica[4] + " razy,\n " + "z: " + Tablica[1] + " razy,\n " + "q: " + Tablica[8] + " razy,\n " + "inne: " + i + " razy,\n ");
    }
}
