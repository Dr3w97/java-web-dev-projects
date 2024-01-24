package org.launchcode;

import java.util.ArrayList;

public class DVD extends BaseDisk {
    // TODO: Implement your custom interface.
    private ArrayList cast;
    public DVD(String fileType, Double storageCapacity, String readBy, String contents, String name, ArrayList cast) {
        super(200, fileType, storageCapacity, readBy, contents, name);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
