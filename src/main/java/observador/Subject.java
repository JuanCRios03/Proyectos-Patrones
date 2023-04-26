package observador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public class Subject implements ISubject {
    //Declarar estructura para manejar suscriptores
    List<Observer> observerList = new ArrayList<Observer>();
    //Atributo con estado
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        //El notificar de los observadores cambio de estado
        notifyObservers();
    }
    public Subject(){
        observerList= new ArrayList<>();
        flag=0;
    }
    @Override
    public void register(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        observerList.remove(ob);
    }
     @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
            }
        }
    }
 
