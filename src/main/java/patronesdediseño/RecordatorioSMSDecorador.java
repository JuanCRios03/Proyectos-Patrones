
package patronesdediseño;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
// En el primer decorador se puede agrega una responsabilidad adicional al componente en este caso un mensaje de texto
    class RecordatorioSMSDecorador extends RecordatorioDecorador {
    public RecordatorioSMSDecorador(Prestar prestar) {
        super(prestar);
    }

    @Override
    public void Recordatorio() {
        super.Recordatorio();
        System.out.println("El recordatorio en la devolución del libro a sido enviado por mensaje de texto con éxito.");
    }
}
