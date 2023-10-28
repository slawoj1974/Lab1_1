import java.util.Scanner;
public class StudentDaneZKlawiatury
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // tworzony jest obiekt klasy Scanner
        System.out.print("Jak masz na imię? ");    // wyświetlenie komunikatu
        String imie = scanner.nextLine();          // wczytanie danych z klawiatury do zmiennej
        System.out.print("Jak masz na nazwisko? ");
        String nazwisko = scanner.nextLine();
        System.out.print("Gdzie mieszkasz? ");
        String adres = scanner.nextLine();

        System.out.println("Imie: " + imie);       // wyświetlenie na ekranie danych wprowadzonych do zmiennych
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Adres: " + adres);

        scanner.close();    // zamknięcie obiektu scanner
    }

}
