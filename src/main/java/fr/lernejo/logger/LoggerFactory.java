package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Logger logger1 = new ConsoleLogger();
        Logger logger2 = new FileLogger("C:\\Users\\d_vig\\Documents\\ESIEA\\software");
        Logger contextLogger = new CompositeLogger(logger1, logger2);
        return contextLogger;
    }
}
