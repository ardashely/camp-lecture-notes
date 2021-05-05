package main.core;

import main.jLogger.JLoggerManager;

public class JLoggerManagerAdaptor implements LoggerService {

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
