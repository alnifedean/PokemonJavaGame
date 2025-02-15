package Pokemons;

public class Gastly extends Pokemon {

  public Gastly(){
    super(92, "Gastly", "Ghost/Poison", 18, 8, "Psychic" , "Bug", "Fairy", "Grass", null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is gastly and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is gastly and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is gastly and I run");
  }
}
