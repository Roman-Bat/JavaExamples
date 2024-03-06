/**
 * Рекурсивное вычисление факториала
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
    public static long Factorial(int x){
        if (x < 0) throw new IllegalArgumentException("x должен быть больше 0");
        if (x <= 1) return 1;
        else return x * Factorial(x - 1);
    }
}