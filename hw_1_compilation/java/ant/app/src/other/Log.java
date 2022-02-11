package other;

import org.apache.log4j.*;

public class Log {

    public void hello() {
        Logger log = Logger.getLogger(Log.class);
        BasicConfigurator.configure();
        log.info("What is this ?");
    }
    }