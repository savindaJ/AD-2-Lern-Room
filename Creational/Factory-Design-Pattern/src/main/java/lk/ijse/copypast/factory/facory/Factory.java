package lk.ijse.copypast.factory.facory;

import lk.ijse.copypast.factory.devices.*;
import lk.ijse.factory.devices.*;
import lk.ijse.copypast.factory.enums.Devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Factory {
    private static final Factory factory = new Factory();

    private Factory(){

    }

    public static Factory getInstance(){
        return factory;
    }

    public <T extends SuperDevice>T getDevice(Devices device){
        switch (device){
            case RAM:
                return (T) new Ram();
            case HARD:
                return (T) new Hard();
            case MOTHERBOARD:
                return (T) new MotherBoard();
            case MOUSE:
                return (T) new Mouse();
            case KEYBOARD:
                return (T) new KeyBoard();
            case VGA:
                return (T) new VGA();
            default:
                return null;

        }
    }
}
