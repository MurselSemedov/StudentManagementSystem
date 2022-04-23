package services.menu;
import bean.Inspection;
import services.menu.inter.MenuLoginServiceInter;
import util.Involvement;
import util.Menu;
import util.MenuUtil;
import static util.MenuUtil.selectedMenu;
public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        String username=Involvement.toIncludeString("Username:");
        String password=Involvement.toIncludeString("Password:");
        if(!(Inspection.username.contains(username)&&Inspection.password.contains(password)))
        {
            System.out.println("Username or password invalid...");
            System.out.println("If you do not have an account, register in the register section :");
            MenuUtil.showStartMenu();
        }
         else
        {
            System.out.println("Login Successed...");
            System.out.println("Please select menu :");
            Menu.ShowNextMenu();
            selectedMenu();
        }
    }
    
}
