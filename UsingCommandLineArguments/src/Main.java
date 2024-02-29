/**
 * Программа позволяет отобразить переданные ей аргументы при запуске.
 * Для этого в параметрах запуска программы через меню EDIT задаем аргументы
 * Program argumets. Если не задать параметры, то ничего не будет выведено
 */

public class Main {
    public static void main(String[] args) {
        int i = 0;
        // используем цикл while для практики, можно было обойтись и for
        while (i < args.length){

            System.out.println(args[i] + " ");
            i++;
        }
        System.out.println();
    }
}