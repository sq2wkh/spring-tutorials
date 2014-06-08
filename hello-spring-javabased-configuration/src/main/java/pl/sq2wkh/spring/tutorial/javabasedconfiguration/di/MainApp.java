package pl.sq2wkh.spring.tutorial.javabasedconfiguration.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by adam on 08.06.14.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te =  context.getBean(TextEditor.class);
        te.spellCheck();
    }
}
