package test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckLogin {
    @Pointcut("execution(* test.*.*(..))")
    public void pc(){

    }

    @Before("pc()")
    public void aopBefefore(){
        System.out.println("aopBefefore");
    }

    @After("pc()")
    public void aopAfter(){
        System.out.println("aopAfter");
    }

}
