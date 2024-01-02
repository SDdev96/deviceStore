package groupxx;

import provided.*;

@SuppressWarnings("unused")

public class Notebook extends Device {
    private final CPUType type;
    private final NBScreenType screenType;
    private final boolean touchScreen;

    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen, String serialNumber, int year,
            int month, int dayOfMonth,
            int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.type = type;
        this.screenType = screenType;
        this.touchScreen = touchScreen;
    }

    public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year,
            int month, int dayOfMonth,
            int RAMsize, int storageCapacity) {
        this(type, screenType, false, serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);

    }

    public CPUType getType() {
        return type;
    }

    public NBScreenType getScreenType() {
        return screenType;
    }

    @Override
    public boolean hasTouchScreen() {
        return touchScreen;
    }

    @Override
    public String toString() {
        return "Notebook" + super.toString() + "\nCPU: " + type + "\nscreenType: " + screenType + "\n"
                + ((hasTouchScreen()) ? "touchScreen available" : "touchScreen not available") + "\n\n";
    }
}
