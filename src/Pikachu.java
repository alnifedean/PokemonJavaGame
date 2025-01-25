
public class Pikachu extends Pokemon {
  
  public Pikachu() {
    this.numPokemon = 25;
    this.name = "pikachu";
    this.type = "electrico";
    this.hp = 10;
    this.strength = 3;
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
