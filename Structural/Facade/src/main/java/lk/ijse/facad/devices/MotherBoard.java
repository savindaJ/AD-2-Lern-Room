package lk.ijse.facad.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class MotherBoard implements Device{
    @Override
    public void on() {
        System.out.println("MotherBoard is on");
    }

    @Override
    public void off() {
        System.out.println("MotherBoard is off");
    }

    @Override
    public void rollUp() {
        System.out.println("MotherBoard is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("MotherBoard is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("MotherBoard is shutting down");
    }
}
