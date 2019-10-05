package Pokemons;

public class GrassPokemon extends Pokemon implements ElementalPokemon {

    private String weakness;
    private String resistance;
    private String habitat;

    public GrassPokemon(String name, int level) {
        super(name, level);
        weakness = "Fire";
        resistance = "Rock and Water";
        habitat = "Grassland and Forest";
    }

    @Override
    public String getElement() {
        return "Grass";
    }

    @Override
    public String getWeakness() {
        return weakness;
    }

    @Override
    public String getResistances() {
        return resistance;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: " + "Grass" +
                ", weakness: " + weakness +
                ", resistance: " + resistance +
                ", Main habitat: " + habitat;
    }
}
