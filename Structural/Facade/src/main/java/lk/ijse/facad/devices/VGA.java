package lk.ijse.facad.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class VGA implements Device{
    @Override
    public void on() {
        System.out.println("VGA is on");
    }

    @Override
    public void off() {
        System.out.println("VGA is off");
    }

    @Override
    public void rollUp() {
        System.out.println("VGA is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("VGA is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("VGA is shutting down");
    }
}
