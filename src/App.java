public class App {
    public static void main(String[] args) throws Exception {
        
        Bulbasaur bulba = new Bulbasaur(1, "bulbasaur", "planta", 14, 1);
        Charmander charm = new Charmander(4, "charmander", "fuego", 8, 4);
        Squirtle vamoACalmarno = new Squirtle(7, "squirtle", "agua", 12, 2);
        Pikachu pika = new Pikachu(25, "pikachu", "electrico", 10, 3);

        Menu screen = new Menu();
        screen.menu(pika, bulba);

    }
}
