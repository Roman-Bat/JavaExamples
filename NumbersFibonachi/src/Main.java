/**
 * Программы выводит пользователю числа Фибоначи от 1
 * Каждый его элемент формируется как сумма двух предыдущих элементов
 */
public class Main {
    public static void main(String[] args) {
        // Инициализация переменных
        int n0 = 1, n1 = 1, n2 = 0;
        // Выводим первые элементы
        System.out.print(n0 + " ");
        System.out.print(n1 + " ");
        // В цикле суммируем элементы
        for(int i = 1; i < 18; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}