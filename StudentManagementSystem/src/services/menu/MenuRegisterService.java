package services.menu;
import bean.Inspection;
import services.menu.inter.MenuRegisterServiceInter;
import util.Involvement;
import util.MenuUtil;
public class MenuRegisterService implements MenuRegisterServiceInter
{
    @Override
    public void process() {
        String username=Involvement.toIncludeString("Username:");
        while(Inspection.username.contains(username))
        {
            username=Involvement.toIncludeString("This username is available. Enter another username:");
        }
        String email=Involvement.toIncludeString("E-mail:");
        while(!(email.contains("@")&&email.contains(".")&&(email.contains("gmail.com")||email.contains("mail.ru")||email.contains("bk.ru")||email.contains("list.ru"))))
        {
            email=Involvement.toIncludeString("There is no such mail form. Please enter the correct mail:");
        }
        while(Inspection.email.contains(email))
        {
            email=Involvement.toIncludeString("This email is available. Enter another email:");
        }
        String password=Involvement.toIncludeString("Password:");
        while(Inspection.password.contains(password))
        {
            password=Involvement.toIncludeString("This password is available. Enter another password:");
        }
        Inspection.username.add(username);
        Inspection.email.add(email);
        Inspection.password.add(password);
        MenuUtil.showStartMenu();
    }
}
