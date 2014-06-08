package pl.sq2wkh.spring.tutorial.eventhandling;

/**
 * Created by adam on 08.06.14.
 */
public class SpringBean {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
