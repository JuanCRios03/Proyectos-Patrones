
package patronesdediseño;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Objeto de préstamo de un libro 
        Prestar prestar = new PrestarLibro();

        // Decoramos el objeto con un decorador que envía recordatorios por SMS
        prestar = new RecordatorioSMSDecorador(prestar);

        // Decoramos el objeto con otro decorador que envía recordatorios para llamadas telefónicas
        prestar = new RecordatorioLlamadaDecorador(prestar);

        // Enviamos el recordatorio
        prestar.Recordatorio();
        
    }
    
}
