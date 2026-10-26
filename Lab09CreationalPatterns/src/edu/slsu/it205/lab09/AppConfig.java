package edu.slsu.it205.lab09;

public class AppConfig {

    private final String appName;

    private AppConfig() {
        this.appName = "Library Management System";
    }

    private static class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getAppName() {
        return appName;
    }
}