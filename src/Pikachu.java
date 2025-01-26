
public class Pikachu extends Pokemon {
  
  public Pikachu() {
    this.numPokemon = 25;
    this.name = "Pikachu";
    this.type = "Electric";
    this.hp = 20;
    this.strength = 6;
    this.strongTo1 = "Water";
    this.strongTo2 = "Flying";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is pikachu and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
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
