package groupxx;

import java.util.Comparator;

public class DeviceReleaseDateComparator implements Comparator<Device> {

    @Override
    public int compare(Device o1, Device o2) {
        if (o1.getReleaseDate().isEqual(o2.getReleaseDate()))
            return o1.compareTo(o2);
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());

    }

}
