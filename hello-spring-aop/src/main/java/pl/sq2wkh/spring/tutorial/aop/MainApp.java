package pl.sq2wkh.spring.tutorial.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        SimpleSpringClass simpleSpringClass = (SimpleSpringClass) context.getBean("simpleSpringClass");
        simpleSpringClass.printValueAndId();
        simpleSpringClass.getSomeValue();
        simpleSpringClass.setId(123123);
        simpleSpringClass.sayHelloTo("Adam");
        simpleSpringClass.checkSomeValue2Length();
    }


}
