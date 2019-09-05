package dz_lesson_6;

import dz_Lesson_3.ICollection;

public interface Tree<E> extends ICollection {

    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }

    boolean find(E value);

    boolean add(E value);

    boolean remove(E value);

    void display();

    boolean isBalanced();

    void traverse(TraverseMode mode);

}

