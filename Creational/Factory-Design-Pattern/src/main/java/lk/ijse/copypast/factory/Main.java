package lk.ijse.copypast.factory;

import lk.ijse.copypast.factory.devices.Hard;
import lk.ijse.copypast.factory.devices.Mouse;
import lk.ijse.copypast.factory.devices.Ram;
import lk.ijse.copypast.factory.enums.Devices;
import lk.ijse.copypast.factory.facory.Factory;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {
        Hard hard = Factory.getInstance().getDevice(Devices.HARD);
        Mouse mouse = Factory.getInstance().getDevice(Devices.MOUSE);
        Ram ram = Factory.getInstance().getDevice(Devices.RAM);
        System.out.println(hard);
        System.out.println(mouse);
        System.out.println(ram);
    }
}
