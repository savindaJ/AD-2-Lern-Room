package lk.ijse.decarator.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class KeyBoard implements Device{
    @Override
    public void on() {
        System.out.println("KeyBoard is on");
    }

    @Override
    public void off() {
        System.out.println("KeyBoard is off");
    }

    @Override
    public void rollUp() {
        System.out.println("KeyBoard is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("KeyBoard is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("KeyBoard is shutting down");
    }
}
