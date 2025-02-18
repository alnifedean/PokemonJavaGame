package Pokemons;

public class GrassPoisonPokemon extends Pokemon {

  public GrassPoisonPokemon(int numPokemon, String name, String type, int hp, int strength, String strongTo1, String strongTo2, String strongTo3, String strongTo4, String strongTo5, String strongTo6, String strongTo7){ 
    super(numPokemon, name, type, hp, strength, strongTo1, strongTo2, strongTo3, strongTo4, strongTo5, strongTo6, strongTo7);
    // super(1, "Bulbasaur", "Grass/Poison", 28, 2, "Water" , "Ground", "Rock", "Grass", "Fairy", null, null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is "+this.getName()+" and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      int typeDamage = typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    }
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is "+this.getName()+" and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is "+this.getName()+" and I run");
  }
}