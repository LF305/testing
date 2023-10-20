public class Pokedex {
    String type, name;
    double power, currentHealth, maxHealth, defence, level, attackStats, spAttack, spDefense;
    public Pokedex(String name, double maxHealth, double attackStats, double spAttack, double spDefense, double defence, String move1, String move2, String move3, String move4, double level){
        this.type = type;
        this.name = name;
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.level = level;
        this.attackStats = attackStats;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
    }

    public double getMaxHP(){
        return maxHealth;
    }
    public double getAttackStats(){
        return attackStats;
    }
    public double getDefence(){
        return defence;
    }
    public double addLevel(){
        return level++;
    }
    public double level(){
        return level;
    }
    public double getSpAttack(){
        return spAttack;
    }
    public double getSpDefense(){
        return spDefense;
    }

    //The Name, Max Health Points, Attack Stat, Defence Stat, and 2 Moves will be initialized in the constructor
    // Example Pokemon
    //Pokemon myPokemon = new Pokemon("Bulbasaur", 45, 49, 49, move1, move2);


    
}