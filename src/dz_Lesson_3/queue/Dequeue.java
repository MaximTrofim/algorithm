package dz_Lesson_3.queue;

public class Dequeue<E extends Object & Comparable<? super E>> extends QueueImpl<E> {

    private static final int DEFAULT_TAIL = -1;
    private static final int DEFAULT_HEAD = 0;

    public Dequeue(int maxCapacity) {
        super(maxCapacity);
        this.head = DEFAULT_HEAD;
        this.tail = DEFAULT_TAIL;
    }

    //insertright
    // dequeue.insert(5); этот метод наследуется из очереди и нам подходит, его мы не переопределяем
    //можно его не отображать, но что бы не запутаться я оставлю его здесь
    //@Override
    public boolean insertRight(E value) {
        if (isFull())
            return false;

        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    //removeleft
    //dequeue.remove();этот метод наследуется из очереди и нам подходит, его мы не переопределяем
    //можно его не отображать, но что бы не запутаться я оставлю его здесь

    //@Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E value = data[head++];
        size--;
        return value;
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

