package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void jlog(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
