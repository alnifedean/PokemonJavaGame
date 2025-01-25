public class Charmander extends Pokemon {

  public Charmander () {
    this.numPokemon = 4;
    this.name = "Charmander";
    this.type = "Fire";
    this.hp = 17;
    this.strength = 8;
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is charmander and I attack");
    int life = poke.getHp()- this.strength;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is charmander and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is charmander and I run");
  }

}
