package bean;
public class Teacher extends Person
{
    private double salary;

    public Teacher() {
    }

    public Teacher(int Id, String name, String surname, int age, String SchoolName,double salary) {
        super(Id, name, surname, age, SchoolName);
        this.salary=salary;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
      @Override
    public String toString() {
        return  super.getId()+") "+super.getName() + "  " + super.getSurname() + "  " + super.getAge() + "  "+ super.getSchoolName()+" "+this.salary ;
    }
}
