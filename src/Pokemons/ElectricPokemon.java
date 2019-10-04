package Pokemons;

public class ElectricPokemon extends Pokemon implements ElementalPokemon {
    private String weakness;
    private String resistance;
    private String habitat;


    public ElectricPokemon(String name, int level, int attack, int defense, int HP) {
        super(name, level, attack, defense, HP);
        weakness = "Water";
        resistance = "Electric and Grass";
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

    public int basicAttack(){
        return attack;
    }

    public int boltStrike(){
        return attack * 2;
    }

    public void shield(){
        defense += 20;
    }
}
