public class Squirtle extends Pokemon {
  
  public Squirtle(int numPokemon, String name, String type, int hp, int strength) {
    super(numPokemon, name, type, hp, strength);
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
