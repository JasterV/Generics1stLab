package Pokemons;

import java.util.Comparator;

public class PokemonComparator implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon p1, Pokemon p2) {
        return Integer.compare(p1.getLevel(), p2.getLevel());
    }
}
