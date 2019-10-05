package Pokemons;

public class FirePokemon extends Pokemon implements ElementalPokemon {
    private String weakness;
    private String resistance;
    private String habitat;

    public FirePokemon(String name, int level) {
        super(name, level);
        weakness = "Water";
        resistance = "Grass";
        habitat = "Mountain";
    }

    @Override
    public String getElement() {
        return "Fire";
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
                ", Type: " + "Fire" +
                ", weakness: " + weakness +
                ", resistance: " + resistance +
                ", Main habitat: " + habitat;
    }
}
