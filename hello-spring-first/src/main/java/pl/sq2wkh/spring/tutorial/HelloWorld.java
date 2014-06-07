package pl.sq2wkh.spring.tutorial;

/**
 * Created by adam on 07.06.14.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
