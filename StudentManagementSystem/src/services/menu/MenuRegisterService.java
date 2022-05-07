package services.menu;
import bean.Verifications;
import services.menu.inter.MenuRegisterServiceInter;
import util.FileUtility;
import util.MenuUtil;
public class MenuRegisterService implements MenuRegisterServiceInter
{
    @Override
    public void process() { 
        Verifications.instance().setUsername(Verifications.instance().UsernameVertification());
        Verifications.instance().setEmail(Verifications.instance().EmailVertification());
        Verifications.instance().setPassword(Verifications.instance().PasswordVertification());
        FileUtility.writeObjectToFile(Verifications.instance(), "C:\\Users\\99470\\Desktop\\StudentManagement\\verify.obj");
        MenuUtil.showStartMenu();
    }
}
