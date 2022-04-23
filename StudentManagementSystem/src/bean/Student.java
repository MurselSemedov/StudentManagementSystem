package bean;
public class Student  extends Person
{
    private double Scholarship;
    
    
    
    
    public Student(int Id,String name, String surname, int age, String SchoolName,double Scholarship) {
        super(Id,name, surname, age, SchoolName);
        this.Scholarship = Scholarship;
    }
    public double getScholarship() {
        return Scholarship;
    }

    public void setScholarship(double Scholarship) {
        this.Scholarship = Scholarship;
    }
    @Override
    public String toString() {
        return  super.getId()+") "+super.getName() + "  " + super.getSurname() + "  " + super.getAge() + "  "+ super.getSchoolName()+" "+this.Scholarship ;
    }



    
}
