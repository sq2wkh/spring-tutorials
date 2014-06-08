package pl.sq2wkh.spring.tutorial.definitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ParentSpringBean objA = (ParentSpringBean) context.getBean("parentBean");
        objA.getMessage1();
        objA.getMessage2();

        ChildSpringBean objB = (ChildSpringBean) context.getBean("childBean");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
