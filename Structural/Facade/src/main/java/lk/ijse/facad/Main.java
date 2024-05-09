package lk.ijse.facad;

import lk.ijse.facad.devices.DeviceMeker;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {
        DeviceMeker deviceMeker = new DeviceMeker();
        deviceMeker.on();
        // do some work with devices
        deviceMeker.off();
    }
}
