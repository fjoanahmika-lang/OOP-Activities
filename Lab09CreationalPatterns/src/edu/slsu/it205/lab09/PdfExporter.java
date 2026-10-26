package edu.slsu.it205.lab09;

public class PdfExporter implements ReportExporter {

    @Override
    public void export(String content) {
        System.out.println("Exporting as PDF: " + content);
    }
}