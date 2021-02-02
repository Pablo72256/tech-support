import java.util.ArrayList;	
import java.util.Random;

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
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestas.add(0, "No te he entendido bien");
	respuestas.add(1, "¿Estas seguro?");
	respuestas.add(2, "Veremos que podemos hacer, ¿Necesitas algo mas?");
	respuestas.add(3, "De acuerdo, intentaremos solucionarlo, ¿Puedo hacer algo mas por ti?");
	respuestas.add(4, "Estamos trabajando en ello ¿Algo mas?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroAleatorio = 0;
        numeroAleatorio = aleatorio.nextInt(respuestas.size());
        return respuestas.get(numeroAleatorio);
    }
}
