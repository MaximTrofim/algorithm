package dz_Lesson_3.queue;


import dz_Lesson_3.ICollection;

public interface Queue<E> extends ICollection {

    boolean insert(E value);

    E remove();

    E peek();


}