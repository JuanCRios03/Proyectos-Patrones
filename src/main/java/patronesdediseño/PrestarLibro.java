
package patronesdediseño;


/**
 *
 * @author Juan Carlos Rios Fonseca
 */
//Objeto al que se le puede agregar responsabilidades adicionales(Correo electronico)
class PrestarLibro extends Prestar {
    @Override
    public void Recordatorio() {
        System.out.println("Recordatorio de devolución del libro enviado por correo electrónico.");
    }
}
