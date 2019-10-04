package Tarea1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionerTest {

    @Test
    void test1_partition() {
        int pivot = 20;
        List<Integer> lint = List.of(1, 23, 5, 42, 10, 3, 54, 22, 6);
        PairOfLists pair = Partitioner.partition(lint, pivot);
        assertTrue(checkFirstList(pair.getFirst(), pivot));
        assertTrue(checkSecondList(pair.getSecond(), pivot));
    }

    @Test
    void test2_partition(){
        int pivot = 30;
        List<Integer> lint = List.of(32, 45, 76, 92, 43, 56, 123);
        PairOfLists pair = Partitioner.partition(lint, pivot);
        assertTrue(checkFirstList(pair.getFirst(), pivot));
        assertTrue(checkSecondList(pair.getSecond(), pivot));
    }

    boolean checkFirstList(List<Integer> lint, int pivot){
        for(Integer num : lint) {
            if (num > pivot) {
                return false;
            }
        }
        return true;
    }

    boolean checkSecondList(List<Integer> lint, int pivot){
        for(Integer num : lint) {
            if (num <= pivot) {
                return false;
            }
        }
        return true;
    }
}