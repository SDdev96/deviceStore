package groupxx;

import java.time.LocalDate;
import java.lang.Comparable;

public abstract class Device implements Comparable<Device> {
    private final String serialNumber;
    private final LocalDate releaseDate;
    private final int RAMsize;
    private final int storageCapacity;

    public Device(String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        releaseDate = LocalDate.of(year, month, dayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }

    public LocalDate gerReleaseDate() {
        return releaseDate;
    }

    public int getRAMsize() {
        return RAMsize;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public abstract boolean hasTouchScreen();

    @Override
    public String toString() {
        return "\nserialNumber: " + serialNumber + "\nreleaseDate: " + releaseDate + "\nRAMsize: " + RAMsize
                + "\nstorageCapacity: " + storageCapacity;
    }

    @Override
    public final int compareTo(Device o) {
        return this.serialNumber.compareToIgnoreCase(o.serialNumber);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + ((serialNumber == null) ? 0 : serialNumber.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        final Device other = (Device) obj;

        return this.serialNumber.equals(other.serialNumber);
    }

}
