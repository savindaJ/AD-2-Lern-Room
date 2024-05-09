package lk.ijse.decarator.devices;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class DeviceMeker {
    private final Device device1;
    private final Device device2;

    public DeviceMeker(){
        device1 = new Mouse();
        device2 = new Hard();
    }

    public void on(){
        device1.on();
        device2.on();
    }

    public void off(){
        device1.off();
        device2.off();
    }
}
