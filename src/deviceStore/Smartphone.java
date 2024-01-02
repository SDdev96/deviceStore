package deviceStore;

import provided.MobileCPUType;

@SuppressWarnings("unused")

public class Smartphone extends Device {
    private final MobileCPUType cpu;
    private final float screenSizeInch;

    public Smartphone(MobileCPUType cpu, float screenSizeInch, String serialNumber, int year, int month, int dayOfMonth,
            int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }

    public MobileCPUType getCpu() {
        return cpu;
    }

    public float getScreenSizeInch() {
        return screenSizeInch;
    }

    @Override
    public boolean hasTouchScreen() {
        return true;
    }

    @Override
    public String toString() {
        return "Smartphone" + super.toString() + "\nCPU: " + cpu + "\nscreenSizeInch: " + screenSizeInch + "\n\n";
    }

}
