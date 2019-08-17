package dz_Lesson_3.dequeue;

import dz_Lesson_3.queue.QueueImpl;

public class DequeueImpl<E> extends QueueImpl<E> implements Dequeue<E> {

    public DequeueImpl(int maxSize){
        super(maxSize);
    }

    public boolean insertRight(E value) {
        return super.insert(value);
    }

    //removeleft
    public E removeLeft() {
        return super.remove();
    }

    //insertleft
    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (head == data.length) {
            head = DEFAULT_HEAD;
        }
        for (int i = size - 1; i >= 0; i--) {
            data[i + 1] = data[i];
        }
        data[head] = value;
        size++;
        return true;
    }

    //removeright
    @Override
    public E removeRight() {
        return isEmpty() ? null : data[--size];
    }


}
