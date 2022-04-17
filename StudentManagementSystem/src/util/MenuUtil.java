package util;
import java.util.Scanner;
public class MenuUtil 
{
    public static Menu showMenu()
    {
        Menu.ShowAllMenu();
            System.out.println("Please select menu:");
            Scanner sc=new Scanner(System.in);
            int selectedMenu=sc.nextInt();
            return Menu.find(selectedMenu);
    }
    public static void processMenu(Menu menu)
    {
        menu.process();
    }
}
