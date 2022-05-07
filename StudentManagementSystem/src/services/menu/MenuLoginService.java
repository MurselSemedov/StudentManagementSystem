package services.menu;
import bean.Config;
import bean.Verifications;
import services.menu.inter.MenuLoginServiceInter;
import util.Input;
import util.Menu;
import util.MenuUtil;
import static util.MenuUtil.selectedMenu;
public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        String username=Input.toIncludeString("Username:");
        String password=Input.toIncludeString("Password:");
        if(!(Verifications.instance().getUsername().contains(username)&&Verifications.instance().getPassword().contains(password)))
        {
            System.out.println("Username or password invalid...");
            System.out.println("If you do not have an account, register in the register section :");
            MenuUtil.showStartMenu();
        }
         else
        {
            System.out.println("Login Successed...");
            System.out.println("Please select menu :");
            Config.initialize();
            Menu.ShowNextMenu();
            selectedMenu();
        }
    }
    
}
