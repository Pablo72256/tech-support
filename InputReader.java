import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Lee una linea de texto de la entrada estandar (el terminal
     * de texto) y la devuelve en forma de un conjunto de palabras
     * 
     * @return Un conjunto de objetos String, donde cada String es una
     * de las palabras tecleadas por el usuario.
     */
    public HashSet<String> getInput() {
        System.out.println(">");   //Imprime el indicativo
        String inputLine = reader.nextLine().trim().toLowerCase();
        
        String[] wordArray = inputLine.split(" "); //Dividir en los espacios
        
        //Agregar palabras del array al HashSet
        HashSet<String> words = new HashSet<String>();
        for(String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}
