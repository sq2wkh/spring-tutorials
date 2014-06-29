package pl.sq2wkh.spring.tutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by adam on 28.06.14.
 */
@Component
@Aspect
public class SimpleAroundAdvice {

    @Around("execution(* pl.sq2wkh.spring.tutorial.aop.SimpleSpringClass.getSomeValue())")
    public Object printValueAndIdAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoking getSomeValue() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking getSomeValue() method. Return value= "+value);
        return value;
    }
}
