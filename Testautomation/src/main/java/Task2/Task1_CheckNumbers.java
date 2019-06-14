package Task2;                            //  ЗАДАЧА 2.1
    import java.util.*;
import java.lang.*;

    public class Task1_CheckNumbers {

        private static void check(String number) {

            for (int i = 0; i < number.length(); ++i) {

                if (i > 0 && number.charAt(i) <= number.charAt(i - 1)) {
                    System.out.println("Requirement isn`t met ");
                    return;


                } }System.out.println("Requirement is met ");



            }
        public static void main(String[] args) {


            System.out.println("Enter numbers for check or keyword `exit` for exit.");
                    System.out.println( "The number should contain not more than 6 numerals. ");
            String number =" ";
            while (ClassForBoolean.insteadTrue(number)) {

              Scanner  sc = new Scanner(System.in);
              number = sc.nextLine();
                // Используем метод из соседнего класса, возвращающий true
                if (number.equals("exit")) {
                    break;
                }
               else check(number);

            }
        }

    }