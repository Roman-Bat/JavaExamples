/** Эта программа вычисляет факториал и кэширует результаты в таблице
 * для дальнейшего употребления. 20! - это самый большой факториал, который
 * мы можем вычеслить прибегая к типу данных long.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(20));
        for (int i = 0; i < 20; i ++){
            System.out.printf("Факториал %d равен %d \n", i, Factorial.table[i]);
        }

    }
}