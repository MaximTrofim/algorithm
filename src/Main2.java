import array.Array;
import array.ArrayImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main2 {
    final static int capacity = 1000;
    public static void main(String[] args) {


        Array<Integer> array = new ArrayImpl<>(capacity);
        Array<Integer> array2 = new ArrayImpl<>(capacity);
        Array<Integer> array3 = new ArrayImpl<>(capacity);

        //заполняем массивы случайными данными

        random(array,array2,array3);
        array.display();
        array2.display();
        array3.display();
        //final Random random = new Random();

//        for (int i = 0; i < capacity; i++) {
//            int val = random.nextInt(capacity);
//            array.add(val);
//            array2.add(val);
//            array3.add(val);
//        }
//        array.display();
//        array2.display();
//        array3.display();
//        for (int i = 0; i < capacity; i++) {
//            array2.add(random.nextInt(capacity));
//        }
//
//        for (int i = 0; i < capacity; i++) {
//            array3.add(random.nextInt(capacity));
//        }

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
    public static void random(Array... arr){
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            int value = random.nextInt(capacity);
            for (Array t : arr) {
                t.add(value);
            }
        }
    }
}