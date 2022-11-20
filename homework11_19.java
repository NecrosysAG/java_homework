import java.util.Scanner;

public class homework11_19 {
    public static void main(String[] args) {

        //First level: Level1:
        //1) В программу (в консоль) вводится строка. Найдите длину строки, если она больше 10,
        //то выведите true, иначе false

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        boolean answer = (x.length()) > 10;
        System.out.println(answer);

        //2) В программу (в консоль) вводится строка. Если первый и последний символ равны -
        //выведите true, иначе false

        Scanner scanner1 = new Scanner(System.in);
         String y = scanner.nextLine();

         System.out.println(y.charAt(0) );
         System.out.println(y.charAt(y.length() -1));

         Boolean finish = (y.charAt(0) ) == (y.charAt(y.length() -1));
         System.out.println(finish);

        //Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз,
        //равное введенному числу

      Scanner scanner2 = new Scanner(System.in);

      int cicle = scanner.nextInt();
      while (cicle !=0) {
          System.out.println("I can use cycles" );
          cicle --;
      }

        //Если строка "Как дела?", то в ней 9 символов, значит ответ будет: K K K K K K K K K

        Scanner scanner3 = new Scanner(System.in);
        String enter = scanner.nextLine();
        int lenght = enter.length();
        while (lenght !=0) {
            System.out.println(enter.charAt(0));
            lenght --;
        }

        //Level2:
        //В программу вводится строка из двух букв A и B, замените все буквы A на B, а все B на A.
        //Например ABBA -> BAAB

        Scanner scanner4 = new Scanner(System.in);
















    }
}
