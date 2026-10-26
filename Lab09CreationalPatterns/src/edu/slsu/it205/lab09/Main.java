package edu.slsu.it205.lab09;

public class Main {

    public static void main(String[] args) {

        // Factory Method demonstration
        ExporterFactory pdfFactory = new PdfExporterFactory();
        ReportExporter pdfExporter = pdfFactory.create();
        pdfExporter.export("Library Report");

        ExporterFactory csvFactory = new CsvExporterFactory();
        ReportExporter csvExporter = csvFactory.create();
        csvExporter.export("Library Report");

        // Builder demonstration
        ReportConfig config1 = new ReportConfig.Builder()
                .title("Library Report")
                .author("Student")
                .includeCover(true)
                .pageSize("A4")
                .build();

        ReportConfig config2 = new ReportConfig.Builder()
                .title("Inventory Report")
                .author("Student")
                .pageSize("Letter")
                .build();

        System.out.println();
        System.out.println("Config 1:");
        System.out.println("Title: " + config1.getTitle());
        System.out.println("Author: " + config1.getAuthor());
        System.out.println("Include Cover: " + config1.isIncludeCover());
        System.out.println("Page Size: " + config1.getPageSize());

        System.out.println();
        System.out.println("Config 2:");
        System.out.println("Title: " + config2.getTitle());
        System.out.println("Author: " + config2.getAuthor());
        System.out.println("Include Cover: " + config2.isIncludeCover());
        System.out.println("Page Size: " + config2.getPageSize());

                // Singleton demonstration
        AppConfig configA = AppConfig.getInstance();
        AppConfig configB = AppConfig.getInstance();

        System.out.println();
        System.out.println("Singleton:");
        System.out.println("App Name: " + configA.getAppName());
        System.out.println("Same instance: " + (configA == configB));
    }
}