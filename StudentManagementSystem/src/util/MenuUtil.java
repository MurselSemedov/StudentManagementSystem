package util;
import java.util.Scanner;
public class MenuUtil 
{
    public static void showMenu()
    {
            Menu.ShowNextMenu();
            selectedMenu();
    }
    public static void showStartMenu()
    {
         Menu.ShowStartMenu();
         selectedStartMenu();
    }
    public static void selectedStartMenu()
    {
        Scanner sc=new Scanner(System.in);
            int selectedMenuNumber=sc.nextInt();
        while(!(selectedMenuNumber==1||selectedMenuNumber==2))
            {
                selectedMenuNumber=Involvement.toIncludeInt("Please make one of the options in the menu :");
            }
           Menu m =  Menu.find(selectedMenuNumber);
           m.process();
    }
    public static void selectedMenu()
    {
        Scanner sc=new Scanner(System.in);
            int selectedMenuNumber=sc.nextInt();
             while(selectedMenuNumber==1||selectedMenuNumber==2)
             {
                 selectedMenuNumber=Involvement.toIncludeInt("Please make one of the options in the menu :");
             }
             Menu m =  Menu.find(selectedMenuNumber);
             m.process();
    }
}
