package pl.sq2wkh.spring.tutorial.customevent;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by adam on 08.06.14.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(){
        CustomEvent event = new CustomEvent(this);
        publisher.publishEvent(event);
    }
}
