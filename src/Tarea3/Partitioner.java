package Tarea3;

import java.util.Comparator;
import java.util.List;

public class Partitioner {

    public static <E extends Comparable<? super E>> void copyPartition(List<? extends E> src, E pivot, List<? super E> trg1, List<? super E> trg2){
        for (E elem: src) {
            if(elem.compareTo(pivot) <= 0) trg1.add(elem);
            else trg2.add(elem);
        }
    }

    public static <E> void copyPartition(List<? extends E> src, E pivot, List<? super E> trg1, List<? super E> trg2, Comparator<E> comp){
        for (E elem: src) {
            if(comp.compare(elem, pivot) <= 0) trg1.add(elem);
            else trg2.add(elem);
        }
    }
}
