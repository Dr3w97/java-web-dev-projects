package org.launchcode;

public class CD extends BaseDisk {
    // TODO: Implement your custom interface.
    private String trackList;
    public CD(Integer rpms, String fileType, Double storageCapacity, String readBy, String contents, String name, String trackList) {
        super(rpms, fileType, storageCapacity, readBy, contents, name);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
