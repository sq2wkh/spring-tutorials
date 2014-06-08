package pl.sq2wkh.spring.tutorial.customevent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by adam on 08.06.14.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My custom event";
    }
}
