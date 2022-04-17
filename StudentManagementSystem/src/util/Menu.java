package util;
import services.menu.MenuLoginService;
import services.menu.MenuRegisterService;
import services.menu.inter.MenuService;
public enum Menu
{
    LOGIN(1,"Login",new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher",null),
    ADD_STUDENT(4,"Add student",null),
    SHOW_ALL_STUDENTS(5,"Show all students",null),
    SHOW_ALL_TEACHER(6,"Show all teachers",null),
    UNKNOWN;
    private String label;
    private MenuService service;
    private int number;
    private Menu(int number,String label,MenuService service) {
        this.label = label;
        this.service=service;
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
    private Menu() {
    }

    @Override
    public String toString() {
        return number+"."+label ;
    }

    public String getLabel() {
        return label;
    }
    public  void process()
    {
        service.process();
    }
    public static Menu find(int number)
    {
        Menu[] menus=Menu.values();
        for(Menu i:menus)
            {
                if(i.getNumber()==number)
                {
                    return i;
                }
            }
            return Menu.UNKNOWN;
    }
    public static void ShowAllMenu()
    {
        Menu[] menus=Menu.values();  
        for(Menu i:menus){
            if(i!=UNKNOWN)
            {
            System.out.println(i);
            }
        }
    }
}
