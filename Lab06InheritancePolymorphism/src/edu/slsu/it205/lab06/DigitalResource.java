package edu.slsu.it205.lab06;

public class DigitalResource extends LibraryItem {

    private final String fileType;

    public DigitalResource(String id, String fileType) {
        super(id);
        this.fileType = fileType;
    }

    @Override
    public void displaySummary() {
        System.out.println(
            "Digital Resource: " + fileType +
            " | ID: " + id
        );
    }
}