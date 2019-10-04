package Tarea2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Partitioner {
    public static <E extends Comparable<E>> PairOfLists<E> partition(List<E> src, E pivot){
        List<E> l1 = new ArrayList<>();
        List<E> l2 = new ArrayList<>();
        for (E element : src) {
            if (element.compareTo(pivot) <= 0) l1.add(element);
            else l2.add(element);
        }
        return new PairOfLists<E>(l1, l2);
    }

    public static <E> PairOfLists<E> partition(List<E> src, E pivot, Comparator<E> comp){
        List<E> l1 = new ArrayList<>();
        List<E> l2 = new ArrayList<>();
        for (E element : src) {
            if (comp.compare(element, pivot) <= 0) l1.add(element);
            else l2.add(element);
        }
        return new PairOfLists<E>(l1, l2);
    }
}
