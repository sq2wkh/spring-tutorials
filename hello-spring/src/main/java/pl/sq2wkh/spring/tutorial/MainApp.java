package pl.sq2wkh.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 07.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
        obj.getMessage();
    }
}
