package pl.sq2wkh.spring.tutorial.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 07.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext  context = new ClassPathXmlApplicationContext("application-context.xml");
        SpringSingleton objA = (SpringSingleton)context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();

        SpringSingleton objB = (SpringSingleton) context.getBean("helloWorld");
        objB.getMessage();
    }
}
