package fr.lernejo.logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
    private String callerClass = "";
    private Logger delegateLogger;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    public ContextualLogger(String class_name, Logger logger){
        this.callerClass = class_name;
        this.delegateLogger = logger;
    }

    @Override
    public void log(String message) {
        this.delegateLogger.log(LocalDateTime.now().format(this.formatter) + " " + this.callerClass + " " + message);
    }
}
