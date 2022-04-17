package services.menu;
import services.menu.inter.MenuLoginServiceInter;
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        System.out.println("Login");
    }
    
}
