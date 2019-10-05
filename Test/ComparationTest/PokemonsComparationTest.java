package ComparationTest;

import Pokemons.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonsComparationTest {
    @Test
    void test_comparable() {
        ElectricPokemon p1 = new ElectricPokemon("Ampharos", 35);
        WaterPokemon p2 = new WaterPokemon("Blastoise", 36);
        assertEquals(-1, p1.compareTo(p2));
        assertEquals(1, p2.compareTo(p1));

        p1.levelUp();
        assertEquals(0, p1.compareTo(p2));
    }

    @Test
    void test_comparator() {
        PokemonComparator comp = new PokemonComparator();
        Pokemon p1 = new Pokemon("Pikachu", 35);
        GrassPokemon p2 = new GrassPokemon("Bulbasaur", 36);
        assertEquals(-1, comp.compare(p1, p2));
        assertEquals(1, comp.compare(p2, p1));

        p1.levelUp();
        assertEquals(0, comp.compare(p1, p2));
    }
}