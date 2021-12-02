package fr.lernejo.logger;

public class CompositeLogger implements Logger{

    private Logger delegateLogger1;
    private Logger delegateLogger2;

    public CompositeLogger(Logger logger1, Logger logger2){
        this.delegateLogger1 = logger1;
        this.delegateLogger2 = logger2;
    }

    @Override
    public void log(String message) {
        this.delegateLogger1.log(message);
        this.delegateLogger2.log(message);
    }
}
