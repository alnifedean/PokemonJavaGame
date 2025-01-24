public class Pikachu extends Pokemon {
  
  public Pikachu(int numPokemon, String name, String type, int hp, int strength) {
    super(numPokemon, name, type, hp, strength);
  }

  @Override
  public void attack() {
    System.out.println("Me llamo pikachu y ataco");
  }

  @Override
  public void heal() {
    System.out.println("Me llamo pikachu y me curo");
  }

  @Override
  public void run() {
    System.out.println("Me llamo pikachu y huyo");
  }


}
