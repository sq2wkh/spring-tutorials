package pl.sq2wkh.spring.tutorial.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by adam on 28.06.14.
 */
@Component
@Aspect
public class SimplePointcut {

    @Pointcut("execution (public void printValueAndId())")
    public void printValueAndIdPointcut(){

    }

    //Pointcut dla wszystkich metod klass w pakiecie pl.sq2wkh.spring.tutorial.aop.*
    @Pointcut("within(pl.sq2wkh.spring.tutorial.aop.*)")
    public void allMethodsPointcut(){

    }

    @Before("printValueAndIdPointcut()")
    public void secondAdvice(){
        System.out.println("Executing Advice on printValueAndIdPointcut()");
    }

    @Before("allMethodsPointcut()")
    public void allMethodsAdvice(){
        System.out.println("Before executing method");
    }
}
