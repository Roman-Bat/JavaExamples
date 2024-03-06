/**
 * Программа расчитывает факторил числа заданного изначально.
 * Если число меньше нуля то выводится сообщение что такого факториала не существует
 * Для решения создадим дополнительный метод Factorial
 */
public class Main {
    public static void main(String[] args) {
        // Вызываем метод факториала и передаем ему число
        Factorial(5);
    }
    public static int Factorial (int x){
        int factorial = 1;
        if(x >= 0) {
            for (int i = 1; i <= x; i++) {
                factorial *= i;
                System.out.print(factorial + " ");
            }
            System.out.printf("\nФакториал числа %d равен %d", x, factorial);
        }
        else {
            System.out.println("Факториала такого числа не существует");
        }

        return factorial;
    }
}