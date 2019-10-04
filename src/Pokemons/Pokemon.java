package Pokemons;

public class Pokemon implements Comparable<Pokemon> {
    protected String name;
    protected int level;
    protected int attack;
    protected int defense;
    protected int HP;

    public Pokemon(String name, int level, int attack, int defense, int HP) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }


    public int getDefense() {
        return defense;
    }

    public int getHP() {
        return HP;
    }

    public void levelUp() {
        level += 1;
        attack += 50;
        defense += 30;
        HP += 200;
    }


    @Override
    public String toString(){
        return "Name: " + name +
                ", Level: " + level +
                ", Attack: " + attack +
                ", Defense: " + defense +
                ", HP: " + HP;
    }

    @Override
    public int compareTo(Pokemon pokemon) {
        return Integer.compare(this.level, pokemon.level);
    }
}
