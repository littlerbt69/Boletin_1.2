import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Preguntar al usuario su tipo de Pokémon favorito
        System.out.println("¿Cuál es tu tipo de Pokémon favorito? (fuego, agua o planta): ");
        String tipoPokemon = teclado.nextLine();

        // Sugerir un Pokémon según la elección del usuario
        String pokemonSugerido = "";
        if (tipoPokemon.equals("fuego")) {
            pokemonSugerido = "Charmander";
        } else if (tipoPokemon.equals("agua")) {
            pokemonSugerido = "Squirtle";
        } else if (tipoPokemon.equals("planta")) {
            pokemonSugerido = "Bulbasaur";
    } else {
            System.out.println("Tipo de Pokémon no reconocido.");
            return;
        }

        // Imprimir la sugerencia de Pokémon
        System.out.println("Tu Pokémon favorito de tipo " + tipoPokemon + " podría ser " + pokemonSugerido + ".");
    }
}
