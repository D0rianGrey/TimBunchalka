//Кешируем, клонируем обьекты и переиспользуем их
//Прототип это класс, который умеет себя клонировать


package Patterns.Prototype;

public class PrototypeLesson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setStudent(new Student());
        Student student = cache.getStudent();


    }
}

class Student implements Cloneable {


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Cache {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return (Student) student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
