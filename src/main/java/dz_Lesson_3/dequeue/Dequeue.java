package dz_Lesson_3.dequeue;

import dz_Lesson_3.queue.Queue;

public interface Dequeue<E> extends Queue<E> {
    boolean insertLeft (E value);
    boolean insertRight (E value);
    E removeLeft();
    E removeRight();

}
