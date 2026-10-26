package edu.slsu.it205.lab09;

public class CsvExporterFactory extends ExporterFactory {

    @Override
    public ReportExporter create() {
        return new CsvExporter();
    }
}