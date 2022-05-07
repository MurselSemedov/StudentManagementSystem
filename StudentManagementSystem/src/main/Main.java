package main;
import bean.Verifications;
import util.MenuUtil;
public class Main 
{
 public static void main(String[] args)
    {
        Verifications.initialize();
        MenuUtil.showStartMenu();
    }
}
