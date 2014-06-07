package pl.sq2wkh.spring.tutorial.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("application-context.xml");

        BeanLifecycle obj = (BeanLifecycle) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook(); //wywołanie metody destroy
    }
}
