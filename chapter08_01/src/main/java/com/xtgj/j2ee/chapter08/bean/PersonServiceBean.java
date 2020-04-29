package com.xtgj.j2ee.chapter08.bean;

import com.xtgj.j2ee.chapter08.service.PersonService;

public class PersonServiceBean implements PersonService{
    //构造器
    public PersonServiceBean(){
        System.out.println("instance me");
    }
    
    //save方法
    public void save() {
        System.out.println("save");
    }
    
    //初始化方法,这个方法是类被实例化了之后就会执行的！
    public void init(){
        System.out.println("init");
    }
    
    //销毁方法
    public void destroy(){
        System.out.println("destroy");
    }

}


