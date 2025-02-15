package Pokemons;

public class Bulbasaur extends Pokemon {

  public Bulbasaur(){
    super(1, "Bulbasaur", "Grass/Poison", 28, 2, "Water" , "Ground", "Rock", "Grass", "Fairy", null, null);
  }
  

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is bulbasaur and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is bulbasaur and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is bulbasaur and I run");
  }
}