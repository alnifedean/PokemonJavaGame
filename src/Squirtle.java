public class Squirtle extends Pokemon {
  
  public Squirtle() {
    this.numPokemon = 7;
    this.name = "Squirtle";
    this.type = "Water";
    this.hp = 24;
    this.strength = 4;
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is squirtle and I attack");
    int life = poke.getHp()- this.strength;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is squirtle and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is squirtle and I run");
  }

}
