package groupxx;

import provided.DeviceFilter;

public class HighStorageDeviceFilter implements DeviceFilter {
    private final int minSize;

    public HighStorageDeviceFilter(int minSize) {
        this.minSize = minSize;
    }

    @Override
    public boolean checkDevice(Device d) {
        return d.getStorageCapacity() >= minSize;
    }

}
