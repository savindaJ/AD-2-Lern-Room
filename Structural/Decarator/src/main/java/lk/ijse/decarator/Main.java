package lk.ijse.decarator;

import lk.ijse.decarator.devices.Device;
import lk.ijse.decarator.devices.Hard;
import lk.ijse.decarator.devices.Mouse;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {
        Hard hard = new Hard();
        Device chipDecorator = new ChipDecorator(hard);
        chipDecorator.on();
        chipDecorator.off();

        Mouse mouse = new Mouse();
        Device chipDecorator1 = new ChipDecorator(mouse);
        chipDecorator1.on();
        chipDecorator1.off();
    }
}
