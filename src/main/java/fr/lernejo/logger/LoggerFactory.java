package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Logger logger = new ConsoleLogger();
        Logger contextLogger = new FileLogger("C:\\Users\\d_vig\\Documents\\ESIEA\\software");
        return contextLogger;
    }
}
