package lk.ijse.decarator;

import lk.ijse.decarator.devices.Device;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public class ChipDecorator extends DeviceDecorator{
    public ChipDecorator(Device device) {
        super(device);
    }

    @Override
    public void on() {
        device.on();
        setChip(device);
        System.out.println("Chip is on");
    }

    @Override
    public void off() {
        device.off();
        removeChip(device);
        System.out.println("Chip is off");
    }

    @Override
    public void rollUp() {

    }

    @Override
    public void rollDown() {

    }

    @Override
    public void shutDown() {

    }

    private void setChip(Device device){
        System.out.println("Chip is set");
    }

    private void removeChip(Device device){
        System.out.println("Chip is removed");
    }
}
