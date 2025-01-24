public class Bulbasaur extends Pokemon {
  
  public Bulbasaur(int numPokemon, String name, String type, int hp, int strength) {
    super(numPokemon, name, type, hp, strength);
  }

  @Override
  public void attack() {
    System.out.println("Me llamo bulbasaur y ataco");
  }

  @Override
  public void heal() {
    System.out.println("Me llamo bulbasaur y me curo");
  }

  @Override
  public void run() {
    System.out.println("Me llamo bulbasaur y huyo");
  }
}


