package bean;
import java.util.LinkedList;
public class Config {
    LinkedList<Student> students=new LinkedList<>();
    LinkedList<Teacher> teachers=new LinkedList<>();
    
    public static Config config=null;
    public Student[] getStudents() {
        Student[] s=new Student[this.students.size()];
        for(int i=0;i<s.length;i++)
        {
            s[i]=this.students.get(i);
        }
        return s;
    }
    public void setStudents(Student students) {
        this.students .add(students);
    }

    public Teacher[] getTeachers() {
        Teacher[] t=new Teacher[this.teachers.size()];
        for(int i=0;i<t.length;i++)
        {
            t[i]=this.teachers.get(i);
        }
        return t;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers .add(teachers);
    }  
    public static Config instance()
    {
        if(config==null)
        {
            config=new Config();
        }
        return config;
    }
}
