package pl.sq2wkh.spring.tutorial.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 07.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        SpringPrototype objA = (SpringPrototype)context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();

        SpringPrototype objB = (SpringPrototype) context.getBean("helloWorld");
        objB.getMessage();
    }
}
