package deviceStore;

import java.util.*;

import provided.DeviceFilter;
import provided.Filterable;

public class DeviceStore implements Filterable {
    private final String name;
    private Set<Device> store;

    public DeviceStore(String name, Comparator<Device> c) {
        this.name = name;
        store = new TreeSet<>(c);
    }

    public DeviceStore(String name) {
        this(name, null);
    }

    public void addDevice(Device d) {
        if (store.contains(d))
            throw new DeviceInsertionException("Device già presente");
        store.add(d);
    }

    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
        DeviceStore newStore = new DeviceStore(this.name + " custom view", c);
        for (Device device : store)
            if (d.checkDevice(device))
                newStore.addDevice(device);
        return newStore;
    }

    @Override
    public String toString() {
        String string = name + "contains " + store.size() + " items.\nPrinting:\n";
        for (Device d : store)
            string += d.toString();
        return string;
        // return string + '\n' + store;
    }

}
