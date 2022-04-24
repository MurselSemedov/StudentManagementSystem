package services.menu;
import bean.Config;
import bean.Verifications;
import bean.Teacher;
import services.menu.inter.MenuAddTeacherServiceInter;
import util.Input;
public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        int id=Input.toIncludeInt("Teacher Number :");
        while(Verifications.instance().getT_id().contains(id))
        {
             id=Input.toIncludeInt("This id is available. Enter another id :");
        }
        String name=Input.toIncludeString("Name :");
        String surname=Input.toIncludeString("Surname :");
        int age=Input.toIncludeInt("Age :");
        String schoolname=Input.toIncludeString("SchoolName :");
        Double salary=Input.toIncludeDouble("Salary :");
        Verifications.instance().setT_id(id);
        Config.instance().setTeachers(new Teacher(id,name,surname,age,schoolname,salary));
    }
}
