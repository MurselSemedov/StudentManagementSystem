package util;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuUtil 
{
    public static void showNextMenu()
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
            try{
               int selectedMenuNumber=sc.nextInt();
                while(!(selectedMenuNumber==1||selectedMenuNumber==2))
                {
                    selectedMenuNumber=Input.toIncludeInt("Please make one of the options in the menu :");
                 }
           Menu m =  Menu.find(selectedMenuNumber);
           m.process();
            }catch(InputMismatchException ex)
            {
                System.out.println("You made a wrong choice. You were redirected to the menu.");
                showStartMenu();
            }
    }
    public static void selectedMenu()
    {
        Scanner sc=new Scanner(System.in);
        try{
            int selectedMenuNumber=sc.nextInt();
        while(selectedMenuNumber==1||selectedMenuNumber==2)
             {
                 selectedMenuNumber=Input.toIncludeInt("Please make one of the options in the menu :");
             }
             Menu m =  Menu.find(selectedMenuNumber);
             m.process();
        }catch(InputMismatchException ex){
                System.out.println("You made a wrong choice. You were redirected to the menu.");
                showNextMenu();
            }
    }

    private MenuUtil() {
    }
}
