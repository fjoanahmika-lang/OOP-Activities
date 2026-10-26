package edu.slsu.it205.lab10;

public class LoggingServiceDecorator implements Service {

    private final Service service;

    public LoggingServiceDecorator(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String id) {
        System.out.println("Before execution: " + id);

        service.execute(id);

        System.out.println("After execution: " + id);
    }
}