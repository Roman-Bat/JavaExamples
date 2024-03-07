import java.io.*;

/**
 * Главный класс приложения.
 */
public class Main {

    /**
     * Точка входа в приложение. Вычисляет и выводит факториал чисел, введенных пользователем.
     *
     * @param args Аргументы командной строки. Не используются.
     * @throws IOException Если происходит ошибка ввода-вывода.
     */
    public static void main(String[] args) throws IOException {
        // Создаем объект BufferedReader для чтения данных с консоли.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Цикл чтения и вычисления факториала чисел, введенных пользователем.
        while (true) {
            // Выводим подсказку для ввода числа.
            System.out.println("Введите число для вычисления факториала> ");

            // Считываем строку, введенную пользователем.
            String line = in.readLine();

            // Если считан конец файла или пользователь ввел "quit", завершаем цикл.
            if ((line == null) || line.equals("quit")) {
                break;
            }

            try {
                // Преобразуем строку в целое число.
                int x = Integer.parseInt(line);

                // Вычисляем и выводим факториал числа.
                System.out.println(x + "! = " + Factorial.factorial(x));
            } catch (Exception e) {
                // Если произошла ошибка преобразования строки в число, выводим сообщение об ошибке.
                System.out.println("Некорректный ввод");
            }
        }
    }
}
