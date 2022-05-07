package services.menu;
import bean.Config;
import bean.Verifications;
import bean.Student;
import services.menu.inter.MenuAddStudentsServiceInter;
import util.FileUtility;
import util.Input;
public class MenuAddStudentService implements MenuAddStudentsServiceInter {
    @Override
    public void process() {
        int id=Input.toIncludeInt("Student Number :");
        while(Verifications.instance().getS_id().contains(id))
        {
             id=Input.toIncludeInt("This id is available. Enter another id :");
        }
        String name=Input.toIncludeString("Name :");
        String surname=Input.toIncludeString("Surname :");
        int age=Input.toIncludeInt("Age :");
        String schoolname=Input.toIncludeString("SchoolName :");
        Double scholarship=Input.toIncludeDouble("Scholarship :");
        Verifications.instance().setS_id(id);
        Config.instance().setStudents(new Student(id,name,surname,age,schoolname,scholarship));
        FileUtility.writeObjectToFile(Config.instance(),"C:\\Users\\99470\\Desktop\\StudentManagement\\proj.obj" );
        FileUtility.writeObjectToFile(Verifications.instance(),"C:\\Users\\99470\\Desktop\\StudentManagement\\verify.obj" );
    }
}
