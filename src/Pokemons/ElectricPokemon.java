package Pokemons;

public class ElectricPokemon extends Pokemon implements ElementalPokemon {
    private String weakness;
    private String resistance;
    private String habitat;


    public ElectricPokemon(String name, int level) {
        super(name, level);
        weakness = "Water";
        resistance = "Electric, Grass";
        habitat = "Prairies";
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
    public String getElement() {
        return "Electric";
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Type: " + "Electric" +
                ", weakness: " + weakness +
                ", resistance: " + resistance +
                ", Main habitat: " + habitat;
    }
}
