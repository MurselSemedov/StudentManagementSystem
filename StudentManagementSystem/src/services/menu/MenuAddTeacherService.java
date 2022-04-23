package services.menu;
import bean.Config;
import bean.Inspection;
import bean.Teacher;
import services.menu.inter.MenuAddTeacherServiceInter;
import util.Involvement;
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        int id=Involvement.toIncludeInt("Teacher Number :");
        while(Inspection.T_id.contains(id))
        {
             id=Involvement.toIncludeInt("This id is available. Enter another id :");
        }
        String name=Involvement.toIncludeString("Name :");
        String surname=Involvement.toIncludeString("Surname :");
        int age=Involvement.toIncludeInt("Age :");
        String schoolname=Involvement.toIncludeString("SchoolName :");
        Double salary=Involvement.toIncludeDouble("Salary :");
        Inspection.T_id.add(id);
        Config.instance().setTeachers(new Teacher(id,name,surname,age,schoolname,salary));
    }
}
