package HomeWork.Loop;
import java.util.concurrent.ThreadLocalRandom;
public class Ex_6 {
    /*
    Напишите класс, который выводит на экран все положительные двузначные числа
    (выберите самостоятельно - в возрастающем или убы
    вающем порядке), произведение цифр которых является тоже двузначным числом.
     */

    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            int i1 = i/10;
            int i2 = i%10;
            if (i1 * i2 >= 10 && i1 * i2 < 100) {
                System.out.print(i + " ");
            }
        }
    }
}
