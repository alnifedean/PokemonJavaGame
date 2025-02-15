package Pokemons;

public class Pikachu extends Pokemon {

  public Pikachu(){
    super(25, "Pikachu", "Electric", 20, 6, "Water" , "Flying", null, null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is pikachu and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is pikachu and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is pikachu and I run");
  }


}
