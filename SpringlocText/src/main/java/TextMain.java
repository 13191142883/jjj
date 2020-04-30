import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Lesson lesson = new Lesson();
//        lesson.setName("ssh");
//        lesson.setId(1);
//
//        Student student = new Student();
//
//        student.setLesson(lesson);
//
//        Lesson lesson1= student.getLesson();
//        lesson1.printLession();
        Student student= (Student) context.getBean("student");
        Lesson lesson=student.getLesson();
         lesson.printLession();
        System.out.println(student.getName());

    }
}
