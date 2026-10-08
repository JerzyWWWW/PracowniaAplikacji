import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie1
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");

        // Zadanie2
        String imie = "Jerzy";
        int rokUrodzenia = 2006;
        double czasDoMatury = 0.66;

        // Zadanie3
        int wiek = Year.now().getValue() - rokUrodzenia;
        System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat i będę pisać maturę za " + czasDoMatury + " roku.");

        Scanner scanner = new Scanner(System.in);

        // Zadanie4
        System.out.println("Podaj temperaturę w stopniach Celsjusza:");
        double stopnie = scanner.nextDouble();
        double fahrenheit = 1.8 * stopnie + 32.0;
        System.out.println(fahrenheit);

        // Zadanie5
        System.out.println("Podaj trzy boki trójkąta:");
        double bokA = scanner.nextDouble();
        double bokB = scanner.nextDouble();
        double bokC = scanner.nextDouble();
        System.out.println(bokA + bokB + bokC);

        // Zadanie6
        System.out.println("Podaj trzy słowa:");
        String slowo1 = scanner.next();
        String slowo2 = scanner.next();
        String slowo3 = scanner.next();
        System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

        // Zadanie7
        System.out.println("Podaj wyraz:");
        String wyraz = scanner.next();
        System.out.println(wyraz.length());

        // Zadanie8
        int x = 5;
        int y = 2;
        double wynik = (double) x / y;
        System.out.println(wynik);

        // Zadanie9
        System.out.println("Podaj słowo:");
        String slowo = scanner.next();
        System.out.println(slowo.toUpperCase());

        // Zadanie10
        System.out.println("Podaj promień koła:");
        int promien = scanner.nextInt();
        System.out.println(Math.PI * promien * promien);

        scanner.close();
    }
}