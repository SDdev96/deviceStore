package deviceStore;

import provided.DeviceFilter;

public class NotebookFilter implements DeviceFilter {
    public boolean checkDevice(Device d) {
        return d instanceof Notebook;
    }
}
