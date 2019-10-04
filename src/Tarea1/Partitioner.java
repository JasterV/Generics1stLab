package Tarea1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Partitioner {
    public static PairOfLists partition(List<Integer> src, int pivot){
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Iterator<Integer> it = src.iterator();
        while(it.hasNext()){
            int number = it.next();
            if (number <= pivot) l1.add(number);
            else l2.add(number);
        }
        return new PairOfLists(l1, l2);
    }
}
