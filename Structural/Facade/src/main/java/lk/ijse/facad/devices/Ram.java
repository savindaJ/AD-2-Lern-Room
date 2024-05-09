package lk.ijse.facad.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Ram implements Device{
    @Override
    public void on() {
        System.out.println("Ram is on");
    }

    @Override
    public void off() {
        System.out.println("Ram is off");
    }

    @Override
    public void rollUp() {
        System.out.println("Ram is rolling up");
    }

    @Override
    public void rollDown() {
        System.out.println("Ram is rolling down");
    }

    @Override
    public void shutDown() {
        System.out.println("Ram is shutting down");
    }
}
