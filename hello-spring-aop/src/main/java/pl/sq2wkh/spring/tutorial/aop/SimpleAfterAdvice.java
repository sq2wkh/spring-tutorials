package pl.sq2wkh.spring.tutorial.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAfterAdvice {

    @After("args(name)")
    public void logStringArguments(String name){
        System.out.println("Running After Advice. String argument= "+name);
    }

    @AfterThrowing("within(pl.sq2wkh.spring.tutorial.aop.SimpleSpringClass)")
    public void logException(JoinPoint joinPoint){
        System.out.println("Exception thrown in SimpleSpringClass in method= "+joinPoint.toString());
    }

    @AfterReturning(pointcut="execution(* getSomeValue())", returning="returnString")
    public void getSomeValueAdvice(String returnString){
        System.out.println("getSomeValueAdvice executed. Returned= "+returnString);
    }

}
