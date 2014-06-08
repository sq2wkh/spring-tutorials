package pl.sq2wkh.spring.tutorial.javabasedconfiguration.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
        SpringBean springBean = (SpringBean)context.getBean(SpringBean.class);
        springBean.setMessage("spring bean");
        springBean.getMessage();
    }
}
