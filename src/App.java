import java.util.ArrayList;
import Pokemons.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokedex pokeSelection = new Pokedex();
        ArrayList<Pokemon> FilterP = pokeSelection.filterP();

        Menu screen = new Menu();
        screen.menu(FilterP);
        
    }
}
