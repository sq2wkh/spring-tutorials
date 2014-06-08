package pl.sq2wkh.spring.tutorial.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Collections jc=(Collections)context.getBean("javaCollections");

        jc.getList();
        jc.getSet();
        jc.getMap();
        jc.getProperties();
    }
}
