public class Squirtle extends Pokemon {
  
  public Squirtle() {
    this.numPokemon = 7;
    this.name = "squirtle";
    this.type = "agua";
    this.hp = 12;
    this.strength = 2;
  }

  @Override
  public void attack() {
    System.out.println("Me llamo squirtle y ataco");
  }

  @Override
  public void heal() {
    System.out.println("Me llamo squirtle y me curo");
  }

  @Override
  public void run() {
    System.out.println("Me llamo squirtle y huyo");
  }

}
