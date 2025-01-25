
public class Pikachu extends Pokemon {
  
  public Pikachu() {
    this.numPokemon = 25;
    this.name = "Pikachu";
    this.type = "Electric";
    this.hp = 20;
    this.strength = 6;
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is pikachu and I attack");
    int life = poke.getHp()- this.strength;
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
