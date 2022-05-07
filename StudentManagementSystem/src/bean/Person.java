package bean;
import java.io.Serializable;
public abstract class Person implements Serializable
{
    private int Id;
    private String name;
    private String surname;
    private int age;
    private String SchoolName;

    public Person() {
    }

    public Person(int Id,String name, String surname, int age, String SchoolName) {
        this.Id=Id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.SchoolName = SchoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
