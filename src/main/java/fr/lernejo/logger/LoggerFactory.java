package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Predicate<String> predicate = msg -> msg.contains("simulation");
        Logger logger = new CompositeLogger(new ContextualLogger(name, new FilteredLogger(new FileLogger("logger.txt"), predicate)), new ContextualLogger(name, new ConsoleLogger()));
        //Logger logger = new ContextualLogger();
        return logger;
    }
}
