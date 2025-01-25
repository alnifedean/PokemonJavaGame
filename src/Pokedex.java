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

    pokemonList.add(bulbasaur);
    pokemonList.add(charmander);
    pokemonList.add(vamoACalmarno);
    pokemonList.add(pikachu);
  }
  

  public ArrayList<Pokemon> filterP() {
    int indexRandom1 = random.nextInt(pokemonList.size());
    int indexRandom2 = random.nextInt(pokemonList.size());

    pokemonFiltered.add(pokemonList.get(indexRandom1));
    pokemonFiltered.add(pokemonList.get(indexRandom2));

    return pokemonFiltered;
  }
}
