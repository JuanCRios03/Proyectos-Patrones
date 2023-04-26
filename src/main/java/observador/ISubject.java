package observador;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public interface ISubject {
    void register(Observer ob);

    void unregister(Observer ob);

    void notifyObservers();
}

