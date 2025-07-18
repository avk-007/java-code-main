package sample;

import java.util.logging.Logger;

public class hello {

    private static final Logger logger= Logger.getLogger(hello.class.getName());
    public static void main(String[] args) {
        logger.info("sample.hello world");
    }
}