package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Logger Logger = new ConsoleLogger();
        return Logger;
    }
}