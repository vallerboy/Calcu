import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Lenovo on 09.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Każdorazowa odpowiedź usera, bedzie w tej zmiennej
        String response = "";
        System.out.println("Witaj w Calc 2.0");

        System.out.println();

        do{
            //Wypisujemy menu
            System.out.println("1 - dodawanie");
            System.out.println("2 - mnożenie");
            System.out.println("3 - dzielenie");
            System.out.println("4 - odejmowanie");
            System.out.println("5 - potęga");
            System.out.println("6 - pierwiastek");

            System.out.println();
            JOptionPane.showMessageDialog(null, "test");

            //pobieramy odpowiedź
            System.out.print("Podaj: ");
            response = scanner.nextLine();

            System.out.println();


            System.out.print("Podaj liczby rozdzielone spacja: ");
            String[] numbers = scanner.nextLine().split(" ");

            System.out.println();

            switch(response){
                case "1":{
                    int operation = 0;
                    for(String number : numbers){
                        operation += Integer.parseInt(number);
                    }
                    System.out.println("Wynik to: " + operation);
                    break;
                }
                case "2": {
                    int operation = 1;
                    for(String number : numbers){
                        operation *= Integer.parseInt(number);
                    }
                    System.out.println("Wynik to: " + operation);
                    break;
                }
                case "3": {
                    double operation = Integer.parseInt(numbers[0]);

                    for (int i = 1; i < numbers.length; i++) {
                        operation /= Integer.parseInt(numbers[i]);
                    }
                    System.out.println("Wynik to: " + operation);
                    break;
                }
                case "4": {
                    int operation = Integer.parseInt(numbers[0]);

                    for (int i = 1; i < numbers.length; i++) {
                        operation -= Integer.parseInt(numbers[i]);
                    }
                    System.out.println("Wynik to: " + operation);
                    break;
                }
                case "5": {
                    if(numbers.length > 2){
                        System.out.println("Liczba pierwsza to podstawa, druga to wykładnik!");
                        System.out.println("Podałeś za dużo liczb!");
                        break;
                    }
                    int operation = Integer.parseInt(numbers[0]);

                    for (int i = 1; i < Integer.parseInt(numbers[1]); i++) {
                        operation *= operation;
                    }
                    System.out.println("Wynik to: " + operation);
                    break;
                }
                case "6": {
                    if(numbers.length > 1){
                        System.out.println("Dozwolona tylko jedna liczba!");
                        break;
                    }

                    System.out.println("Wynik to: " + Math.sqrt(Integer.parseInt(numbers[0])));
                    break;
                }
            }


        }while (!response.equals("exit"));

        System.out.println("Dzięki za skorzystanie! Papa!");
    }
}
