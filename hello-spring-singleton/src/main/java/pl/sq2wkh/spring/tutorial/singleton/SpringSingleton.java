package pl.sq2wkh.spring.tutorial.singleton;

/**
 * Created by adam on 07.06.14.
 */
public class SpringSingleton {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
