package edu.slsu.it205.lab10;

public class StudentObserver implements Observer {

    @Override
    public void update(String status) {
        System.out.println("Student notification: Status changed to " + status);
    }
}