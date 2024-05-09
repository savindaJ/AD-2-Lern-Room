package lk.ijse.copypast.observar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Subject {
    private final List<Observar> observers =  new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observar observar){
        observers.add(observar);
    }

    public void notifyAllObservers(){
        for (Observar observar : observers) {
            observar.update();
        }
    }
}
