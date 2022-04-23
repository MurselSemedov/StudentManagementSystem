package util;
import services.menu.MenuAddStudentService;
import services.menu.MenuAddTeacherService;
import services.menu.MenuExitService;
import services.menu.MenuLoginService;
import services.menu.MenuRegisterService;
import services.menu.MenuShowStudentsService;
import services.menu.MenuShowTeachersService;
import services.menu.inter.MenuService;
public enum Menu
{
    LOGIN(1,"Login",new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher",new MenuAddTeacherService()),
    ADD_STUDENT(4,"Add student",new MenuAddStudentService()),
    SHOW_ALL_STUDENTS(5,"Show all students",new MenuShowStudentsService()),
    SHOW_ALL_TEACHER(6,"Show all teachers",new MenuShowTeachersService()),
    EXIT(7,"Exit",new MenuExitService()),
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
        MenuUtil.showMenu();
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
    public static void ShowStartMenu()
    {
        Menu[] menus=Menu.values();  
        for(Menu i:menus){
            if(i!=UNKNOWN&&(i==LOGIN||i==REGISTER))
            {
            System.out.println(i);
            }
        }
    }
    public static void ShowNextMenu()
    {
        Menu[] menus=Menu.values();  
        for(Menu i:menus){
            if(i!=UNKNOWN&&!(i==LOGIN||i==REGISTER))
            {
            System.out.println(i);
            }
        }
    }
}
