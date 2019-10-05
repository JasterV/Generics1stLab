package Pokemons;

public class WaterPokemon extends Pokemon implements ElementalPokemon {
    private String weakness;
    private String resistance;
    private String habitat;

    public WaterPokemon(String name, int level) {
        super(name, level);
        weakness = "Grass";
        resistance = "Fire";
        habitat = "Sea and water's edge";
    }

    @Override
    public String getElement() {
        return "Water";
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
                ", Type: " + "Water" +
                ", weakness: " + weakness +
                ", resistance: " + resistance +
                ", Main habitat: " + habitat;
    }
}
