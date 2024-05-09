package lk.ijse.facad.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Mouse implements Device{
    @Override
    public void on() {
        System.out.println("Mouse is on");
    }

    @Override
    public void off() {
        System.out.println("Mouse is off");
    }

    @Override
    public void rollUp() {
        System.out.println("Mouse is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("Mouse is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("Mouse is shutting down");
    }
}
