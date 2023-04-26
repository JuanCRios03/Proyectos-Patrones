
package patronesdediseño;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
// El decorador abstracto conserva una referencia al componente al que se le agrega responsabilidades adicionales
    abstract class RecordatorioDecorador extends Prestar {
    protected Prestar prestar;

    public RecordatorioDecorador(Prestar prestar) {
        this.prestar = prestar;
    }

    @Override
    public void Recordatorio() {
        if (prestar != null) {
            prestar.Recordatorio();
        }
    }
}
