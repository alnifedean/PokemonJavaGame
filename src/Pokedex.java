import java.util.ArrayList;
import java.util.Random;

public class Pokedex {
  
  ArrayList<Pokemon> pokemonList;
  ArrayList<Pokemon> pokemonFiltered;
  Random random = new Random();
  
  
  public Pokedex() {
    pokemonList = new ArrayList<>();
    pokemonFiltered = new ArrayList<>();

    Bulbasaur bulbasaur = new Bulbasaur();
    Charmander charmander = new Charmander();
    Squirtle vamoACalmarno = new Squirtle();
    Pikachu pikachu = new Pikachu();
    Abra abra = new Abra();
    Caterpie caterpie = new Caterpie();
    Clefairy clefairy = new Clefairy();
    Dewgong dewgong = new Dewgong();
    Dratini dratini = new Dratini();
    Gastly gastly = new Gastly();
    Geodude geodude = new Geodude();
    Mankey mankey = new Mankey();
    Pidgey pidgey = new Pidgey();
    Sandshrew sandshrew = new Sandshrew();

    pokemonList.add(bulbasaur);
    pokemonList.add(charmander);
    pokemonList.add(vamoACalmarno);
    pokemonList.add(pikachu);
    pokemonList.add(abra);
    pokemonList.add(caterpie);
    pokemonList.add(clefairy);
    pokemonList.add(dewgong);
    pokemonList.add(dratini);
    pokemonList.add(gastly);
    pokemonList.add(geodude);
    pokemonList.add(mankey);
    pokemonList.add(pidgey);
    pokemonList.add(sandshrew);
  }
  

  public ArrayList<Pokemon> filterP() {
    int indexRandom1 = random.nextInt(pokemonList.size());
    int indexRandom2 = random.nextInt(pokemonList.size());

    pokemonFiltered.add(pokemonList.get(indexRandom1));
    pokemonFiltered.add(pokemonList.get(indexRandom2));

    return pokemonFiltered;
  }
}
