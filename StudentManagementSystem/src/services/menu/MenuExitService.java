package services.menu;
import services.menu.inter.MenuService;
public class MenuExitService implements MenuService {
    @Override
    public void process() {
        System.exit(0);
    }  
}
