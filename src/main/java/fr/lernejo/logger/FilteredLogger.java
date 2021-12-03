package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{
    private Logger logger;
    private Predicate<String> condition;

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        this.logger = delegate;
        this.condition = condition;
    }

    @Override
    public void log(String message) {
        if(condition.test(message)){
            this.logger.log(message);
        }
    }
}
