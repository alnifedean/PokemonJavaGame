import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Interf.Constants;
import Pokemons.Pokemon;

public class App {
    static int maxL = Constants.MAX_LEVEL;
    public static void main(String[] args) throws Exception {

        Pokedex pokeSelection = new Pokedex();
        List<Pokemon> FilterP = pokeSelection.filterP();

        Menu screen = new Menu();
        String win = screen.menu(FilterP);



        File archive = new File("Levels.txt");
        archive.createNewFile();
        
        FileReader read = new FileReader(archive);

        List<String> lines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(read)) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] pokeLeveList = line.split("-");
                if (pokeLeveList[0].equals(win)) {
                    int points = Integer.parseInt(pokeLeveList[1]);
                    if (points<maxL){points++;}
                    line = pokeLeveList[0] + "-" + points;
                }
                lines.add(line);
            }    
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter write = new FileWriter(archive, false)) {
            for (String updatedLine : lines) {
                write.write(updatedLine + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}