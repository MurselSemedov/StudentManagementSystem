package bean;
import java.io.Serializable;
import java.util.LinkedList;
import util.FileUtility;
import util.Input;
public class Verifications implements Serializable {
    private final LinkedList<Integer> S_id=new LinkedList<>();
    private final LinkedList<Integer> T_id=new LinkedList<>();
    private final LinkedList<String> email=new LinkedList<>();
    private final LinkedList<String> password=new LinkedList<>();
    private final LinkedList<String> username=new LinkedList<>();    
    private static Verifications verification=null;
    public static void initialize()
    {
        Object obj=FileUtility.readObjectToFile("C:\\Users\\99470\\Desktop\\StudentManagement\\verify.obj");
        if(obj==null)
        {
            return;
        }
        if(obj instanceof Verifications)
        {
            verification=(Verifications)obj;
        }
    }
    public  String UsernameVertification()
    {
       String enterUsername=Input.toIncludeString("Username:");
        while(Verifications.instance().getUsername().contains(enterUsername))
        {
            enterUsername=Input.toIncludeString("This username is available. Enter another username:");
        }
        return enterUsername;
    }
    public  String EmailVertification()
    {
        String enterEmail=Input.toIncludeString("E-mail:");
        loop1:while(!((enterEmail.contains("@gmail.com")||enterEmail.contains("@mail.ru")||enterEmail.contains("@bk.ru")||enterEmail.contains("@list.ru"))))
        {
            enterEmail=Input.toIncludeString("There is no such mail form. Please enter the correct mail:");
            if(Verifications.instance().getEmail().contains(enterEmail))
            {
            enterEmail=Input.toIncludeString("This email is available. Enter another email:");    
            } 
        }
        return enterEmail;
    }
    public  String PasswordVertification()
    {
        String enterPassword=Input.toIncludeString("Password:");
        while((enterPassword.length()<8)||
               ! (
                enterPassword.contains("1")||enterPassword.contains("2")||enterPassword.contains("3")||enterPassword.contains("4")
                ||enterPassword.contains("5")||enterPassword.contains("6")||enterPassword.contains("7")||enterPassword.contains("8")
                ||enterPassword.contains("9")||enterPassword.contains("0")
                ))
        {
            enterPassword=Input.toIncludeString("This password is available. Enter another password:");
            if(Verifications.instance().getPassword().contains(enterPassword))
            {
            enterPassword=Input.toIncludeString("The password must be at least 8 characters and 1 digit, please enter the correct password:");
            }
        }
        return enterPassword;
    }
    public LinkedList<Integer> getS_id() {
        return S_id;
    }

    public void setS_id(Integer S_id) {
        this.S_id .add(S_id);
    }

    public LinkedList<Integer> getT_id() {
        return T_id;
    }

    public void setT_id(Integer T_id) {
        this.T_id .add(T_id);
    }

    public LinkedList<String> getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email.add(email);
    }

    public LinkedList<String> getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password .add(password);
    }

    public LinkedList<String> getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username.add(username);
    }
    public static Verifications instance()
    {
        if(verification==null)
        {
            verification=new Verifications();
        }
        return verification;
    }
}
