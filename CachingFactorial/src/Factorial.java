public class Factorial {
    // Создаём массив для храниения значений факториала от 0! до 20!
    static long[] table = new long[21];
    // Статический инициализатор который инициализирует первый элемент массива
    static { table[0] = 1;} // факториал 0 = 1
    // запоминаем номер последнего вычисленного факториала
    static int last = 0;
    public static long factorial (int x) throws IllegalArgumentException{
        // Проверяем, не слишком ли мал или велик х. Выдаем исключение,
        // если это оказывется так
        if (x>= table.length)
            throw new IllegalArgumentException("Переполнение: х слишком велик.");
        if (x < 0)
            throw new IllegalArgumentException("х должен быть неотрицательным.");
        // Вычисляем и кэшируем все пока еще несохраненные значения
        while ((last < x)){
            table[last + 1] = table[last] * (last + 1);
            last ++;
        }
        // Возвращаем кэшированный факториал х
        return table[x];
    }
}
