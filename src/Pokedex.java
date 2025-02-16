import java.util.ArrayList;
import java.util.Random;
import Pokemons.*;

public class Pokedex {
  
  ArrayList<Pokemon> pokemonList;
  ArrayList<Pokemon> pokemonFiltered;
  Random random = new Random();
  
  
  public Pokedex() {
    pokemonList = new ArrayList<>();
    pokemonFiltered = new ArrayList<>();

    pokemonList.add(new Bulbasaur());
    pokemonList.add(new Charmander());
    pokemonList.add(new Squirtle());
    pokemonList.add(new Pikachu());
    pokemonList.add(new Abra());
    pokemonList.add(new Caterpie());
    pokemonList.add(new Clefairy());
    pokemonList.add(new Dewgong());
    pokemonList.add(new Dratini());
    pokemonList.add(new Gastly());
    pokemonList.add(new Geodude());
    pokemonList.add(new Mankey());
    pokemonList.add(new Pidgey());
    pokemonList.add(new Sandshrew());
  }

  public ArrayList<Pokemon> filterP() {
    int indexRandom1 = random.nextInt(pokemonList.size());
    int indexRandom2 = random.nextInt(pokemonList.size());

    pokemonFiltered.add(pokemonList.get(indexRandom1));
    pokemonFiltered.add(pokemonList.get(indexRandom2));

    return pokemonFiltered;
  }
}
