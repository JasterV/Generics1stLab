package Tarea1;

import java.util.List;

public class PairOfLists {

    private List<Integer> l1;
    private List<Integer> l2;

    public PairOfLists(List<Integer> l1, List<Integer> l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public List<Integer> getFirst(){
        return l1;
    }

    public List<Integer> getSecond() {
        return l2;
    }
}
