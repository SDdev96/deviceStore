package groupxx;

public class DeviceInsertionException extends RuntimeException {
    public DeviceInsertionException() {
        super();
    }

    public DeviceInsertionException(String errorMessage) {
        super(errorMessage);
    }
}
