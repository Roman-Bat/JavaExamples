/**
 * Игра, в которой, если число делится на 5, программа выдает значение Fizz
 * если число делится на 7, программа выдаёт значение Buzz
 * Если и на 5 и на 7, программа выдаёт значение FizzBuzz
 */

public class Main {
    public static void main(String[] args) {
        // Создаём цикл, который проходит по числам от 0 до 100
        for(int i = 0; i <= 100; i++){
            // В цикле проверяем делимость числа на 5 или на 7
            if (i % 5 == 0 && i % 7 == 0){
                System.out.printf("[%d] FizzBuzz\n", i);
            } else if (i % 5 == 0) {
                System.out.printf("[%d] Fizz\n", i);
            } else if (i % 7 == 0) {
                System.out.printf("[%d] Buzz\n", i);
            }
            else {
                System.out.printf("[%d] Nothing\n", i);
            }
        }
    }
}