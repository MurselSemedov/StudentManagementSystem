package services.menu;
import bean.Config;
import bean.Inspection;
import bean.Student;
import services.menu.inter.MenuAddStudentsServiceInter;
import util.Involvement;
public class MenuAddStudentService implements MenuAddStudentsServiceInter {
    @Override
    public void process() {
        int id=Involvement.toIncludeInt("Student Number :");
        while(Inspection.S_id.contains(id))
        {
             id=Involvement.toIncludeInt("This id is available. Enter another id :");
        }
        String name=Involvement.toIncludeString("Name :");
        String surname=Involvement.toIncludeString("Surname :");
        int age=Involvement.toIncludeInt("Age :");
        String schoolname=Involvement.toIncludeString("SchoolName :");
        Double scholarship=Involvement.toIncludeDouble("Scholarship :");
        Inspection.S_id.add(id);
        Config.instance().setStudents(new Student(id,name,surname,age,schoolname,scholarship));
    }
}
