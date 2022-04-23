package services.menu;
import bean.Config;
import bean.Teacher;
import services.menu.inter.MenuShowTeachersServiceInter;
public class MenuShowTeachersService implements MenuShowTeachersServiceInter{
    @Override
    public void process() {
        Teacher[] t=Config.instance().getTeachers();
        if(t.length!=0)
        {
            for(Teacher i:t)
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