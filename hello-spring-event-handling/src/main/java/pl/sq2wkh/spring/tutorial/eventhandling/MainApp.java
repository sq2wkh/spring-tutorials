package pl.sq2wkh.spring.tutorial.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // startuje context
        context.start();

        SpringBean obj = (SpringBean) context.getBean("springBean");

        obj.getMessage();

        // stopuje context
        context.stop();
    }
}
