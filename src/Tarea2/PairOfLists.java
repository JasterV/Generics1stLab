package Tarea2;

import java.util.List;

public class PairOfLists<E> {
    private List<E> l1;
    private List<E> l2;

    public PairOfLists(List<E> l1, List<E> l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public List<E> getFirst() {
        return l1;
    }

    public List<E> getSecond() {
        return l2;
    }
}
