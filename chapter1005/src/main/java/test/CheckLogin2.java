package test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component("chkl")
public class CheckLogin2 {
    public void pc(){
    }


    public void aopBefefore(){
        System.out.println("aopBefefore chkl");
    }


    public void aopAfter(){
        System.out.println("aopAfter chkl");
    }

}
