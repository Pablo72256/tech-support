import java.util.ArrayList; 
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> respuestas;
    HashMap<HashSet<String>, String> respuestasMap = new HashMap<>();
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        HashSet<String> respuestasSet = new HashSet<>();
        HashSet<String> respuestasSet2 = new HashSet<>();
        HashSet<String> respuestasSet3 = new HashSet<>();
        HashSet<String> respuestasSet4 = new HashSet<>();
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestas.add("No te he entendido bien");
        respuestas.add("¿Estas seguro?");
        respuestas.add("Veremos que podemos hacer, ¿Necesitas algo mas?");
        respuestas.add("De acuerdo, intentaremos solucionarlo, ¿Puedo hacer algo mas por ti?");
        respuestas.add("Estamos trabajando en ello ¿Algo mas?");
        respuestasSet2.add("error");
        respuestasSet2.add("rojo");
        respuestasSet3.add("pantalla");
        respuestasSet3.add("azul");
        respuestasSet4.add("fallo");
        respuestasSet4.add("sistema");
        respuestasMap.put(respuestasSet2,"Dame el codigo del fallo");
        respuestasMap.put(respuestasSet3,"Que más te dice el error");
        respuestasMap.put(respuestasSet4,"Que te pone en la pantalla");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        int numeroAleatorio = 0;
        String retorno = "";
        if (respuestasMap.get(userInput) != null){
            retorno = respuestasMap.get(userInput);
        }
        if (retorno.equals("")){
            numeroAleatorio = aleatorio.nextInt(respuestas.size());
            retorno = respuestas.get(numeroAleatorio);
        }
        return retorno;
    }
}
