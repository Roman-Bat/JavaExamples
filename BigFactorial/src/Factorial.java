import java.math.BigInteger;
import java.util.*;
/**
 * Этот класс предоставляет метод для вычисления факториала числа с использованием кэширования.
 */
public class Factorial {
    // ArrayList для хранения факториальных значений. Он работает как кэш.
    protected static ArrayList<BigInteger> table = new ArrayList<>();

    // Статический блок для инициализации кэша с факториалом от 0, который равен 1.
    static {
        table.add(BigInteger.valueOf(1));
    }

    /**
     * Этот метод вычисляет факториал числа.
     * Он использует кэширование для хранения вычисленных факториалов, чтобы избежать избыточных вычислений.
     *
     * @param x Число, для которого нужно вычислить факториал.
     * @return Факториал числа.
     * @throws IllegalArgumentException если x отрицательно.
     */
    public static synchronized BigInteger factorial(int x) {
        // Факториал не определен для отрицательных чисел.
        if (x < 0) {
            throw new IllegalArgumentException("x должно быть неотрицательным числом");
        }

        // Если факториал числа не находится в кэше, вычислить и добавить его.
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastFact = table.get(size - 1);
            BigInteger nextFact = lastFact.multiply(BigInteger.valueOf(size));
            table.add(nextFact);
        }

        // Вернуть факториал из кэша.
        return table.get(x);
    }
}
