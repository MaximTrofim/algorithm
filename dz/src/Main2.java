import array.Array;
import array.ArrayImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static void main(String[] args) {
        final int capacity = 500000;

        Array<Integer> array = new ArrayImpl<>(capacity);
        Array<Integer> array2 = new ArrayImpl<>(capacity);
        Array<Integer> array3 = new ArrayImpl<>(capacity);

        //заполняем массивы случайными данными
        final Random random = new Random();

        for (int i = 0; i < capacity; i++) {
            array.add(random.nextInt(capacity));
        }
        for (int i = 0; i < capacity; i++) {
            array2.add(random.nextInt(capacity));
        }

        for (int i = 0; i < capacity; i++) {
            array3.add(random.nextInt(capacity));
        }

        //сортировки с замером времени
        long time1 = System.nanoTime();
        array.sortBubble();
        long time2 = System.nanoTime();
        System.out.print("Сортировка пузырьком. Время в миллисекундах: ");
        System.out.println(TimeUnit.NANOSECONDS.toMillis(time2 - time1));

        time1 = System.nanoTime();
        array2.sortSelect();
        time2 = System.nanoTime();
        System.out.print("Сортировка выбором. Время в миллисекундах: ");
        System.out.println(TimeUnit.NANOSECONDS.toMillis(time2 - time1));

        time1 = System.nanoTime();
        array3.sortInsert();
        time2 = System.nanoTime();
        System.out.print("Сортировка вставкой. Время в миллисекундах: ");
        System.out.println(TimeUnit.NANOSECONDS.toMillis(time2 - time1));

    }
}