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

    pokemonList.add(new GrassPoisonPokemon(1, "Bulbasaur", "Grass/Poison", 28, 2, "Water" , "Ground", "Rock", "Grass", "Fairy", null, null));
    pokemonList.add(new FirePokemon(4, "Charmander", "Fire", 17, 8, "Grass" , "Bug", "Ice", "Steel", null, null, null));
    pokemonList.add(new WaterPokemon(7, "Squirtle", "Water", 24, 4, "Fire", "Ground", "Rock", null, null, null, null));
    pokemonList.add(new ElectricPokemon(25, "Pikachu", "Electric", 20, 6, "Water" , "Flying", null, null, null, null, null));
    pokemonList.add(new PsychicPokemon(63, "Abra", "Psychic", 22, 8, "Fighting" , "Poison", null, null, null, null, null));
    pokemonList.add(new BugPokemon(10, "Caterpie", "Bug", 28, 2, "Grass" , "Psychic", null, null, null, null, null));
    pokemonList.add(new FairyPokemon(35, "Clefairy", "Fairy", 32, 1, "Fighting" , "Dragon", null, null, null, null, null));
    pokemonList.add(new WaterIcePokemon(87, "Dewgong", "Water/Ice", 24, 4, "Fire" , "Ground", "Rock", "Grass", "Flying", "Dragon", null));
    pokemonList.add(new DragonPokemon(147, "Dratini", "Dragon", 22, 8, "Dragon" , null, null, null, null, null, null));
    pokemonList.add(new GhostPoisonPokemon(92, "Gastly", "Ghost/Poison", 18, 8, "Psychic" , "Bug", "Fairy", "Grass", null, null, null));
    pokemonList.add(new RockGroundPokemon(74, "Geodude", "Rock/Ground", 22, 6, "Fire", "Flying", "Ice", "Bug", "Poison", "Rock", "Electric"));
    pokemonList.add(new FightingPokemon(56, "Mankey", "Fighting", 20, 6, "Normal", "Ice", "Rock", null, null, null, null));
    pokemonList.add(new NormalFlyingPokemon(16, "Pidgey", "Normal/Flying", 20, 8, "Grass" , "Bug", "Fighting", null, null, null, null));
    pokemonList.add(new GroundPokemon(27, "Sandshrew", "Ground", 28, 2, "Electric" , "Fire", "Poison", "Rock", null, null, null));
  }

  public ArrayList<Pokemon> filterP() {
    int indexRandom1 = random.nextInt(pokemonList.size());
    int indexRandom2 = random.nextInt(pokemonList.size());

    pokemonFiltered.add(pokemonList.get(indexRandom1));
    pokemonFiltered.add(pokemonList.get(indexRandom2));

    return pokemonFiltered;
  }
}
