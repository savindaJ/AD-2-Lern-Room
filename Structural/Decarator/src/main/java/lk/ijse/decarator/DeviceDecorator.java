package lk.ijse.decarator;

import lk.ijse.decarator.devices.Device;

/**
 * @author : savindaJ
 * @date : 2024-05-09
 * @since : 0.1.0
 **/
public abstract class DeviceDecorator implements Device {
    protected Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }
    @Override
    public void off() {
        device.off();
    }
    @Override
    public void on() {
        device.on();
    }
}
