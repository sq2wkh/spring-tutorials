package pl.sq2wkh.spring.tutorial.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by adam on 28.06.14.
 */

@Component
@Aspect
public class SimpleBeforeAdvice {

    @Before("execution (public void printValueAndId())")
    public void printValueAndIdAdvice(){
        System.out.println("Executing Advice on printValueAndId()");
    }

    @Before("execution (* pl.sq2wkh.spring.tutorial.aop.*.get*())")
    public void allGetterAdvice(){
        System.out.println("Executing Advice on all getters in package pl.sq2wkh.spring.tutorial.aop  ");
    }

}
