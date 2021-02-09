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
    HashMap<String, String> respuestasMap = new HashMap<>();
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestas.add("No te he entendido bien");
        respuestas.add("¿Estas seguro?");
        respuestas.add("Veremos que podemos hacer, ¿Necesitas algo mas?");
        respuestas.add("De acuerdo, intentaremos solucionarlo, ¿Puedo hacer algo mas por ti?");
        respuestas.add("Estamos trabajando en ello ¿Algo mas?");
        respuestasMap.put("fallo","Dame el codigo del fallo");
        respuestasMap.put("error","Que más te dice el error");
        respuestasMap.put("pantalla","Que te pone en la pantalla");
        respuestasMap.put("rojo","Que te pone en texto rojo");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet userInput)
    {
        int numeroAleatorio = 0;
        String retorno = "";
        for (String key : respuestasMap.keySet()){
            if (userInput.contains(key)){
                retorno = respuestasMap.get(key);
            }
        }
        if (retorno.equals("")){
            numeroAleatorio = aleatorio.nextInt(respuestas.size());
            retorno = respuestas.get(numeroAleatorio);
        }
        return retorno;
    }
}
