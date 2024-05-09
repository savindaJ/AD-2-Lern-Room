package lk.ijse.decarator.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Hard implements Device{
    @Override
    public void on() {
        System.out.println("Hard is on");
    }

    @Override
    public void off() {
        System.out.println("Hard is off");
    }

    @Override
    public void rollUp() {
        System.out.println("Hard is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("Hard is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("Hard is shutting down");
    }
}
