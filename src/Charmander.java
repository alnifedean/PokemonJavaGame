public class Charmander extends Pokemon {

  public Charmander () {
    this.numPokemon = 4;
    this.name = "charmander";
    this.type = "fuego";
    this.hp = 8;
    this.strength = 4;
  }

  @Override
  public void attack() {
    System.out.println("Me llamo charmander y ataco");
  }

  @Override
  public void heal() {
    System.out.println("Me llamo charmander y me curo");
  }

  @Override
  public void run() {
    System.out.println("Me llamo charmander y huyo");
  }

}
