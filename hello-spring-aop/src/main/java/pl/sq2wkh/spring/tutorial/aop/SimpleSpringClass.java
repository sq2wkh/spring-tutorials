package pl.sq2wkh.spring.tutorial.aop;


public class SimpleSpringClass {
    private String someValue;
    private int id;
    private String someValue2;

    public String getSomeValue2() {
        return someValue2;
    }

    public void setSomeValue2(String someValue2) {
        this.someValue2 = someValue2;
    }

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printValueAndId(){
        System.out.println("someValue: " + someValue + " id " + id);

    }

    public void checkSomeValue2Length(){
         if(someValue2.length() > 5){
             throw new IllegalArgumentException("Too long");
         }
    }

    public void sayHelloTo(String name){
        System.out.println("Hello "  + name);
    }

}
