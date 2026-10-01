//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("hello World");
    System.out.println("hello World");

//  Zadanie1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");
// Zadanie2
    String imie = "Jerzy";
    int rokUrodzenia = 2006;
    double czasDoMatury = 0.66;
//Zadanie3
    int obecnyRok = Year.now().getValue();

    int wiek = obecnyRok - rokUrodzenia;

    System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat i będę pisać maturę za " + czasDoMatury + " roku.");

}