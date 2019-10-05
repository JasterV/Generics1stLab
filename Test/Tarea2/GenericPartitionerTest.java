package Tarea2;

import Pokemons.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericPartitionerTest {

    private Pokemon pivot = new Pokemon("WigglyPuff", 15);

    @Test
    void test_partition_comparable(){
        List<Pokemon> pok = new ArrayList<>();
        pok.add(new Pokemon("Pikachu", 20));
        pok.add(new GrassPokemon("Bulbasaur", 10));
        pok.add(new WaterPokemon("Squirtle", 30));
        pok.add(new FirePokemon("Charmander", 5));
        PairOfLists<Pokemon> pair = Partitioner.partition(pok, pivot);
        assertTrue(checkFirstList(pair.getFirst(), pivot));
        assertTrue(checkSecondList(pair.getSecond(), pivot));
    }

    @Test
    void test_partition_comparator(){
        List<Pokemon> pok = new ArrayList<>();
        pok.add(new Pokemon("Pikachu", 20));
        pok.add(new ElectricPokemon("Raichu", 10));
        pok.add(new WaterPokemon("Squirtle", 30));
        pok.add(new FirePokemon("Charmander", 5));
        PairOfLists<Pokemon> pair = Partitioner.partition(pok, pivot, new PokemonComparator());
        assertTrue(checkFirstList(pair.getFirst(), pivot));
        assertTrue(checkSecondList(pair.getSecond(), pivot));
    }


    <E extends Comparable<E>> boolean checkFirstList(List<E> l1, E pivot){
        for(E elem : l1) {
            if (elem.compareTo(pivot) > 0) {
                return false;
            }
        }
        return true;
    }

   <E extends Comparable <E>> boolean checkSecondList(List<E> l1, E pivot){
        for(E elem : l1) {
            if (elem.compareTo(pivot) <= 0) {
                return false;
            }
        }
        return true;
    }



}