public class Student {
    int id;
    String name;
    Student(){
        id = 0;
        name = "李四";
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    public void initname(){
        name="王五";
        System.out.println(name);
    }
    Lesson lesson;
}
