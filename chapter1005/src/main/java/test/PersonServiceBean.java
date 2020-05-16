package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceBean implements PersonService {

    public void save(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonServiceBean personServiceBean = (PersonServiceBean) applicationContext.getBean("personServiceBean");

        personServiceBean.save("wuhu");
    }
}
