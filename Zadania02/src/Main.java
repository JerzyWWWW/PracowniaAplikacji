import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        System.out.println("Zadanie 1.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbe: ");
            int liczba = scanner.nextInt();

            if (liczba % 3 == 0) {
                System.out.println("Liczba jest podzielna przez 3.");
            } else {
                System.out.println("Liczba nie jest podzielna przez 3.");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 2.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj bok a: ");
            double a = scanner.nextDouble();
            System.out.print("Podaj bok b: ");
            double b = scanner.nextDouble();
            System.out.print("Podaj bok c: ");
            double c = scanner.nextDouble();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Mozna zbudowac trojkat.");
            } else {
                System.out.println("Nie mozna zbudowac trojkata.");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 3.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pierwsza liczbe: ");
            double a = scanner.nextDouble();
            System.out.print("Podaj druga liczbe: ");
            double b = scanner.nextDouble();

            if (a > b) {
                System.out.println("Najwieksza jest: " + a);
            } else if (b > a) {
                System.out.println("Najwieksza jest: " + b);
            } else {
                System.out.println("Liczby sa rowne.");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 4.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pierwsza liczbe: ");
            double a = scanner.nextDouble();
            System.out.print("Podaj druga liczbe: ");
            double b = scanner.nextDouble();
            System.out.print("Podaj trzecia liczbe: ");
            double c = scanner.nextDouble();

            double max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }

            System.out.println("Najwieksza liczba to: " + max);
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 5.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj numer miesiaca (1-12): ");
            int miesiac = scanner.nextInt();

            if (miesiac == 1) {
                System.out.println("Styczen");
            } else if (miesiac == 2) {
                System.out.println("Luty");
            } else if (miesiac == 3) {
                System.out.println("Marzec");
            } else if (miesiac == 4) {
                System.out.println("Kwiecien");
            } else if (miesiac == 5) {
                System.out.println("Maj");
            } else if (miesiac == 6) {
                System.out.println("Czerwiec");
            } else if (miesiac == 7) {
                System.out.println("Lipiec");
            } else if (miesiac == 8) {
                System.out.println("Sierpien");
            } else if (miesiac == 9) {
                System.out.println("Wrzesien");
            } else if (miesiac == 10) {
                System.out.println("Pazdziernik");
            } else if (miesiac == 11) {
                System.out.println("Listopad");
            } else if (miesiac == 12) {
                System.out.println("Grudzien");
            } else {
                System.out.println("Nieprawidlowy numer miesiaca");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 6.");
        {
            Scanner scanner = new Scanner(System.in);
            String mojeImie = "Jan";

            System.out.print("Podaj swoje imie (bez polskich znakow): ");
            String imieUzytkownika = scanner.nextLine();

            if (imieUzytkownika.equals(mojeImie)) {
                System.out.println("Twoje imie jest takie samo jak moje.");
            } else {
                System.out.println("Twoje imie jest inne niz moje.");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 7.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wiek: ");
            int wiek = scanner.nextInt();

            boolean czyPelnoletni = wiek >= 18;
            System.out.println("Czy pelnoletni: " + czyPelnoletni);

            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 8.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj rok: ");
            int rok = scanner.nextInt();

            if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                System.out.println("Rok jest przestepny.");
            } else {
                System.out.println("Rok nie jest przestepny.");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 9.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wage (kg): ");
            double waga = scanner.nextDouble();
            System.out.print("Podaj wzrost (m): ");
            double wzrost = scanner.nextDouble();

            double bmi = waga / (wzrost * wzrost);
            System.out.println("BMI: " + bmi);

            if (bmi < 18.5) {
                System.out.println("niedowaga");
            } else if (bmi <= 24.9) {
                System.out.println("waga prawidlowa");
            } else {
                System.out.println("nadwaga");
            }
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 10.");
        {
            Scanner scanner = new Scanner(System.in);
            double cena;
            int liczbaRat;

            while (true) {
                System.out.print("Podaj cene towaru (100 - 10000 zl): ");
                if (scanner.hasNextDouble()) {
                    cena = scanner.nextDouble();
                    if (cena >= 100 && cena <= 10000) break;
                } else {
                    scanner.next();
                }
                System.out.println("Bledna cena! Sprobuj ponownie.");
            }

            while (true) {
                System.out.print("Podaj liczbe rat (6 - 48): ");
                if (scanner.hasNextInt()) {
                    liczbaRat = scanner.nextInt();
                    if (liczbaRat >= 6 && liczbaRat <= 48) break;
                } else {
                    scanner.next();
                }
                System.out.println("Bledna liczba rat! Sprobuj ponownie.");
            }

            double oprocentowanie = (liczbaRat <= 12) ? 0.025 : (liczbaRat <= 24 ? 0.05 : 0.10);
            double rata = (cena * (1 + oprocentowanie)) / liczbaRat;

            System.out.println("Miesieczna rata wynosi: " + rata + " zl");
            scanner.close();
        }

        // ==========================================
        System.out.println("Zadanie 11.");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Prosty kalkulator.");

            System.out.print("Podaj pierwsza liczbe: ");
            double a = scanner.nextDouble();

            System.out.print("Podaj dzialanie (+, -, *, /): ");
            char znak = scanner.next().charAt(0);

            System.out.print("Podaj druga liczbe: ");
            double b = scanner.nextDouble();

            switch (znak) {
                case '+' -> System.out.println("Wynik: " + (a + b));
                case '-' -> System.out.println("Wynik: " + (a - b));
                case '*' -> System.out.println("Wynik: " + (a * b));
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Blad: Dzielenie przez zero!");
                    } else {
                        System.out.println("Wynik: " + (a / b));
                    }
                }
                default -> System.out.println("Blad: Nieznany symbol dzialania!");
            }
            scanner.close();
        }
    }
}