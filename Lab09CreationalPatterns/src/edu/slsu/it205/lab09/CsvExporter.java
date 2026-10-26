package edu.slsu.it205.lab09;

public class CsvExporter implements ReportExporter {

    @Override
    public void export(String content) {
        System.out.println("Exporting as CSV: " + content);
    }
}