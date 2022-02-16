package major;

import other.*;

public class App {

    public static void main(String[] args) {
        Lang lang = new Lang();
        lang.hello();
        System.out.println("hello");
        Log logger = new Log();
        logger.hello();

    }
}