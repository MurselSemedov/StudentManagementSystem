package util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileUtility {
    public static void writeObjectToFile(Serializable object,String name)
    {
        try{
        FileOutputStream f=new FileOutputStream(name);
        ObjectOutputStream o=new ObjectOutputStream(f);
       o.writeObject(object);}
        catch(IOException io)
        {
            System.out.println("No file found");
        }
    }
    public static Object readObjectToFile(String name)
    {
        Object obj=null;
        try
        {
            ObjectInputStream o =new ObjectInputStream(new FileInputStream(name));
            obj=o.readObject();
        }
        finally{
            return obj;
        }
    }

    private FileUtility() {
    }
}
