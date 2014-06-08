package pl.sq2wkh.spring.tutorial.postprocessor;

/**
 * Created by adam on 08.06.14.
 */
public class BeanLifecycle {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
