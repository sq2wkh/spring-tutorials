package pl.sq2wkh.spring.tutorial.prototype;

/**
 * Created by adam on 07.06.14.
 */
public class SpringPrototype {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
