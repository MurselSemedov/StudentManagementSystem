package services.menu;
import bean.Config;
import bean.Student;
import services.menu.inter.MenuShowStudentsServiceInter;
public class MenuShowStudentsService  implements MenuShowStudentsServiceInter {
    @Override
    public void process() {
        Student[] s=Config.instance().getStudents();
        if(s.length!=0)
        {
            for(Student i:s)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("No Data Found");
        }
    }
    
}
