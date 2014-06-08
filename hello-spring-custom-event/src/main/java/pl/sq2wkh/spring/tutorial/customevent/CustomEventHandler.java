package pl.sq2wkh.spring.tutorial.customevent;

import org.springframework.context.ApplicationListener;

/**
 * Created by adam on 08.06.14.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
