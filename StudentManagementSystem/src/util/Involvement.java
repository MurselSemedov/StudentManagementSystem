package util;
import java.util.Scanner;
public class Involvement {
    public static String toIncludeString(String data)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(data);
        return sc.next(); 
    }
    public static int toIncludeInt(String data)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(data);
        return sc.nextInt(); 
    }
    public static double toIncludeDouble(String data)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(data);
        return sc.nextDouble(); 
    }
}
