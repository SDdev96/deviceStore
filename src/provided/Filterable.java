package provided;

import java.util.Comparator;
import java.util.Set;
import groupxx.*;

@SuppressWarnings("unused")

public interface Filterable {

   public DeviceStore filter(DeviceFilter d, Comparator<Device> c);

}
