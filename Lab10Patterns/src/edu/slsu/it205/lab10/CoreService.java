package edu.slsu.it205.lab10;

public class CoreService implements Service {

    @Override
    public void execute(String id) {
        System.out.println("Executing service for ID: " + id);
    }
}