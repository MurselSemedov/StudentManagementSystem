package bean;
import java.util.LinkedList;
import util.Input;
public class Verifications {
    private final LinkedList<Integer> S_id=new LinkedList<>();
    private final LinkedList<Integer> T_id=new LinkedList<>();
    private final LinkedList<String> email=new LinkedList<>();
    private final LinkedList<String> password=new LinkedList<>();
    private final LinkedList<String> username=new LinkedList<>();    
    private static Verifications verification=null;
    public  String UsernameVertification()
    {
       String EnterUsername=Input.toIncludeString("Username:");
        while(Verifications.instance().getUsername().contains(EnterUsername))
        {
            EnterUsername=Input.toIncludeString("This username is available. Enter another username:");
        }
        return EnterUsername;
    }
    public  String EmailVertification()
    {
        String EnterEmail=Input.toIncludeString("E-mail:");
        loop1:while(!((EnterEmail.contains("@gmail.com")||EnterEmail.contains("@mail.ru")||EnterEmail.contains("@bk.ru")||EnterEmail.contains("@list.ru"))))
        {
            EnterEmail=Input.toIncludeString("There is no such mail form. Please enter the correct mail:");
            if(Verifications.instance().getEmail().contains(EnterEmail))
            {
            EnterEmail=Input.toIncludeString("This email is available. Enter another email:");    
            } 
        }
        return EnterEmail;
    }
    public  String PasswordVertification()
    {
        String EnterPassword=Input.toIncludeString("Password:");
        while((EnterPassword.length()<8)||
               ! (
                EnterPassword.contains("1")||EnterPassword.contains("2")||EnterPassword.contains("3")||EnterPassword.contains("4")
                ||EnterPassword.contains("5")||EnterPassword.contains("6")||EnterPassword.contains("7")||EnterPassword.contains("8")
                ||EnterPassword.contains("9")||EnterPassword.contains("0")
                ))
        {
            EnterPassword=Input.toIncludeString("This password is available. Enter another password:");
            if(Verifications.instance().getPassword().contains(EnterPassword))
            {
            EnterPassword=Input.toIncludeString("The password must be at least 8 characters and 1 digit, please enter the correct password:");
            }
        }
        return EnterPassword;
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
