package edu.slsu.it205.lab06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampService {

    public String getTimestamp() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return LocalDateTime.now().format(formatter);
    }
}