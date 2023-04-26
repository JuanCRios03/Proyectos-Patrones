
package patronesdediseño;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
// En el segundo decorador se puede agrega otra responsabilidad adicional al componente en este caso son llamadas telefonicas
class RecordatorioLlamadaDecorador extends RecordatorioDecorador {
    public RecordatorioLlamadaDecorador(Prestar prestar) {
        super(prestar);
    }
    public void enviarRecordatorio() {
        super.Recordatorio();
        System.out.println("El recordatorio en la devolución del libro a sido enviado por llamada telefónica con éxito.");
    }
}
