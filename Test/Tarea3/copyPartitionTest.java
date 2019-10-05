package Tarea3;

import Pokemons.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class copyPartitionTest {
    private Pokemon pivot = new Pokemon("Lapras", 70);

    @Test
    void test_copyPartition_Comparable() {
        List<WaterPokemon> wp = new ArrayList<>();
        List<Pokemon> p1 = new ArrayList<>();
        List<Pokemon> p2 = new ArrayList<>();

        wp.add(new WaterPokemon("Poliwag", 43));
        wp.add(new WaterPokemon("Psyduck", 13));
        wp.add(new WaterPokemon("Goldeen", 20));
        wp.add(new WaterPokemon("Gyarados", 83));

        Partitioner.copyPartition(wp, pivot, p1, p2);
        assertTrue(checkFirstList(p1, pivot));
        assertTrue(checkSecondList(p2, pivot));
    }

    @Test
    void test_copyPartition_Comparator() {
        PokemonComparator comp = new PokemonComparator();
        List<GrassPokemon> gp = new ArrayList<>();
        List<Pokemon> p1 = new ArrayList<>();
        List<Pokemon> p2 = new ArrayList<>();

        gp.add(new GrassPokemon("Exeggcute", 60));
        gp.add(new GrassPokemon("Chikorita", 34));
        gp.add(new GrassPokemon("Bellossom", 72));
        gp.add(new GrassPokemon("Sceptile", 82));
        gp.add(new GrassPokemon("Shiftry", 90));

        Partitioner.copyPartition(gp, pivot, p1, p2, comp);
        assertTrue(checkFirstList(p1, pivot));
        assertTrue(checkSecondList(p2, pivot));
    }

    <E extends Comparable<E>> boolean checkFirstList(List<E> l1, E pivot) {
        for (E elem : l1) {
            if (elem.compareTo(pivot) > 0) {
                return false;
            }
        }
        return true;
    }

    <E extends Comparable<E>> boolean checkSecondList(List<E> l1, E pivot) {
        for (E elem : l1) {
            if (elem.compareTo(pivot) <= 0) {
                return false;
            }
        }
        return true;
    }
}