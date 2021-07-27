// Hamza Sohrab Work!!!
import java.io.File;
public class NewDirectory {

    public static void main(String args[])
    {
        String dir = "/Users/danishbangash/Desktop/QA/JAVA/Folder";
        File file = new File(dir);
        boolean isFileCreate = file.mkdirs();
        if (isFileCreate == true)
        {
            System.out.println("New Folder is Created");
        }
        else
        {
            System.out.println("New Folder is not Created");
        }
    }
}