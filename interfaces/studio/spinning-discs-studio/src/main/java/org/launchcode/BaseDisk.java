package org.launchcode;

public abstract class BaseDisk {
    private Integer rpms;
    private String fileType;
    private Double storageCapacity;
    private String readBy;
    private String contents;

    public Integer getRpms() {
        return rpms;
    }

    public void setRpms(Integer rpms) {
        this.rpms = rpms;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getReadBy() {
        return readBy;
    }

    public void setReadBy(String readBy) {
        this.readBy = readBy;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public BaseDisk(Integer rpms, String fileType, Double storageCapacity, String readBy, String contents, String name) {
        this.rpms = rpms;
        this.fileType = fileType;
        this.storageCapacity = storageCapacity;
        this.readBy = readBy;
        this.contents = contents;
        this.name = name;
    }

    public void spinDisk() {
        System.out.println("The " + fileType + " " + name + " is spinning at " + rpms + " RPMS.");
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String separate = "***********";
        return separate + name + ":" + newLine
                + fileType + ":" + newLine
                + storageCapacity + ":" + newLine
                + readBy + ":" + newLine
                + contents + ":" + newLine
                + rpms + ":" + newLine
                + separate;
    }

}
